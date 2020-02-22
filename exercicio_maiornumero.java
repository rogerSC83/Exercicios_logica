import java.util.Scanner;

class exercicio_maiornumero{
    public static void main( String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();
        System.out.println(" o numero 1 eh " + numero1);
        System.out.println("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.println(" o numero 2 eh " + numero2);

        if ( numero1 > numero2 ) 
            System.out.println( numero1 + " eh maior " );
        else if(numero1 == numero2)
            System.out.println( " Esses numeros saum iguais" );
        else 
        System.out.println(numero2 + " eh maior ");
    }
}
