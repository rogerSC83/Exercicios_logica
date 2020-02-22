import java.util.Scanner;
class exercicio_op{
    public static void main( String[] args) {
        double soma;
        double sub;
        double mult;
        double div;
        double resto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();
        System.out.printf("%f \n", numero1);
        System.out.println("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();
        System.out.printf("%f \n", numero2);
        soma = numero1 + numero2;
        System.out.printf("%f \n", soma);
        sub = numero1 - numero2;
        System.out.printf("%f \n", sub);
        mult = numero1 * numero2;
        System.out.printf("%f \n", mult);
        div = numero1 / numero2;
        System.out.printf("%f \n", div);
        resto = numero1 % numero2;
        System.out.printf("%f \n", resto);

    }
}