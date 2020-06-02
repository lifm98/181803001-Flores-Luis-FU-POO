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
    
    public void verificarCuenta(int nCuenta, int NIP)
    {
        if(nCuenta == 123123 && NIP == 1133)
        {
            System.out.println("Eres la cuenta de Eduardo Díaz Flores");
            Tarjeta Eduardo = new Tarjeta(123123, 1133, "Eduardo Díaz Flores",31,12,2032, 543, 45987.22, 550);
            System.out.println(Eduardo.toString());
        }
        else if(nCuenta == 456789 && NIP == 3367)
        {
            System.out.println("Eres la cuenta de Kevin Mesa González");
            Tarjeta Kevin = new Tarjeta(456789, 3367, "Kevin Mesa González",31,12,2032, 544, 360, 5322.23);
            System.out.println(Kevin.toString());
        }
        else
            System.out.println("El cliente no existe");
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
