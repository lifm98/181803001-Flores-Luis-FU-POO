import java.util.*;
public class Avisos 
{
    String id;
    String tipoAviso;
    String titulo;
    String autor;
    String texto;
    String resumen;
    String fechaP;
    String fechaA;
    String fechaF;
    String estatus;
    
    public void id(){}
    public void tipoAviso(){}
    public void titulo(){}
    public void autor(){}
    public void texto(){}
    public void resumen(){}
    public void fechaP(){}
    public void fechaA(){}
    public void fechaF(){}
    public void estatus(){}

    @Override
    public String toString() {
        return "Avisos:" + "\nid: " + id + "\nTipo de aviso: " + tipoAviso + "\nTítulo: " + titulo 
                + "\nAutor: " + autor + "\nTexto: " + texto + "\nResumen: " + resumen 
                + "\nFecha de publicación: " + fechaP + "\nFecha alta: " + fechaA 
                + "\nFecha finalización: " + fechaF + "\nEstatus: " + estatus;
    }
    
    
}
