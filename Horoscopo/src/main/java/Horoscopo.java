import java.util.*;
public class Horoscopo 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int dia, mes;
        System.out.println("Para determinar tu horoscopo (signo sodiacal), teclea tu fecha de nacimiento");
        System.out.print("Día");
        dia = scan.nextInt();
        System.out.println("Para el mes, teclea:\n1 para enero\n2 para febrero\n3 para marzo\n4 para abrir"
                + "\n5 para mayo\n6 para junio\n7 para julio\n8 para agosto\n9 para septiembre\n10 para ocutbre\n11 para noviembre\n12 para diciembre");
        System.out.print("Mes");
        mes = scan.nextInt();
        switch(mes)
        {
            case 1:
                if(dia <= 19)
                    System.out.println("Usted es Capricornio");
                if(dia >= 20)
                    System.out.println("Usted es Acuario");
                break;
            case 2:
                if(dia <= 18)
                    System.out.println("Usted es Acuario");
                else
                    System.out.println("Usted es Pisicis");
                break;
            case 3:
                if(dia <= 20)
                    System.out.println("Usted es Pisicis");
                else if(dia >=21 && dia <=29)
                    System.out.println("Usted es Aries");
                if(dia >29)
                    System.out.println("No existe ese día");
                break;
            case 4:
                if(dia <= 20)
                    System.out.println("Usted es Aries");
                else
                    System.out.println("Usted es Tauro");
                break;
            case 5:
                if(dia <= 20)
                    System.out.println("Usted es Tauro");
                else
                    System.out.println("Usted es Géminis");
                break;
            case 6:
                if(dia <= 20)
                    System.out.println("Usted es Géminis");
                else
                    System.out.println("Usted es Cáncer");
                break;
            case 7:
                if(dia <=20)
                    System.out.println("Usted es Cáncer");
                else
                    System.out.println("Usted es Leo");
                break;
            case 8:
                if(dia <= 21)
                    System.out.println("Usted es Leo");
                else
                    System.out.println("Usted es Virgo");
                break;
            case 9:
                if(dia <= 22)
                    System.out.println("Usted es Virgo");
                else
                    System.out.println("Usted es Libra");
                break;
            case 10:
                if(dia <= 22)
                    System.out.println("Usted es Libra");
                else
                    System.out.println("Usted es Escorpio");
                break;
            case 11:
                if(dia <= 23)
                    System.out.println("Usted es Escorpio");
                else
                    System.out.println("Usted es Sagitario");
                break;
            case 12:
                if(dia <= 21)
                    System.out.println("Usted es Sagitario");
                else
                    System.out.println("Usted es Capricornio");
                
        }
    }
}
