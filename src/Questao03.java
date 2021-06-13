import javax.swing.*;

public class Questao03 {
    public static void main(String[] args) {
        int contador1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int contador2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        StringBuilder contar = new StringBuilder();

        if( contador1 > contador2){
            for (int i = contador2; i < contador1; i++ ) {
                contar.append(i).append(", ");
            }
            {
                JOptionPane.showMessageDialog(null,"Os números entre: "+ contador1+ " e: "+ contador2 + "São: "+ contar);
            }
        }
    }

}
