package Persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

public class BancodeDados {
    public static void Insere_TrechoBanco(String nome, String codigo, Boolean ativo) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Carregar o driver JDBC
            Class.forName("org.postgresql.Driver");

            // Estabelecer conexão com o banco de dados
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String usuario = "postgres";
            String senhaBanco = "54321";
            connection = DriverManager.getConnection(url, usuario, senhaBanco);

            // Query SQL para inserção de dados
            String query = "INSERT INTO trechos (nome, codigo, ativo) VALUES (?, ?, ?)";

            // Preparar a declaração SQL
            preparedStatement = connection.prepareStatement(query);

            // Substituir os parâmetros na consulta SQL pelos valores passados como argumentos
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, codigo);
            preparedStatement.setBoolean(3, ativo);

            // Executar a declaração SQL para inserir os dados
            int linhasAfetadas = preparedStatement.executeUpdate();

            // Verificar se a inserção foi bem-sucedida
            if (linhasAfetadas > 0) {
                System.out.println("Dados inseridos com sucesso!");
            } else {
                System.out.println("Nenhum dado foi inserido.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}