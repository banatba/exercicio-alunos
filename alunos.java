import java.util.Scanner;
public class   alunos 
{
    public static void main (String[] args) {
        //Uso do Scanner para entrada de dados
        try (Scanner scan = new Scanner(System.in)){
          //Declara a Array A e atribui a ela o tamanho 8
            double A[] = new double[8];
            //Declara a variável i
            int i;
            //Uso da estrutura de repetição For
            for (i=0; i<8; i++) {
                //Pede para o usuário inserir a quantia de alunos por sala
                System.out.printf("Informe %2da. quantia de alunos: ", (i+1));
                //Entrada de dados de cada Array
                A[i] = scan.nextInt();
            }
            for (i=0; i<8; i++) {
                System.out.printf("A sala "+ (i + 21) +" tem " + A[i] + " alunos\n");
        }
    }

}
}
