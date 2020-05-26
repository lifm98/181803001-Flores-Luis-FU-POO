public class BancoMain 
{
    public static void main(String args[])
    {
        Tarjetas morada = new Tarjetas();
        morada.tipo = "Tarjeta morada";
        morada.puntos = 9;
        
        Tarjetas estudiante = new Tarjetas();
        estudiante.tipo = "Tarjtea de estudiante";
        estudiante.puntos = 3;
        
        Tarjetas especial = new Tarjetas();
        especial.tipo = "Tarjeta Búho Especial";
        especial.puntos = 12;
        
        Tarjetas docente = new Tarjetas();
        docente.tipo = "Tarjeta Docente";
        docente.puntos = 3;
        
        Tarjetas oro = new Tarjetas();
        oro.tipo = "Tarjeta Búho Blanco de Oro";
        oro.puntos = 15;
        
        System.out.println(morada.toString());
        System.out.println(estudiante.toString());
        System.out.println(especial.toString());
        System.out.println(docente.toString());
        System.out.println(oro.toString());
    }
}