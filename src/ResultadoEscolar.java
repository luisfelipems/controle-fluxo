public class ResultadoEscolar {
    
    public static void main(String[] args) {
        
        int nota = 6;
       
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		
        /* 
        * Declarando a variável resultado e atribuindo o seu valor de acordo com 
        * a condição da expressão ternária. Se a nota for maior ou igual a 7, a 
        * variável receberá o valor de "Aprovado", se a nota for menor que 7 e
        * maior ou igual a 5, o valor de resultado será "Recuperação". Caso contrário,
        * o valor da variável resultado será "Reprovado".
        */

        System.out.println(resultado); // Impressão do valor da variável resultado.

    }
}
