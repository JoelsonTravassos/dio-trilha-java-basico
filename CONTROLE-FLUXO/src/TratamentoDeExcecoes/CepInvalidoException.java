package TratamentoDeExcecoes;

public class CepInvalidoException extends Exception {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("22555554");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep invalido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return cep;
    }
}
