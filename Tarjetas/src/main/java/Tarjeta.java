public class Tarjeta 
{
    int nCuenta;
    int NIP;
    String nombre;
    int dia, mes, año;
    int cv;
    double monto;
    double apartado;
    
    public Tarjeta(){}
    
    public Tarjeta(int nCuenta, int NIP, String nombre, int dia, int mes, int año, int cv, double monto, double apartado)
    {
        this.nCuenta = nCuenta;
        this.NIP = NIP;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.cv = cv;
        this.monto = monto;
        this.apartado = apartado;
        
        
    }

    public Tarjeta verificarCuenta(int nCuenta, int NIP)
    {
        if(nCuenta == 123123 && NIP == 1133)
        {
            return new Tarjeta(123123, 1133, "Eduardo Díaz Flores",31,12,2032, 543, 45987.22, 550);
        }
        else if(nCuenta == 456789 && NIP == 3367)
        {    
            return new Tarjeta(456789, 3367, "Kevin Meza González",31,12,2032, 544, 360, 5322.23);
        }
        else
            return new Tarjeta() ;
    }
    
    public void Deposito(double monto)
    {
        this.monto += monto;
    }
    
    public void Retiro(double monto)
    {
        this.monto -= monto;
    }
    
    public void EliminarApartado()
    {
        apartado -= apartado;
    }
    
    public double Total()
    {
        return this.monto + this.apartado;
    }

    @Override
    public String toString() {
        return " nCuenta=" + nCuenta + "\n nombre= " + nombre + "\n Fecha de vencimiento" 
                + dia + "/" + mes + "/" + año + "\n cv= " + cv + "\n monto=" + monto + "\n apartado= " + apartado + "\n Total=" 
                + this.Total();
    }
    
    //Eduardo Días flores cuenta 123 123, nip 1133, tarjeta 154302002, vencimiento 31/12/2032, cv 543, monto 45987.22, apartado 550
    //Kevin Mesa Gonzales cuenta 456789, nip 3367, 1502003, vencimiento 31/12/2032, cv 544, monto 360, apartado 5322.23
}
