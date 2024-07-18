public class ExemploForArray {
    
    public static void main(String[] args) {
        
        //em arrays o indice inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        
        for (int x=0; x<alunos.length; x++) {

            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);

        }

        //ou de uma forma mais agradável de trabalhar com array
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
