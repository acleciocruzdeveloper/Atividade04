import javax.swing.*;

public class Questao01 {

    public static void main(String[] args) {
        String aluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        System.out.println(aluno);

        float notaFinal = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno: "));

        if (notaFinal >= 7 ){
            JOptionPane.showMessageDialog(null, "O aluno "+ aluno + " obteve média: " + notaFinal + " e está aprovado, Parabéns!!!");
        }else if (notaFinal >= 4) {
            JOptionPane.showMessageDialog(null, "O aluno " + aluno + " obteve média: " + notaFinal + " e está de recuperação, Se esforce mais!");
        }else{
            JOptionPane.showMessageDialog(null, "O aluno "+ aluno + " obteve média "+ notaFinal + " Aluno Reprovado!");

        }

    }
}
