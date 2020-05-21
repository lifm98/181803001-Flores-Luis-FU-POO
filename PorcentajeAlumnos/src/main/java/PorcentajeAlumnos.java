import java.util.*;
public class PorcentajeAlumnos 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double al, rep, p;
        System.out.println("Teclee el numero de alumnos que presentaron el examen");
        al = scan.nextDouble();
        System.out.println("Teclee cuantos alumnos reprobaron el examen");
        rep = scan.nextDouble();
        p = (rep * 100) / al;
        System.out.println("El porcentaje de alumnos reprobados es el: " + p + "%");
    }
}
