public class AK 
{
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int daño;
    
    public AK(String tipo, int cargador, int precision, double velocidadCarga, double precio, int daño)
    {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.daño = daño;
    }
    
    
    public String disparar()
    {
        return "Te estoy disparando con un daño de: " + daño + " puntos"; 
    }
    
    public void apuntar()
    {
        
    }
    public void recargar()
    {
        
    }

    @Override

   
    public String toString() {
        return "AK{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", Daño reaalizado con el arma" + daño + '}';
    }
    
}