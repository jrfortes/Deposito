package cuenta;

/**
 * Clase CCuenta. Se guarda datos como nombre, cuenta, salto y tipo de interes y
 * se realizarn operaciones de ingreso y retirada de efectivo.
 * @author José Ramón López Fortes
 * @version 1.0
 * @since 1.0
 */
public class CCuenta {

	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInteres;
	    
	    /**
	     * Constructor vacío.
	     */
	    public CCuenta()
	    {
	    }

	    /**
	     * Método constructor CCuenta. Cuatro parámetros.
	     * @param nom
	     * @param cue
	     * @param sal
	     * @param tipo
	     */
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        setNombre(nom);
	        setCuenta(cue);
	        setSaldo(sal);
	    }

	    /**
	     * Métodos estado.
	     * @return salto
	     */
	    public double estado()
	    {
	        return getSaldo();
	    }

	    /**
	     * Método que realiza la acción de ingresar una cantidad.
	     * @param cantidad
	     * @throws Exception
	     */
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        setSaldo(getSaldo() + cantidad);
	    }

	    /**
	     * Método que realiza la acción de retirar una cantidad.
	     * @param cantidad
	     * @throws Exception
	     */
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        setSaldo(getSaldo() - cantidad);
	    }

	    /**
	     * Método getter nombre. Se obtiene el valor de cuenta.
	     * @return
	     */
		private String getNombre() {
			return nombre;
		}

		/**
		 * Método setter nombre. Se asigna o establece un valor para nombre.
		 * @param nombre
		 */
		private void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * Método getter Cuenta. Se obtiene el valor de cuenta.
		 * @return
		 */
		private String getCuenta() {
			return cuenta;
		}

		/**
		 * Método setter cuenta. Se asigna o establece un valor para cuenta.
		 * @param cuenta
		 */
		private void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		/**
		 * Método getter saldo. Se obtiene el valor de saldo.
		 * @return
		 */
		private double getSaldo() {
			return saldo;
		}

		/**
		 * Método setter saldo. Se asigna o establece un valor para saldo.
		 * @param saldo
		 */
		private void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		/**
		 * Método getter TipoInteres. Se obtiene el valor de TipoInteres.
		 * @return
		 */
		private double getTipoInteres() {
			return tipoInteres;
		}

		/**
		 * Método setter TipoInteres. Se asigna o establece un valor para TipoInteres.
		 * @param tipoInteres
		 */
		private void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
}