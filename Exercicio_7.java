class Exercicio_7{
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 10;
        int media = (nota1 + nota2) / 2;

        if (media == 10) 
            System.out.println("Aprovado" + " com Distinção!!!");            
        
        else if ( media <10 && media >= 7) 
            System.out.println("Aprovado!"); 
        
        else 
            System.out.println("Reprovado.");
        
        
    }
}
        
    