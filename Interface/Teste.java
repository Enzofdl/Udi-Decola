package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Label;

public class Teste {

	

    private JFrame frmUdidecola;

    public void setVisible(boolean a) {
    	frmUdidecola.setVisible(a);
    }
    public void initialize() {
	Dadostrecho.inicializar();
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
		/*
		aeroporto.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		Aeroporto janelaSobre = new Aeroporto();
        		janelaSobre.initialize();
        		janelaSobre.setVisible(true);
        		frmUdidecola.dispose();
        	}
        	
        	
        	
        });*/
		
		
        

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
