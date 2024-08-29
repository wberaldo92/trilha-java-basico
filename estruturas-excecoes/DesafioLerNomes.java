import java.util.Scanner;

public class DesafioLerNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ler nomes sem espaço em branco e imprimir o terceiro, setimo e nono da lista
        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++)
        nomes[i] = sc.nextLine();

        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
        
        sc.close();
    }
    
}
