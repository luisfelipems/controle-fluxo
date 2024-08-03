public class FomatadorCepExemplo {
    
    public static void main(String[] args) {
        
    
        try{
            String cepFormatado = formatarCep("04410110");
            System.out.println(cepFormatado);
        }

        catch(CepInvalidoException e){            
            System.out.println("Há algum problema com o CEP digitado, favor inserir novamente.");
        }

        
        } 

        static String formatarCep(String cep) throws CepInvalidoException{
        
            if(cep.length() != 8)
            throw new CepInvalidoException();
          
            //simulando um cep formatado
            return "23.765-064";
    }
}
