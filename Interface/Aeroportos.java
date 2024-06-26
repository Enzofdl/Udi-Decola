package Interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.*;

import Trecho.*;


public class Aeroportos {

    private JFrame frmUdidecola;
    private JTextField combTestador;
    
    private int pagina = 0;
    private int qtd = 0;
    private int inicio = 1000;

    public static void main(String[] args) {
        Aeroportos window = new Aeroportos();
        window.frmUdidecola.setVisible(true);
    }

    public void setVisible(boolean a) {
        frmUdidecola.setVisible(a);
    }
    public Aeroportos() {
        initialize();
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
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\marco\\IdeaProjects\\Udi-Decola\\Design UdiDecola\\Logotipo\\01 - Imagem 01 - EDITADA (COM GRADIENTE).png");
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


        JLabel label = new JLabel(new ImageIcon("C:\\Users\\marco\\IdeaProjects\\Udi-Decola\\Design UdiDecola\\Logotipo\\Logo FINAL reduzida.png"));
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
		
		//Array list que contem todos os trechos.
		ArrayList <Trechos> vetTrechos = DadosTrecho.retornatrechos();
		//Array list que irá conter os nomes dos aeroportos.
		ArrayList <String> nomeAeroporto = new ArrayList <String>();
		
		
		for(Trechos x : vetTrechos) {
			//Array list dos trechos é percorrida e compara-se os aeroportos para evitar repetições.
			if(nomeAeroporto.contains(x.getOrigem().getNome())) continue;
			else nomeAeroporto.add(x.getOrigem().getNome());
		}
		
		//Converte array list para array de string
		String[] arrayAeroporto = nomeAeroporto.toArray(new String[nomeAeroporto.size()]);
		
		//Cria um JComboBox do tipo string, que contem a string arrayAeroporto. Ou seja, contém os nomes dos aeroportos.
		JComboBox <String> aeroportos = new JComboBox<> (arrayAeroporto);
		aeroportos.setBounds(309, 129, 144, 22);
		contentPane.add(aeroportos);

        JButton removerbut = new JButton("Remover Trecho");
        removerbut.setBounds(533, 129, 150, 22);
        removerbut.setVisible(true);
        removerbut.setBackground(new Color(255, 0, 0, 50));
        removerbut.setOpaque(false);
        contentPane.add(removerbut);

        JFrame remover = new JFrame(){

            protected void paintComponent(Graphics g) {
                super.paint(g);
                // Desenhar o degradê
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                Color startColor = new Color(0, 113, 27); // Cor inicial do degradê
                Color endColor = new Color(109, 245, 142); // Cor final do degradê
                g2d.setPaint(new java.awt.GradientPaint(0, 0, startColor, 0, getHeight(), endColor));
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.dispose();


            }
        };
        remover.setSize(300, 200);
        remover.setName("Remover Trecho");
        remover.setTitle("Remover Trecho");
        remover.setResizable(false);



        removerbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> trechosremove = new JComboBox<>();
                ArrayList<Trechos> treechos = DadosTrecho.retornacom((String)aeroportos.getSelectedItem());
                for(Trechos x : treechos){
                    String nome;
                    nome = x.getNome();
                    trechosremove.addItem(nome);
                }
                aeroportos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        trechosremove.removeAllItems();

                        String aero = (String) aeroportos.getSelectedItem();

                        ArrayList<Trechos> treechos = DadosTrecho.retornacom(aero);
                        for (Trechos x : treechos) {
                            String nome = x.getNome();
                            trechosremove.addItem(nome);
                        }
                    }
                });
                trechosremove.setBounds(50, 40, 200, 20);
                trechosremove.setVisible(true);
                remover.add(trechosremove);
                JButton confirma = new JButton("Confirmar");
                JButton cancela = new JButton("Cancelar");
                confirma.setBounds(50, 75, 100, 20);
                cancela.setBounds(160, 75, 100, 20);
                confirma.setVisible(true);
                cancela.setVisible(true);
                confirma.setOpaque(false);
                cancela.setOpaque(false);
                remover.add(confirma);
                remover.add(cancela);
                remover.setLayout(null);
               remover.setVisible(true);
                confirma.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Trechos aremover = null;
                        for(int i =0; i < treechos.size(); i++) {
                            if(treechos.get(i).getNome() == trechosremove.getSelectedItem()) { aremover = treechos.get(i); break;}
                        }
                        DadosTrecho.Remove((String) trechosremove.getSelectedItem());
                        frmUdidecola.dispose();
                        Aeroportos janelaSobre = new Aeroportos();
                        janelaSobre.initialize();
                        janelaSobre.setVisible(true);
                        remover.dispose();



                    }

                });
                cancela.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        remover.dispose();

                    }
                });


            }
        });

		
		JPanel trechosPanel = new JPanel();
		trechosPanel.setBounds(117, 220, 566, 300);
		trechosPanel.setOpaque(false);
		trechosPanel.setLayout(null);
		contentPane.add(trechosPanel);
		
		
		Button avancar = new Button(">");
		avancar.setForeground(Color.WHITE);
		avancar.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		avancar.setBackground(Color.DARK_GRAY);
		avancar.setBounds(640, 526, 43, 29);
		contentPane.add(avancar);
		
		Button voltar = new Button("<");
		voltar.setForeground(Color.WHITE);
		voltar.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		voltar.setBackground(Color.DARK_GRAY);
		voltar.setBounds(591, 526, 43, 29);
		contentPane.add(voltar);

        avancar.setEnabled(vetTrechos.size() > (inicio+6));
        avancar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if((qtd - inicio+6) > 0) {
                    pagina++;
                    System.out.println(pagina);
                    exibirAeroportos((String) aeroportos.getSelectedItem(), trechosPanel, vetTrechos, avancar, voltar, contentPane);
                }
            }

        });
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pagina > 0) {
                    pagina--;
                    exibirAeroportos((String) aeroportos.getSelectedItem(), trechosPanel, vetTrechos, avancar, voltar, contentPane);
                }
            }
        });
		
		
		
		aeroportos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                qtd = 0;
                ArrayList<Trechos> arr = DadosTrecho.retornatrechos();
                for (Trechos trechos : arr) {
                    if (Objects.equals((String) aeroportos.getSelectedItem(), trechos.getOrigem().getNome())) qtd++;
                }
				exibirAeroportos((String) aeroportos.getSelectedItem(), trechosPanel, vetTrechos, avancar, voltar, contentPane);
			}
			
		});
		
		exibirAeroportos((String) aeroportos.getSelectedItem(), trechosPanel, vetTrechos, avancar, voltar, contentPane);
		

		
	}

    private void exibirAeroportos(String opcao, JPanel trechosPanel, ArrayList <Trechos> vetTrechos, Button avancar, Button voltar, JPanel contentPane){
    	trechosPanel.removeAll();
    	//Contador para organização dos objetos na janela e para passar a página.
        ArrayList<Trechos> r = DadosTrecho.retornacom(opcao);
    	inicio = pagina*6;
    	int fim = Math.min(inicio+6, r.size());
    	int j = 0;



    	for(int i = inicio; i < fim; i++)  {

    		//Pega o trecho que será printado nesse instante.
    		Trechos trechoAtual = r.get(i);

    		//Se o aeroporto em questão for igual ao aeroporto do trecho percorrido, então...
    		if (opcao.equals(trechoAtual.getOrigem().getNome()))	{
    			JLabel trechoLabel = new JLabel("Trecho " + trechoAtual.getNome());
    			trechoLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
    			trechoLabel.setForeground(Color.WHITE);
    			trechoLabel.setBounds(10, 42*j, 80, 25);

    			JLabel partidaLabel = new JLabel(trechoAtual.getOrigem().getNome());
    			partidaLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
    			partidaLabel.setForeground(Color.WHITE);
    			partidaLabel.setBounds(200, 42*j, 80, 25);

    			JLabel setaLabel = new JLabel("->");
    			setaLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
    			setaLabel.setForeground(Color.WHITE);
    			setaLabel.setBounds(300, 42*j, 80, 25);

    			JLabel destinoLabel = new JLabel(trechoAtual.getDestino().getNome());
    			destinoLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
    			destinoLabel.setForeground(Color.WHITE);
            	destinoLabel.setBounds(330, 42*j, 80, 25);


            	JPanel Fundo = new JPanel();
            	Fundo.setOpaque(true);
            	Fundo.setToolTipText("");
            	Fundo.setBackground(new Color(12, 128, 40));
            	Fundo.setBounds(0, 42*j, 566, 39);
            	Fundo.setLayout(null);

            	trechosPanel.add(trechoLabel);
            	trechosPanel.add(partidaLabel);
            	trechosPanel.add(setaLabel);
            	trechosPanel.add(destinoLabel);
            	trechosPanel.add(Fundo);
            	j++;
    		}

    	}
    	trechosPanel.revalidate();
        trechosPanel.repaint();

        //Avançar acontece apenas enquanto inicio+6 (ultimo elemento) for menor que o tamanho do array. Não é possível ter mais elementos que o tamanho do array.

        //Não é possivel ir para uma pagina negativa



    }
}
