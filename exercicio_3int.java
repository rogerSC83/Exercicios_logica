import java.util.Scanner;

class exercicio_3int{
    public static void main( String[] args){
        int soma;
        int media;
        int produto;
        int aux;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();
        System.out.println(" o numero 1 eh " + numero1);
        System.out.println("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.println(" o numero 2 eh " + numero2);
        System.out.println("Digite o terceiro numero: ");
        int numero3 = entrada.nextInt();
        System.out.println(" o numero 3 eh " + numero3);
        soma = numero1 + numero2 + numero3;
        System.out.println("a soma eh " + soma);
        media = soma / 3;
        System.out.println("a media eh" + media);
        produto = numero1 * numero2 * numero3;
        System.out.println("o produto eh" + produto);

        if ( numero1 > numero2 ) 
        aux = numero1;
        else
        aux = numero2;
        if ( numero3 > aux)
        System.out.println("O maior numero eh " + numero3);
        else
        System.out.println("O maior numero eh " + aux);

        if ( numero1 < numero2 ) 
        aux = numero1;
        else
        aux = numero2;
        if ( numero3 < aux)
        System.out.println("O menor numero eh " + numero3);
        else
        System.out.println("O menor numero eh " + aux);
        if (( numero1 == numero2) && ( numero2 == numero3))
        System.out.println("Todos os numeros sao iguais");
        
}
}
