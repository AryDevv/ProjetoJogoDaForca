import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTitulo{ 
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Não foi possível aplicar o look and feel: " + e.getMessage());
        }

        JFrame janela = new JFrame("Tela Inicial");
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
            painel.setBackground(new Color(11, 66, 0));
            JLabel lbtituloDoJogo = new JLabel("FORCA");
            lbtituloDoJogo.setForeground(Color.WHITE);
            lbtituloDoJogo.setBounds(345,30,150,100);
            lbtituloDoJogo.setFont(new Font("Arial", Font.PLAIN, 30));
            janela.add(lbtituloDoJogo);

            JButton btJogar = new JButton("JOGAR");
            btJogar.setBounds(325, 155, 150, 40);
            btJogar.setBackground(new Color(11, 66, 0));
            btJogar.addActionListener(e -> {
                TelaEscolha j = new TelaEscolha();
                j.setVisible(true);
                janela.dispose();
            });
            janela.add(btJogar);

            JButton btOpcoes = new JButton("OPÇÕES");
            btOpcoes.setBounds(325, 205, 150, 40);
            btOpcoes.setBackground(new Color(11, 66, 0));
            janela.add(btOpcoes);

            JButton btSair = new JButton("SAIR");
            btSair.setBounds(325, 255, 150,40);
            btSair.setBackground(new Color(11, 66, 0));
            janela.add(btSair);
            btSair.addActionListener(e -> {System.exit(0);});

            JButton btRanking = new JButton("RANKING");
            btRanking.setBounds(445, 300, 100, 40);
            btRanking.setBackground(Color.YELLOW);
            janela.add(btRanking);
            btRanking.addActionListener(e -> {
            TelaRanking j = new TelaRanking();
            j.setVisible(true);
        });

            ImageIcon imagem = new ImageIcon("imagem.png");
            Image imagemMenor = imagem.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon fotoMenor = new ImageIcon(imagemMenor);
            JLabel lbImagem = new JLabel(fotoMenor);
            lbImagem.setBounds(50, 100, 250, 200);
            janela.add(lbImagem);

        janela.add(painel);
        janela.setVisible(true);
    }

}