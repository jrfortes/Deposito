package cuenta;

/**
 * Programa que solicita una serie de datos que posteriormente se guandarán el las
 * correspondientes y se realizarán las operaciones. Se muestra el saldo actual despues
 * de realizar un ingreso en cuenta. 
 * @author José Ramón López Fortes
 * @version 1.0
 * @since 1.0
 */

public class Main {
	
	public static void main(String[] args) {
		operativa_cuenta(0);
		
	}

	/**
	 * Método operativa de cuenta. Asocia una serie de datos, realiza un ingreso y muestra
	 * el saldo actual y la acción realizada.
	 * @param cantidad
	 */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
