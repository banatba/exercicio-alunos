import java.util.Scanner;
public class   alunos2 
{
    public static void main (String[] args) {
        
        //Uso do Scanner para entrada de dados
        try (Scanner scan = new Scanner(System.in)) {
            
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

        //Operação que realiza o cáculo da média
        double media = ((A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] + A[7]) / 8);
       
        //Informa ao usuário qual a média aritmética dos alunos
        System.out.println("A media de alunos por sala e: " + media);
                
        //Uso da estrutura de repetição For
        for (i=0; i<8; i++) {

            //Condicional que determina e informa se a sala tem a quantia de alunos acima da média
            if (A[i] < media)
            System.out.printf("A sala "+ (i + 21) +" tem " + A[i] + " alunos, tem a quantia de alunos abaixo da media\n");
            else
            System.out.printf("A sala "+ (i + 21) +" tem " + A[i] + " alunos, tem a quantia de alunos acima da media\n");
          }
        }
    }

}
}
