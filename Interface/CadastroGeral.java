package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Aeroporto.*;
import Compras.*;
import Diarias.*;
import Empresa.*;
import Pesquisa.*;
import Pessoa.*;
import Trecho.*;
import Voo.*;


public class CadastroGeral {

    private JFrame frmUdidecola;

    public static void main(String[] args) {
        CadastroGeral window = new CadastroGeral();
        window.frmUdidecola.setVisible(true);
    }

    public CadastroGeral() {
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

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(117, 120, 566, 348);
        panel_1.setOpaque(false);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Cliente", "Funcionario", "Aeroporto", "Hotel", "Companhia", "Trecho", "Voo"});
        comboBox.setBounds(10, 10, 150, 20);
        panel_1.add(comboBox);

        JPanel formularioPanel = new JPanel();
        formularioPanel.setBounds(10, 40, 546, 248);
        formularioPanel.setOpaque(false);
        formularioPanel.setLayout(null);
        panel_1.add(formularioPanel);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirFormularioCadastro((String) comboBox.getSelectedItem(), formularioPanel);
            }
        });

        // Exibe o formulário de cadastro padrão
        exibirFormularioCadastro((String) comboBox.getSelectedItem(), formularioPanel);

    }

    private void exibirFormularioCadastro(String opcao, JPanel formularioPanel) {
        // Limpa o painel antes de adicionar novos componentes
        formularioPanel.removeAll();

        if (opcao.equals("Cliente")) {
            JLabel nomeLabel = new JLabel("Nome:");
            nomeLabel.setBounds(10, 10, 80, 20);
            JTextField nomeField = new JTextField(20);
            nomeField.setOpaque(false);
            nomeField.setBounds(120, 10, 300, 20);

            JLabel cpfLabel = new JLabel("CPF:");
            cpfLabel.setBounds(10, 40, 80, 20);
            JTextField cpfField = new JTextField(14); 
            cpfField.setBounds(120, 40, 300, 20);
            cpfField.setOpaque(false);

            JLabel emailLabel = new JLabel("Email:");
            emailLabel.setBounds(10, 70, 80, 20);
            JTextField emailField = new JTextField(30);
            emailField.setBounds(120, 70, 300, 20);
            emailField.setOpaque(false);
            
            JLabel enderecoLabel = new JLabel("Endereço:");
            enderecoLabel.setBounds(10, 100, 80, 20);
            JTextField enderecoField = new JTextField(50);
            enderecoField.setOpaque(false);
            enderecoField.setBounds(120, 100, 300, 20);

            JLabel dataNascimentoLabel = new JLabel("Data Nascimento:");
            dataNascimentoLabel.setBounds(10, 130, 120, 20);
            JComboBox <Integer> dia, mes, ano;
            dia = new JComboBox<>();
            mes = new JComboBox<>();
            ano = new JComboBox<>();
            dia.setBounds(120, 130, 40, 20);
            dia.setOpaque(false);
            mes.setBounds(165, 130, 40, 20);
            mes.setOpaque(false);
            ano.setBounds(210, 130, 80, 20);
            ano.setOpaque(false);
            for(int i =1; i<=31; i++) {
            	dia.addItem(i);
            }
            for(int i =1; i<=12; i++) {
            	mes.addItem(i);
            }
            for(int i =2024; i>=1920; i--) {
            	ano.addItem(i);
            }

            JButton okButton = new JButton("OK");
            okButton.setBounds(340, 160, 80, 20);
            okButton.setOpaque(false);
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = nomeField.getText();
                    String cpf = cpfField.getText();
                    String email = emailField.getText();
                    String endereco = enderecoField.getText();
                   // Data_nv a = new Data_nv(Integer.parseInt(dia.getName()), Integer.parseInt(mes.getName()), Integer.parseInt(ano.getName()));

                   // DadosClientes.InsereCliente(new Clientes(nome, cpf, a, endereco, email));
                }
            });

            formularioPanel.add(nomeLabel);
            formularioPanel.add(nomeField);
            formularioPanel.add(cpfLabel);
            formularioPanel.add(cpfField);
            formularioPanel.add(emailLabel);
            formularioPanel.add(emailField);
            formularioPanel.add(enderecoLabel);
            formularioPanel.add(enderecoField);
            formularioPanel.add(dataNascimentoLabel);
            formularioPanel.add(dia);
            formularioPanel.add(mes);
            formularioPanel.add(ano);
            formularioPanel.add(okButton);
        }
        
        
        
        // ----------------------------------------------------------------------------------------------------------
        
        
        
        
        
        
        
        else if (opcao.equals("Funcionario")) {
        	
        	JLabel nomeLabel = new JLabel("Nome:");
            nomeLabel.setBounds(10, 10, 80, 20);
            JTextField nomeField = new JTextField(20);
            nomeField.setOpaque(false);
            nomeField.setBounds(120, 10, 300, 20);

            JLabel cpfLabel = new JLabel("CPF:");
            cpfLabel.setBounds(10, 40, 80, 20);
            JTextField cpfField = new JTextField(14); 
            cpfField.setBounds(120, 40, 170, 20);
            cpfField.setOpaque(false);
            
            JLabel carteiraLabel = new JLabel("Clt:");
            carteiraLabel.setBounds(300, 40, 60, 20);
            JTextField carteiraField = new JTextField(12);
            carteiraField.setBounds(340, 40, 80, 20);
            carteiraField.setOpaque(false);
            
            JLabel emailLabel = new JLabel("Email:");
            emailLabel.setBounds(10, 70, 80, 20);
            JTextField emailField = new JTextField(30);
            emailField.setBounds(120, 70, 300, 20);
            emailField.setOpaque(false);
            
            JLabel enderecoLabel = new JLabel("Endereço:");
            enderecoLabel.setBounds(10, 100, 80, 20);
            JTextField enderecoField = new JTextField(50);
            enderecoField.setOpaque(false);
            enderecoField.setBounds(120, 100, 300, 20);

            JLabel dataNascimentoLabel = new JLabel("Data Nascimento:");
            dataNascimentoLabel.setBounds(10, 130, 120, 20);
            JLabel salarioLabel  = new JLabel("Salário:");
            salarioLabel.setBounds(300, 130, 60, 20);
            JTextField salarioField = new JTextField(12);
            salarioField.setBounds(360, 130, 60, 20);
            salarioField.setOpaque(false);
            
            JComboBox <Integer> dia, mes, ano;
            dia = new JComboBox<>();
            mes = new JComboBox<>();
            ano = new JComboBox<>();
            dia.setBounds(120, 130, 40, 20);
            dia.setOpaque(false);
            mes.setBounds(165, 130, 40, 20);
            mes.setOpaque(false);
            ano.setBounds(210, 130, 80, 20);
            ano.setOpaque(false);
            for(int i =1; i<=31; i++) {
            	dia.addItem(i);
            }
            for(int i =1; i<=12; i++) {
            	mes.addItem(i);
            }
            for(int i =2024; i>=1920; i--) {
            	ano.addItem(i);
            }

            JButton okButton = new JButton("OK");
            okButton.setBounds(340, 160, 80, 20);
            okButton.setOpaque(false);
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = nomeField.getText();
                    String cpf = cpfField.getText();
                    String email = emailField.getText();
                    String endereco = enderecoField.getText();
                    String clt = "0.00";
                    clt = carteiraField.getText();
                    String salario = salarioField.getText();
                    Data_nv a = new Data_nv(0, 0, 0);
                    DadoFuncionario.Cadastrar(new Funcionarios(nome, cpf, a, endereco, clt, Double.parseDouble(salario)));
                }
            });

            formularioPanel.add(nomeLabel);
            formularioPanel.add(nomeField);
            formularioPanel.add(cpfLabel);
            formularioPanel.add(cpfField);
            formularioPanel.add(carteiraField);
            formularioPanel.add(carteiraLabel);
            formularioPanel.add(emailLabel);
            formularioPanel.add(emailField);
            formularioPanel.add(enderecoLabel);
            formularioPanel.add(enderecoField);
            formularioPanel.add(dataNascimentoLabel);
            formularioPanel.add(dia);
            formularioPanel.add(mes);
            formularioPanel.add(ano);
            formularioPanel.add(salarioLabel);
            formularioPanel.add(salarioField);
            formularioPanel.add(okButton);
        }
        else if (opcao.equals("Aeroporto")) {
        	
        	JLabel nomeLabel = new JLabel("Nome:");
            nomeLabel.setBounds(10, 10, 80, 20);
            JTextField nomeField = new JTextField(20);
            nomeField.setOpaque(false);
            nomeField.setBounds(120, 10, 300, 20);

            JLabel cidadeLabel = new JLabel("Cidade:");
            cidadeLabel.setBounds(10, 40, 80, 20);
            JTextField cidadeField = new JTextField(14); 
            cidadeField.setBounds(120, 40, 170, 20);
            cidadeField.setOpaque(false);
            
         
            JButton okButton = new JButton("OK");
            okButton.setBounds(340, 160, 80, 20);
            okButton.setOpaque(false);
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = nomeField.getText();
                    String cpf = cidadeField.getText();
                     DadosAeroporto.cadastrar(new Aeroporto(nome, cpf, new ArrayList<>()));
                }
            });

            formularioPanel.add(nomeLabel);
            formularioPanel.add(nomeField);
            formularioPanel.add(cidadeLabel);
            formularioPanel.add(cidadeField);
            formularioPanel.add(cidadeField);
            formularioPanel.add(cidadeLabel);
            formularioPanel.add(okButton);
        }
        
        
        
        
        
        else if (opcao.equals("Hotel")) {
        	
        	JLabel nomeLabel = new JLabel("Nome:");
            nomeLabel.setBounds(10, 10, 80, 20);
            JTextField nomeField = new JTextField(20);
            nomeField.setOpaque(false);
            nomeField.setBounds(120, 10, 300, 20);

            JLabel cpfLabel = new JLabel("Nome Fantasia:");
            cpfLabel.setBounds(10, 40, 100, 20);
            JTextField cpfField = new JTextField(14); 
            cpfField.setBounds(120, 40, 170, 20);
            cpfField.setOpaque(false);
            
            JLabel carteiraLabel = new JLabel("CNPJ:");
            carteiraLabel.setBounds(300, 40, 60, 20);
            JTextField carteiraField = new JTextField(12);
            carteiraField.setBounds(340, 40, 80, 20);
            carteiraField.setOpaque(false);
            
            JLabel petsLabel = new JLabel("Pets:");
            petsLabel.setBounds(120, 70, 80, 20);
            ButtonGroup petField = new ButtonGroup();
            JRadioButton opA = new JRadioButton("Sim");
            JRadioButton opB = new JRadioButton("Não");
            opA.setOpaque(false);
            opA.setBounds(160, 70, 60, 20);
            opB.setOpaque(false);
            opB.setBounds(220, 70, 60, 20);
            petField.add(opA);
            petField.add(opB);
            
            
            JLabel quartosLabel = new JLabel("Nº Quartos:");
            quartosLabel.setBounds(300, 70, 70, 20);
            JTextField quartosField = new JTextField(12);
            quartosField.setBounds(370, 70, 50, 20);
            quartosField.setOpaque(false);
            
            JLabel enderecoLabel = new JLabel("Endereço:");
            enderecoLabel.setBounds(10, 100, 80, 20);
            JTextField enderecoField = new JTextField(50);
            enderecoField.setOpaque(false);
            enderecoField.setBounds(120, 100, 300, 20);

            JLabel dataNascimentoLabel = new JLabel("Data Criação:");
            dataNascimentoLabel.setBounds(10, 130, 120, 20);
            
            JComboBox <Integer> dia, mes, ano;
            dia = new JComboBox<>();
            mes = new JComboBox<>();
            ano = new JComboBox<>();
            dia.setBounds(120, 130, 40, 20);
            dia.setOpaque(false);
            mes.setBounds(165, 130, 40, 20);
            mes.setOpaque(false);
            ano.setBounds(210, 130, 80, 20);
            ano.setOpaque(false);
            for(int i =1; i<=31; i++) {
            	dia.addItem(i);
            }
            for(int i =1; i<=12; i++) {
            	mes.addItem(i);
            }
            for(int i =2024; i>=1900; i--) {
            	ano.addItem(i);
            }

            JButton okButton = new JButton("OK");
            okButton.setBounds(340, 160, 80, 20);
            okButton.setOpaque(false);
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = nomeField.getText();
                    String nomef =cpfField.getText();

                    String cnpj = carteiraField.getText();
                    boolean a;
                    if(petField.equals(opA)) a = true;
                    else a = false;
                    String endereco = enderecoField.getText();
                    String data = dia.getSelectedItem() + "/" + mes.getSelectedItem() + "/" + ano.getSelectedItem();
                    DadosHoteis.Cadastrar(new Hoteis(cnpj, nome, nomef, data, endereco, (float) 3.0, a));
                }
            });

            formularioPanel.add(nomeLabel);
            formularioPanel.add(nomeField);
            formularioPanel.add(cpfLabel);
            formularioPanel.add(cpfField);
            formularioPanel.add(carteiraField);
            formularioPanel.add(carteiraLabel);
            formularioPanel.add(opA);
            formularioPanel.add(petsLabel);
            formularioPanel.add(opB);
            formularioPanel.add(quartosLabel);
            formularioPanel.add(quartosField);
            formularioPanel.add(enderecoLabel);
            formularioPanel.add(enderecoField);
            formularioPanel.add(dataNascimentoLabel);
            formularioPanel.add(dia);
            formularioPanel.add(mes);
            formularioPanel.add(ano);
            formularioPanel.add(okButton);
        }
        
        
        
        
        
        
        
        else if (opcao.equals("Companhia")) {
        	
        	JLabel nomeLabel = new JLabel("Nome:");
            nomeLabel.setBounds(10, 10, 80, 20);
            JTextField nomeField = new JTextField(20);
            nomeField.setOpaque(false);
            nomeField.setBounds(120, 10, 300, 20);

            JLabel cpfLabel = new JLabel("Nome Fantasia:");
            cpfLabel.setBounds(10, 40, 100, 20);
            JTextField cpfField = new JTextField(14); 
            cpfField.setBounds(120, 40, 170, 20);
            cpfField.setOpaque(false);
            
            JLabel carteiraLabel = new JLabel("CNPJ:");
            carteiraLabel.setBounds(300, 40, 60, 20);
            JTextField carteiraField = new JTextField(12);
            carteiraField.setBounds(340, 40, 80, 20);
            carteiraField.setOpaque(false);
            
         
    
            JLabel quartosLabel = new JLabel("Desconto Para VIPS (%):");
            quartosLabel.setBounds(120, 70, 170, 20);
            JTextField quartosField = new JTextField(12);
            quartosField.setBounds(340, 70, 50, 20);
            quartosField.setOpaque(false);
            
            JLabel enderecoLabel = new JLabel("Endereço:");
            enderecoLabel.setBounds(10, 100, 80, 20);
            JTextField enderecoField = new JTextField(50);
            enderecoField.setOpaque(false);
            enderecoField.setBounds(120, 100, 300, 20);

            JLabel dataNascimentoLabel = new JLabel("Data Criação:");
            dataNascimentoLabel.setBounds(10, 130, 120, 20);
            
            JComboBox <Integer> dia, mes, ano;
            dia = new JComboBox<>();
            mes = new JComboBox<>();
            ano = new JComboBox<>();
            dia.setBounds(120, 130, 40, 20);
            dia.setOpaque(false);
            mes.setBounds(165, 130, 40, 20);
            mes.setOpaque(false);
            ano.setBounds(210, 130, 80, 20);
            ano.setOpaque(false);
            for(int i =1; i<=31; i++) {
            	dia.addItem(i);
            }
            for(int i =1; i<=12; i++) {
            	mes.addItem(i);
            }
            for(int i =2024; i>=1900; i--) {
            	ano.addItem(i);
            }

            JButton okButton = new JButton("OK");
            okButton.setBounds(340, 160, 80, 20);
            okButton.setOpaque(false);
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = nomeField.getText();
                    String nomef =cpfField.getText();
                    String cnpj = carteiraField.getText();

                    String endereco = enderecoField.getText();
                    String desconto = quartosField.getText();
                    String data = dia.getSelectedItem() + "/" + mes.getSelectedItem() + "/" + ano.getSelectedItem();

                }
            });

            formularioPanel.add(nomeLabel);
            formularioPanel.add(nomeField);
            formularioPanel.add(cpfLabel);
            formularioPanel.add(cpfField);
            formularioPanel.add(carteiraField);
            formularioPanel.add(carteiraLabel);

            formularioPanel.add(quartosLabel);
            formularioPanel.add(quartosField);
            formularioPanel.add(enderecoLabel);
            formularioPanel.add(enderecoField);
            formularioPanel.add(dataNascimentoLabel);
            formularioPanel.add(dia);
            formularioPanel.add(mes);
            formularioPanel.add(ano);
            formularioPanel.add(okButton);
        }
        
        else if (opcao.equals("Trecho")) {
        	
        	JLabel nomeLabel = new JLabel("Nome:");
            nomeLabel.setBounds(10, 10, 80, 20);
            JTextField nomeField = new JTextField(20);
            nomeField.setOpaque(false);
            nomeField.setBounds(120, 10, 300, 20);

            JLabel cpfLabel = new JLabel("Origem:");
            cpfLabel.setBounds(120, 40, 70, 20);
            JComboBox <Aeroporto> origemField = new JComboBox<>();
            ArrayList<Aeroporto> aux;
            aux = DadosAeroporto.retornaaero();
            for(int i = 0 ; i<aux.size(); i++){
                origemField.addItem(aux.get(i));
            }

            origemField.setBounds(170, 40, 90, 20);
            
            
            JLabel carteiraLabel = new JLabel("Destino:");
            carteiraLabel.setBounds(280, 40, 80, 20);
            JTextField carteiraField = new JTextField(12);
            JComboBox <Aeroporto> destinoField = new JComboBox<>();
            ArrayList<Aeroporto> auxx;
            auxx = DadosAeroporto.retornaaero();
            for(int i = 0; i<auxx.size(); i++){
                destinoField.addItem(auxx.get(i));
            }
            destinoField.setBounds(330, 40, 90, 20);
            
         
    
            JLabel quartosLabel = new JLabel("Código:");
            quartosLabel.setBounds(120, 70, 170, 20);
            JTextField quartosField = new JTextField(12);
            quartosField.setBounds(350, 70, 70, 20);
            quartosField.setOpaque(false);
            
            JCheckBox ativo = new JCheckBox("Ativo");
            ativo.setBounds(120, 100, 70, 20);
            ativo.setOpaque(false);
            
          

            JButton okButton = new JButton("OK");
            okButton.setBounds(340, 160, 80, 20);
            okButton.setOpaque(false);
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = nomeField.getText();
                    Aeroporto ori = (Aeroporto) origemField.getSelectedItem();
                    Aeroporto destin = (Aeroporto) destinoField.getSelectedItem();
                    String cod = quartosField.getText();
                    boolean atv = ativo.isSelected();
                    Trechos aux = new Trechos(ori, destin, nome, cod);

                    DadosTrecho.Inserir(aux);
                }
            });

            formularioPanel.add(nomeLabel);
            formularioPanel.add(nomeField);
            formularioPanel.add(cpfLabel);
            
            formularioPanel.add(origemField);
            formularioPanel.add(destinoField);
            formularioPanel.add(carteiraField);
            formularioPanel.add(carteiraLabel);
            formularioPanel.add(quartosLabel);
            formularioPanel.add(quartosField);
            formularioPanel.add(ativo);
            
            formularioPanel.add(okButton);
        }

        
        
        
        
        else if (opcao.equals("Voo")) {
        	
        	JLabel nomeLabel = new JLabel("Trecho:");
            nomeLabel.setBounds(10, 10, 80, 20);
            JComboBox <Trechos> trechoField = new JComboBox<>();
            trechoField.setBounds(120, 10, 100, 20);
            ArrayList<Trechos> a;
            a = DadosTrecho.retornatrechos();
            for(int i =0; i<a.size(); i++){
                trechoField.addItem(a.get(i));
            }

           
         
    
            JLabel quartosLabel = new JLabel("Preço:");
            quartosLabel.setBounds(10, 40, 170, 20);
            JTextField quartosField = new JTextField(12);
            quartosField.setBounds(120, 40, 70, 20);
            quartosField.setOpaque(false);
            
            JLabel dataLabel = new JLabel("Data:");
            dataLabel.setBounds(10, 70, 120, 20);
            
            JComboBox <Integer> dia, mes, ano;
            dia = new JComboBox<>();
            mes = new JComboBox<>();
            ano = new JComboBox<>();
            dia.setBounds(120, 70, 40, 20);
            dia.setOpaque(false);
            mes.setBounds(165, 70, 40, 20);
            mes.setOpaque(false);
            ano.setBounds(210, 70, 80, 20);
            ano.setOpaque(false);
            for(int i =1; i<=31; i++) {
            	dia.addItem(i);
            }
            for(int i =1; i<=12; i++) {
            	mes.addItem(i);
            }
            for(int i =2024; i>=1900; i--) {
            	ano.addItem(i);
            }
            
            JCheckBox ativo = new JCheckBox("Ativo");
            ativo.setBounds(120, 100, 70, 20);
            ativo.setOpaque(false);
            
          

            JButton okButton = new JButton("OK");
            okButton.setBounds(340, 160, 80, 20);
            okButton.setOpaque(false);
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Data_nv a = new Data_nv((int) dia.getSelectedItem(), (int) mes.getSelectedItem(), (int) ano.getSelectedItem());
                    DadosVoo.Cadastra(new Voo((Trechos)trechoField.getSelectedItem(), a, Double.parseDouble(quartosField.getText()), ativo.isSelected()));

                }
            });

            formularioPanel.add(nomeLabel);
            formularioPanel.add(dataLabel);
            formularioPanel.add(trechoField);
            formularioPanel.add(dia);
            formularioPanel.add(mes);
            formularioPanel.add(ano);
            
            formularioPanel.add(quartosLabel);
            formularioPanel.add(quartosField);
            formularioPanel.add(ativo);
            
            formularioPanel.add(okButton);
        }
        
        
        
        
        
        
        

        // Atualiza o layout do painel de formulário
        formularioPanel.revalidate();
        formularioPanel.repaint();
    }

}
