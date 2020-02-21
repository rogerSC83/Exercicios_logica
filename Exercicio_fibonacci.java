class Exercicio_fibonacci{
     public static void main(String[] args) {
      int a = 0;
      int b = 1;
      int aux = 0;
      
      while (a<100) {
          System.out.println(a);
          aux = a + b;
          a = b;
          b = aux;          
      }
    }
}
