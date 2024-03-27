package interfaceteste;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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

public class Teste {

    private JFrame frmUdidecola;

    public static void main(String[] args) {
        Teste window = new Teste();
        window.frmUdidecola.setVisible(true);
    }

    public Teste() {
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
		
		JPanel chamad = new JPanel();
		chamad.setOpaque(false);
		chamad.setBounds(254, 202, 293, 138);
		contentPane.add(chamad);
		chamad.setLayout(null);
		
		JLabel label_1 = new JLabel("Boas Vindas,");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setBounds(0, 0, 293, 22);
		label_1.setAlignmentX(Label.CENTER);
		chamad.add(label_1);
		
		JLabel label_1_1 = new JLabel("<Usuário>!");
		label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		label_1_1.setAlignmentX(Label.CENTER);
		label_1_1.setBounds(0, 23, 293, 63);
		chamad.add(label_1_1);
	}
}
