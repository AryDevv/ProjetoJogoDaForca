import javax.swing.UIManager;

public class TelaCadastro {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Não foi possível aplicar o look and feel: " + e.getMessage());
        }
        
        
    }
}
