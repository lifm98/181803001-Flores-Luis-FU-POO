public class Personaje 
{
    int vida;
    String nombre;
    AK arma;
    
    public Personaje()
    {
      this.vida = 100;
    }
    
    public Personaje(String nombre)
    {
        this();
        this.nombre = nombre;
    }
    
    public void equiparArma(int valor)
    {
        switch(valor)
        {
            case 1:
                this.arma = new AK("Bronce", 5, 75, 5, 1000, 10);
                break;
                
            case 2:
                this.arma = new AK("Plata", 8, 70, 4.5, 2300, 11);
                break;
                
            case 3:
                this.arma = new AK("Oro", 10, 85, 4.3, 2500, 13);
                break;
                
            case 4:
                this.arma = new AK("Diamante", 20, 95, 3, 4000, 20);
                break;
                
            case 5:
                this.arma = new AK("Admanatium", 30, 100, 1, 10000, 27);
                break;
        }
    }

    @Override
    public String toString() {
        return "Personaje{" + "vida=" + vida + ", nombre=" + nombre + ", arma=" + arma + '}';
    }
}
