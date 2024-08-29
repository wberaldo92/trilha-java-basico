import java.util.Scanner;

public class DesafioMarteloThor {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int c = leitor.nextInt();
        String nome;

        for (int i = 0; i < c; i++){
            nome = leitor.next();
            if (nome.equals("Thor")) System.out.println("Y");
            else System.out.println("N");
        }
        leitor.close();
    }
}
