import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class TelaRanking extends JFrame {

    public TelaRanking() {
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

        setTitle("Tela Ranking");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(11, 66, 0));
    }

    public void textos() {
        JLabel rank = new JLabel("Ranking:");
        rank.setBounds(130, 50, 100, 40);
        rank.setForeground(new Color(255,255,255));
        add(rank);
    }

    public void botoes() {
        JButton btVoltar = new JButton("VOLTAR");
        btVoltar.setBounds(150, 300, 100, 40);
        add(btVoltar);

        btVoltar.addActionListener(e -> {
            TelaTitulo _ = new TelaTitulo();
            dispose();
        });

        JButton btOrdenar = new JButton("ORDENAR");
        btOrdenar.setBounds(260, 300, 100, 40);
        add(btOrdenar);

        btOrdenar.addActionListener(e -> {});

        JButton btCancelar = new JButton("SAIR");
        btCancelar.setBounds(370, 300, 100, 40);
        add(btCancelar);

        btCancelar.addActionListener(e -> {
            System.exit(0);});
    }
}