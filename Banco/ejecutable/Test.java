package ejecutable;

import javax.swing.JOptionPane;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;
import modelo.Libreta2022;

public class Test {
    public static void main(String[] args) {

    /// Entrada de datos
    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor a depositar: "));

    /// Creacion de objetos

    CuentaAhorros miCuentaAhorros = new CuentaAhorros(deposito);
    JOptionPane.showMessageDialog(null, "Su inversion fue de: " + deposito + " y si su cuenta es de ahorros su interes es del 4%, el total de su dinero es: " + miCuentaAhorros.hallarInteres());
    double pago = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor a pagar: "));

    CuentaCorriente miCuentaCorriente = new CuentaCorriente(deposito, pago);
    JOptionPane.showMessageDialog(null, "El valor de su depósito ahora sería: " + miCuentaCorriente.pagar());
    
    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor a retirar: "));
    Libreta2022 miLibreta2022 = new Libreta2022(deposito, retiro);
    JOptionPane.showMessageDialog(null, "Su inversion fue de: " + deposito + " y si su cuenta es Libreta2022 su interes es del 8%, el total de su dinero es: " + miLibreta2022.hallarInteres());
    JOptionPane.showMessageDialog(null, "Su retiro fue de: " + retiro + " pero como su cuenta es Libreta2022 se le descuenta un 2%, el total de su retiro es: " + miLibreta2022.retirarFondos());
    System.exit(0);
    }

}
