package Interface;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.JTextArea;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class Sobre {

    private JFrame frmUdidecola;

    public static void main(String[] args) {
        Sobre window = new Sobre();
        window.frmUdidecola.setVisible(true);
    }

    public Sobre() {
        initialize();
    }

    private void initialize() {
        frmUdidecola = new JFrame();
        frmUdidecola.setTitle("UdiDecola");
        frmUdidecola.setAutoRequestFocus(false);
        frmUdidecola.setName("UdiDecola");
        frmUdidecola.setResizable(false);
        frmUdidecola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmUdidecola.setSize(800, 600);

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

                // Adicionar imagem de fundo
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\filip\\OneDrive\\Área de Trabalho\\Design UdiDecola\\Logotipo");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frmUdidecola.setContentPane(contentPane);
        contentPane.setLayout(null);

        // Seu conteúdo da interface aqui
        JPanel Header = new JPanel();
        Header.setBounds(0, 0, 800, 70);
        Header.setOpaque(false); // Tornar o painel transparente para que o degradê e a imagem de fundo sejam visíveis
        Header.setPreferredSize(new Dimension(800, 70));
        Header.setLayout(null);
        contentPane.add(Header);
		
		JPanel Linha_Header = new JPanel();
		Linha_Header.setBounds(0, 67, 800, 3);
		Linha_Header.setBackground(new Color(21, 190, 38));
		Linha_Header.setPreferredSize(new Dimension(800, 3));
		Header.add(Linha_Header);
		
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
		
		Button button = new Button("Inicio");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.DARK_GRAY);
		button.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		button.setBounds(410, 35, 43, 18);
		Header.add(button);
		
		Button button_1 = new Button("Sobre");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(492, 35, 43, 18);
		Header.add(button_1);
		
		Button button_1_1 = new Button("Serviços");
		button_1_1.setForeground(Color.WHITE);
		button_1_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		button_1_1.setBackground(Color.DARK_GRAY);
		button_1_1.setBounds(580, 35, 71, 18);
		Header.add(button_1_1);
		
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
		
		JLabel lblNewLabel = new JLabel("Projeto feito na UFU");
		lblNewLabel.setFont(new Font("MS Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(31, 50, 306, 24);
		UFU.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel()
				{
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

                // Adicionar imagem de fundo
                ImageIcon imageIcon = new ImageIcon("C://Users//Caio//Downloads//Udi-Decola-main//Udi-Decola-main//Design%20UdiDecola//Assets//Ufu_logo.svg");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				}
				};
		panel_1.setBounds(406, 0, 120, 120);
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
		
		JLabel lblNewLabel_1 = new JLabel("Projeito feito em Java");
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(210, 52, 306, 24);
		UFU_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel() {
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

                // Adicionar imagem de fundo
                ImageIcon imageIcon = new ImageIcon("C://Users//Caio//Downloads//Udi-Decola-main//Udi-Decola-main//Design%20UdiDecola//Assets//Ufu_logo.svg");
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
		
		JLabel lblNewLabel_2 = new JLabel("Projeto feito por Bernardo Tibaldi, Caio Henrique, Enzo Faria e Marcos Paulo");
		lblNewLabel_2.setFont(new Font("MS Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(30, 50, 400, 20);
		UFU_2.add(lblNewLabel_2);
		
		JPanel panel_1_2 = new JPanel() {
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

                // Adicionar imagem de fundo
                ImageIcon imageIcon = new ImageIcon("C://Users//Caio//Downloads//Udi-Decola-main//Udi-Decola-main//Design%20UdiDecola//Assets//Ufu_logo.svg");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				}
				};
		panel_1_2.setBounds(406, 0, 120, 120);
		UFU_2.add(panel_1_2);
	}
}
