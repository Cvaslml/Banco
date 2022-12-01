package modelo;

public class CuentaAhorros extends CuentaBancaria{
    
    /// -----------
    /// Constructor 
    /// -----------
    public CuentaAhorros(double deposito){
        this.deposito = deposito;
    }

    /// -------
    /// Metodos
    /// -------
    public double hallarInteres(){
        deposito = (deposito * 0.04) + deposito;
        return deposito;
    }

}
