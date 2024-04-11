package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Trecho.*;
import Aeroporto.*;

public class Sobre {

    private JFrame frmUdidecola;

    public static void main(String[] args) {
        Sobre window = new Sobre();
        window.frmUdidecola.setVisible(true);
    }

    public Sobre() {
        initialize();
    }
    public void setVisible(boolean a) {
    	frmUdidecola.setVisible(a);
    }

    public void initialize() {
        DadosTrecho.Inicializar();
        frmUdidecola = new JFrame();
        frmUdidecola.setTitle("UdiDecola");
        frmUdidecola.setAutoRequestFocus(true);
        frmUdidecola.setName("UdiDecola");
        frmUdidecola.setResizable(false);
        frmUdidecola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frmUdidecola.set
        frmUdidecola.setSize(800, 600);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular posição central
        int centerX = (int) ((screenSize.getWidth() - frmUdidecola.getWidth()) / 2);
        int centerY = (int) ((screenSize.getHeight() - frmUdidecola.getHeight()) / 2);

        // Definir a posição da janela como central
        frmUdidecola.setLocation(centerX, centerY);

        // Painel principal com layout personalizado para adicionar degradê e imagem de fundo
        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Desenhar o degradê
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                Color startColor = new Color(0, 113, 27); // Cor inicial do degradê
                Color endColor = new Color(109, 245, 142); // Cor final do degradê
                g2d.setPaint(new java.awt.GradientPaint(0, 0, startColor, 0, getHeight(), endColor));
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.dispose();

                this.setOpaque(false);
                // Adicionar imagem de fundo
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\filip\\OneDrive\\Área de Trabalho\\Design UdiDecola\\Logotipo\\01 - Imagem 01 - EDITADA (COM GRADIENTE).png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };


        frmUdidecola.setContentPane(contentPane);


        contentPane.setLayout(null);





