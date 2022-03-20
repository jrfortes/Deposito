package cuenta;

/**
 * Clase CCuenta. Se guarda datos como nombre, cuenta, salto y tipo de interes y
 * se realizarn operaciones de ingreso y retirada de efectivo.
 * @author Jos� Ram�n L�pez Fortes
 * @version 1.0
 * @since 1.0
 */
public class CCuenta {

	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInteres;
	    
	    /**
	     * Constructor vac�o.
	     */
	    public CCuenta()
	    {
	    }

	    /**
	     * M�todo constructor CCuenta. Cuatro par�metros.
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
	     * M�todos estado.
	     * @return salto
	     */
	    public double estado()
	    {
	        return getSaldo();
	    }

	    /**
	     * M�todo que realiza la acci�n de ingresar una cantidad.
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
	     * M�todo que realiza la acci�n de retirar una cantidad.
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
	     * M�todo getter nombre. Se obtiene el valor de cuenta.
	     * @return
	     */
		private String getNombre() {
			return nombre;
		}

		/**
		 * M�todo setter nombre. Se asigna o establece un valor para nombre.
		 * @param nombre
		 */
		private void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * M�todo getter Cuenta. Se obtiene el valor de cuenta.
		 * @return
		 */
		private String getCuenta() {
			return cuenta;
		}

		/**
		 * M�todo setter cuenta. Se asigna o establece un valor para cuenta.
		 * @param cuenta
		 */
		private void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		/**
		 * M�todo getter saldo. Se obtiene el valor de saldo.
		 * @return
		 */
		private double getSaldo() {
			return saldo;
		}

		/**
		 * M�todo setter saldo. Se asigna o establece un valor para saldo.
		 * @param saldo
		 */
		private void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		/**
		 * M�todo getter TipoInteres. Se obtiene el valor de TipoInteres.
		 * @return
		 */
		private double getTipoInteres() {
			return tipoInteres;
		}

		/**
		 * M�todo setter TipoInteres. Se asigna o establece un valor para TipoInteres.
		 * @param tipoInteres
		 */
		private void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
}