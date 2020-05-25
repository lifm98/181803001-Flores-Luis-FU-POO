public class Casting 
{
    public static void main(String args[])
    {
        //Casting explícito
        short a = 1;
        int b = 15;
        a = (short)b;
        
        //Casting implícito
        float c = 4.5f;
        double d = 5.6;
        d = c;
        
        //¿Qué pasa con los decimales cuando casteo de flotante a double a entero?
        double pi = 3.7;
        int duda =(int)pi;
        System.out.println("El valor de duda es: " + duda);
        
        //Casting de una variable string
        String valor = "15";
        int n = Integer.parseInt(valor);
        n = n + duda;
        System.out.println(n);
        
        //Ciclo for
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        
        //Ciclo while
        int j = 1;
        while(j < 10)
        {
            System.out.println(j)
        }
        
        //Ciclo do while
        c = 1;
        do
        {
            System.out.println(c);
        }while(c <10);
    }
}