        JPanel servicos = new JPanel();
        servicos.setBounds(610, 55, 120, 40);
        servicos.setLayout(null);
        servicos.setOpaque(false);
        servicos.setVisible(false);
        frmUdidecola.getContentPane().add(servicos);
        JButton cadastro = new JButton("Cadastros");
        JButton aeroporto = new JButton("Aeroportos");
        cadastro.setAlignmentX(cadastro.CENTER);
        aeroporto.setAlignmentX(aeroporto.CENTER);
        cadastro.setBounds(0, 0, 120, 20);
        aeroporto.setBounds(0, 20, 120, 20);
        cadastro.setOpaque(false);
        aeroporto.setOpaque(false);
        cadastro.setBackground(new Color(0,0,0,0));
        aeroporto.setBackground(new Color(0,0,0,0));
        cadastro.setForeground(new Color(255, 255, 255, 255));
        aeroporto.setForeground(new Color(255, 255, 255, 255));
        cadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroGeral janelaSobre = new CadastroGeral();
                janelaSobre.initialize();
                janelaSobre.setVisible(true);
                frmUdidecola.dispose();
            }



        });
        servicos.add(cadastro);
        servicos.add(aeroporto);





        // Seu conteúdo da interface aqui
        JPanel Header = new JPanel();
        Header.setBounds(0, 0, 800, 70);
        Header.setOpaque(false); // Tornar o painel transparente para que o degradê e a imagem de fundo sejam visíveis
        Header.setPreferredSize(new Dimension(800, 70));
        Header.setLayout(null);
        contentPane.add(Header);



        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setSize(new Dimension(121, 62));
        panel.setMinimumSize(new Dimension(121, 62));
        panel.setPreferredSize(new Dimension(121, 62));
        panel.setBounds(38, 4, 195, 62);
        panel.setAlignmentX(-30.0f);
        panel.setBackground(Color.GREEN);
        Header.add(panel);
        panel.setLayout(null);


        JLabel label = new JLabel(new ImageIcon("C:\\Users\\filip\\OneDrive\\Área de Trabalho\\Design UdiDecola\\Logotipo\\Logo FINAL reduzida.png"));
        label.setBackground(Color.LIGHT_GRAY);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setSize(new Dimension(121, 62));
        label.setPreferredSize(new Dimension(121, 62));
        label.setMinimumSize(new Dimension(121, 62));
        label.setMaximumSize(new Dimension(121, 62));

        label.setBounds(0, 0, 216, 62);
        panel.add(label);

        JButton button = new JButton("Inicio");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Criar e exibir a nova janela
                Teste janelaInicial = new Teste();
                janelaInicial.initialize();
                janelaInicial.setVisible(true);
                frmUdidecola.dispose();

            }
        });
        button.setForeground(Color.WHITE);
        button.setBackground(Color.DARK_GRAY);
        button.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
        button.setAlignmentX(button.CENTER);
        button.setBounds(350, 35, 120, 20);
        button.setOpaque(false);
        Header.add(button);

        JButton button_1 = new JButton("Sobre");
        button_1.setForeground(Color.WHITE);
        button_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
        button_1.setBackground(Color.DARK_GRAY);
        button_1.setAlignmentX(button_1.CENTER);
        button_1.setBounds(480, 35, 120, 20);
        button_1.setOpaque(false);
        Header.add(button_1);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sobre janelaSobre = new Sobre();
                janelaSobre.initialize();
                janelaSobre.setVisible(true);
                frmUdidecola.dispose();
            }



        });

        aeroporto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aeroportos janelaSobre = new Aeroportos();
                janelaSobre.initialize();
                janelaSobre.setVisible(true);
                frmUdidecola.dispose();
            }



        });




        JButton button_1_1 = new JButton("Serviços");
        button_1_1.setForeground(Color.WHITE);
        button_1_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
        button_1_1.setAlignmentX(button_1_1.CENTER);
        button_1_1.setBackground(Color.DARK_GRAY);
        button_1_1.setBounds(610, 35, 120, 20);
        button_1_1.setOpaque(false);
        Header.add(button_1_1);
        JPanel Linha_Header = new JPanel();
        Linha_Header.setBounds(0, 67, 800, 3);
        Linha_Header.setBackground(new Color(21, 190, 38));
        Linha_Header.setPreferredSize(new Dimension(800, 3));
        Header.add(Linha_Header);
        button_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(servicos.isVisible()) {servicos.setVisible(false);}
                else {

                    servicos.setVisible(true);

                }


            }


        });
		
		JPanel UFU = new JPanel()
				{
			 @Override
			    protected void paintComponent(Graphics g) {
			        // Chama o método paintComponent da superclasse para garantir que a funcionalidade padrão seja preservada
			        super.paintComponent(g);

			        // Obtém as dimensões da JLabel
			        int width = getWidth();
			        int height = getHeight();

			        // Cria um gradiente de canal alfa da esquerda para a direita
			        GradientPaint gradient = new GradientPaint(0, 0, new Color(91, 239, 173, 100), width, 0, new Color(255, 255, 255, 0));

			        // Cria um objeto Graphics2D a partir do objeto Graphics passado como argumento
			        Graphics2D g2d = (Graphics2D) g.create();

			        // Define o gradiente como o pincel de desenho
			        g2d.setPaint(gradient);

			        // Preenche um retângulo com o gradiente
			        g2d.fillRect(0, 0, width, height);

			        // Libera o recurso gráfico
			        g2d.dispose();
			    }
				};
				
				UFU.setOpaque(false);
		UFU.setToolTipText("");
		UFU.setBackground(new Color(0, 204, 51));
		UFU.setBounds(137, 130, 526, 120);
		contentPane.add(UFU);
		UFU.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Projeto feito pela<br>Universidade Federal de Uberlândia.</html>");
		lblNewLabel.setFont(new Font("MS Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(31, 20, 400, 70);
		UFU.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel()
				{
			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
               
                // Adicionar imagem de fundo
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\filip\\OneDrive\\Área de Trabalho\\Design UdiDecola\\Assets\\Ufu_logo.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				}
				};
				
		panel_1.setBounds(406, 0, 120, 120);
		panel_1.setOpaque(false);
		UFU.add(panel_1);
		
		JPanel UFU_1 = new JPanel() {
			
				 @Override
				    protected void paintComponent(Graphics g) {
				        // Chama o método paintComponent da superclasse para garantir que a funcionalidade padrão seja preservada
				        super.paintComponent(g);

				        // Obtém as dimensões da JLabel
				        int width = getWidth();
				        int height = getHeight();

				        // Cria um gradiente de canal alfa da esquerda para a direita
				        GradientPaint gradient = new GradientPaint(0, 0, new Color(255, 255, 255, 0), width, 0, new Color(91, 239, 173, 100));

				        // Cria um objeto Graphics2D a partir do objeto Graphics passado como argumento
				        Graphics2D g2d = (Graphics2D) g.create();

				        // Define o gradiente como o pincel de desenho
				        g2d.setPaint(gradient);

				        // Preenche um retângulo com o gradiente
				        g2d.fillRect(0, 0, width, height);

				        // Libera o recurso gráfico
				        g2d.dispose();
				    }
					};
		UFU_1.setLayout(null);
		UFU_1.setToolTipText("");
		UFU_1.setOpaque(false);
		UFU_1.setBackground(new Color(0, 204, 51));
		UFU_1.setBounds(137, 264, 526, 120);
		contentPane.add(UFU_1);
		
		JLabel lblNewLabel_1 = new JLabel("Desenvolvido e criado em Java");
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(210, 52, 306, 24);
		UFU_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel() {
			@Override
            protected void paintComponent(Graphics g) {
              
                // Adicionar imagem de fundo
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\filip\\OneDrive\\Área de Trabalho\\Design UdiDecola\\Assets\\Java_logo.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				}
				};
	
		panel_1_1.setBounds(0, 0, 120, 120);
		UFU_1.add(panel_1_1);
		
		JPanel UFU_2 = new JPanel() {
			 @Override
			    protected void paintComponent(Graphics g) {
			        // Chama o método paintComponent da superclasse para garantir que a funcionalidade padrão seja preservada
			        super.paintComponent(g);

			        // Obtém as dimensões da JLabel
			        int width = getWidth();
			        int height = getHeight();

			        // Cria um gradiente de canal alfa da esquerda para a direita
			        GradientPaint gradient = new GradientPaint(0, 0, new Color(91, 239, 173, 100), width, 0, new Color(255, 255, 255, 0));

			        // Cria um objeto Graphics2D a partir do objeto Graphics passado como argumento
			        Graphics2D g2d = (Graphics2D) g.create();

			        // Define o gradiente como o pincel de desenho
			        g2d.setPaint(gradient);

			        // Preenche um retângulo com o gradiente
			        g2d.fillRect(0, 0, width, height);

			        // Libera o recurso gráfico
			        g2d.dispose();
			    }
				};
		UFU_2.setLayout(null);
		UFU_2.setToolTipText("");
		UFU_2.setOpaque(false);
		UFU_2.setBackground(new Color(0, 204, 51));
		UFU_2.setBounds(137, 398, 526, 120);
		contentPane.add(UFU_2);
		
		JLabel lblNewLabel_2 = new JLabel("<html>Feito por<br>Bernardo Tibaldi, Caio Henrique,<br>Enzo Faria e Marcos Paulo.</html>");
		lblNewLabel_2.setFont(new Font("MS Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(30, 20, 400, 70);
		UFU_2.add(lblNewLabel_2);
		
		JPanel panel_1_2 = new JPanel() {
			@Override
            protected void paintComponent(Graphics g) {
                
                // Adicionar imagem de fundo
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\filip\\OneDrive\\Área de Trabalho\\Design UdiDecola\\Assets\\Github_logo.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				}
				};
		panel_1_2.setBounds(406, 0, 120, 120);
		UFU_2.add(panel_1_2);
	}
}
