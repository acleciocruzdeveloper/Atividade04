import javax.swing.*;

public class Questao04 {
    public static void main(String[] args) {
        int tentativa = 1;

        String senhaUser = JOptionPane.showInputDialog("Digite a senha de acesso");

        if (senhaUser.equals("Java-2021")) {
            JOptionPane.showMessageDialog(null, "Acesso liberado");

        } else {
            for (int i = tentativa; i <= 4; i++)
                JOptionPane.showInputDialog(null,"Senha não confere, Tente novamente");
            JOptionPane.showMessageDialog(null,"Não foi possível acessar", "Alerta", JOptionPane.ERROR_MESSAGE);
        }

    }

}
