public class FormatadorCepExemple {

    public static void main(String[] args){

        try{
            String cepFormatado = formatarCep("237650648");
            System.out.println(cepFormatado);
        } catch(CepInvalidoException e){
            System.out.println("O cep não segue as regras de négocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            return "23.765-064";
    }
    
}
