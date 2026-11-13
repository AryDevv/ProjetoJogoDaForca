
package d;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class TelaEntrarComo extends JFrame {

    private JPanel painel;
    private JButton btAdministrador;
    private JButton btJogador;

    public TelaEntrarComo() {
        configurarJanela();
        criarComponentes();
        configurarOuvintes();
    }

    private void configurarJanela() {
        setTitle("Entrar Como");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(11, 66, 0));

        add(painel);
    }

    private void criarComponentes() {

        JLabel lbTitulo = new JLabel("ENTRAR COMO");
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(325, 90, 230, 50);
        lbTitulo.setFont(new Font("Arial", Font.PLAIN, 26));
        painel.add(lbTitulo);

        btAdministrador = new JButton("ADMINISTRADOR");
        btAdministrador.setBounds(325, 155, 200, 40);
        btAdministrador.setBackground(new Color(11, 66, 0));
        btAdministrador.setForeground(Color.WHITE);
        painel.add(btAdministrador);

        btJogador = new JButton("JOGADOR");
        btJogador.setBounds(325, 205, 200, 40);
        btJogador.setBackground(new Color(11, 66, 0));
        btJogador.setForeground(Color.WHITE);
        painel.add(btJogador);

        ImageIcon imagem = new ImageIcon("imagem.png");

        Image imagemMenor = imagem.getImage()
                .getScaledInstance(200, 200, Image.SCALE_SMOOTH);

        ImageIcon fotoMenor = new ImageIcon(imagemMenor);

        JLabel lbImagem = new JLabel(fotoMenor);
        lbImagem.setBounds(50, 100, 250, 200);
        painel.add(lbImagem);
    }

    private void configurarOuvintes() {

        btAdministrador.addActionListener(e -> {
            abrirTelaProvisoria("ADMINISTRADOR");
        });

        btJogador.addActionListener(e -> {
            abrirTelaProvisoria("JOGADOR");
        });
    }

    private void abrirTelaProvisoria(String perfil) {

        JFrame tela = new JFrame("Login - " + perfil);
        tela.setSize(600, 400);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.setLayout(null);

        tela.getContentPane().setBackground(
                new Color(11, 66, 0));

        JLabel titulo = new JLabel("LOGIN - " + perfil);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.PLAIN, 26));
        titulo.setBounds(150, 80, 350, 50);
        tela.add(titulo);

        JButton btVoltar = new JButton("VOLTAR");
        btVoltar.setBounds(200, 230, 200, 40);
        tela.add(btVoltar);

        btVoltar.addActionListener(e -> {
            TelaEntrarComo j = new TelaEntrarComo();
            j.setVisible(true);
            tela.dispose();
        });

        tela.setVisible(true);
        dispose();
    }

    // TESTE, TIRAR NO FUTURO
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            System.out.println(
                "Não foi possível aplicar o look and feel: "
                + e.getMessage()
            );
        }

        TelaEntrarComo j = new TelaEntrarComo();
        j.setVisible(true);
    }
}
