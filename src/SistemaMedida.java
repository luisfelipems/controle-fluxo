public class SistemaMedida {
    
    public static void main(String[] args) {
        
        // Criando um sistema com IF e ELSE onde será impresso o tamanho conforme o valor da variável sigla.

        String sigla = "A";

		if(sigla == "P")
			System.out.println("PEQUENO");

		else if(sigla == "M")
			System.out.println("MÉDIO");

		else if(sigla == "G")
			System.out.println("GRANDE");

		else
			System.out.println("INDEFINIDO");
    }
}
