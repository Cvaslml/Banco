package modelo;

public class Libreta2022 extends CuentaBancaria{
    
    /// -----------
    /// Constructor 
    /// -----------

    public Libreta2022(double deposito){
        this.deposito = deposito;
    }

    /// -------
    /// Metodos
    /// -------
    public double hallarInteres(){
        deposito = (deposito * 0.08) + deposito;
        return deposito;
    }

    public double retirarFondos()
    {
        retiro = retiro - (retiro * 0.02);
        return this.retiro;
    }


}
