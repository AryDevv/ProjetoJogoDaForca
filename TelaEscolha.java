import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class TelaEscolha extends JFrame {
    public TelaEscolha() {
        configurarJanela();
        botoes();
        textos();
    }

    public void configurarJanela() {
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            System.out.println("Não foi possível aplicar o look and feel: "
                    + e.getMessage());
        }

        setTitle("Tela De Escolha");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(11, 66, 0));
    }

    public void textos() {
        JLabel rank = new JLabel("ESCOLHA");
        rank.setBounds(200, 50, 150, 50);
        rank.setForeground(new Color(255,255,255));
        rank.setFont(new Font("Arial", Font.PLAIN, 30));
        add(rank);
    }

    public void botoes() {
        JButton btVoltar = new JButton("ADMINISTRADOR");
        btVoltar.setBounds(199, 150, 200, 40);
        add(btVoltar);

        btVoltar.addActionListener(e -> {
            TelaTitulo _ = new TelaTitulo();
            dispose();
        });

        JButton btOrdenar = new JButton("JOGADOR");
        btOrdenar.setBounds(199, 200, 200, 40);
        add(btOrdenar);

        btOrdenar.addActionListener(e -> {});
    }
}