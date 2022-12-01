package modelo;

public class CuentaCorriente extends CuentaBancaria{

    private double pago;
        
    /// -----------
    /// Constructor 
    /// -----------

    public CuentaCorriente(double deposito, double pago){
        this.deposito = deposito;
        this.pago = pago;
    }

    /// -------
    /// Metodos
    /// -------
    public double pagar(){
        pago = deposito - pago;
        return pago;
    }

}
