import javax.swing.*;

class UI {
    JFrame window;

    UI(){
        window = new JFrame("My name");
        window.setLayout(null);
        window.setSize(500,600);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(window, "Success","Title",JOptionPane.INFORMATION_MESSAGE);
    }
}

public class Start{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String name;
        int age;
        name = JOptionPane.showInputDialog(null,"Informe o nome:",null);
        age =  Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade: ",null));
        sb.append("Nome: "+name).append("\nIdade: "+age);
        JOptionPane.showMessageDialog(null,sb);

    }
}