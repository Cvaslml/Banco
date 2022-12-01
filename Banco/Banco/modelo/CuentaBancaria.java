package modelo;

public class CuentaBancaria {
    /// ---------
    /// Atributos
    /// ---------
    protected double retiro;
    protected double deposito;

    /// -----------
    /// Constructor
    /// -----------
    public CuentaBancaria(){
        this.deposito = 0;
        this.retiro = 0;
    }
    
    /// -------
    /// Metodos
    /// -------
    public double retirarFondos()
    {
        return this.retiro;
    }

    public double hacerDepositos()
    {
        return this.deposito;
    }
    
}
