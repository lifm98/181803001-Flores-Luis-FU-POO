import java.util.*;
public class CalificacionAlumno 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double al, cues, c, pt, t, par, p, cal;
        System.out.println("Teclee el numero de alumnos");
        al = scan.nextDouble();
        for(int i = 0; i < al; i++)
        {
            System.out.println("Teclee la calificación del cuestionario");
            cues = scan.nextDouble();
            c = (cues * 40) / 10;
            System.out.println("Teclee la calificación de prácticas y tareas");
            pt = scan.nextDouble();
            t = (pt * 40) / 10;
            System.out.println("Teclee la calificación de participaciones");
            par = scan.nextDouble();
            p = (par * 20) / 10;
            cal = (c + t + p) / 10;
            System.out.println("La calificación final del alumno es: " + cal);
        }
    }
}
