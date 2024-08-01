public class SistemaMedida {
    
    public static void main(String[] args) {
        
        // Criando um sistema com SWITCH e CASE onde será impresso o tamanho conforme o valor da variável sigla.

        String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}
