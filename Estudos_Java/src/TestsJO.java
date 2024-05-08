import javax.swing.JOptionPane;

public class TestsJO {
    /*
        Revisar depois como funciona o OptionPane e sua utilização no como interface visual do java,
        dependendo de como for posso já começar a criar interfaces para os projetos sem depender
        do JavaFX
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe Seu nome: ");

        System.out.println(nome);
    }
}