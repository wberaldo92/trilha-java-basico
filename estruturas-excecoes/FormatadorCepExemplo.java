public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFromatado = formatCep("23765064");
            System.out.println(cepFromatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            //teste colocando 2376506 com um digito a menos e a aparecer o erro o syst mostra a msg abaixo
            System.out.println("O cep não corresponde com as regras");
        }
    }

    static String formatCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
        throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
