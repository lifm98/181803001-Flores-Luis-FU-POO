import java.util.*;
public class MainTarjeta 
{
    public static void main(String args[])
    {    
        Tarjeta tarjeta;
        Scanner scan = new Scanner(System.in);
        int nCuenta, NIP, opc;
        
        System.out.print("Número de cuenta: ");
        nCuenta = scan.nextInt();
        
        System.out.print("NIP: ");
        NIP = scan.nextInt();

        tarjeta = new Tarjeta().verificarCuenta(nCuenta, NIP);
        
        System.out.println("Bienvenido " + tarjeta.nombre);
        
        //System.out.println("Informacipon de la cuenta \n" + tarjeta.toString());
        
        do
        {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1.- Depósito");
            System.out.println("2.- Retiro");
            System.out.println("3.- Eliminar apartado");
            System.out.println("4.- Imprimir los datos de su cuenta");
            System.out.println("5.- Salir");
            System.out.print("Opción: ");
            opc = scan.nextInt();
            
            switch(opc)
            {
                case 1:
                    System.out.print("Monto a depositar: ");
                    tarjeta.Deposito(scan.nextDouble());
                    break;
                    
                case 2:
                    System.out.print("Monto a retirar: ");
                    tarjeta.Retiro(scan.nextDouble());
                    break;
                    
                case 3:
                    tarjeta.EliminarApartado();
                    System.out.println("Apartado eliminado con éxito");
                    break;
                
                case 4:
                    System.out.println(tarjeta.toString());
                    break;
            }
        }while(opc != 5);
        System.out.println("Hasta luego! Fue un placer atenderle");
    }
}
