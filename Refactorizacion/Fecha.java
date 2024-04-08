ackage refactorizacion;

public class Fecha {

	 private int dia;
	    private int mes;
	    private int año;

	    public Fecha(int dia, int mes, int anio) {
	        this.dia = dia;
	        this.mes = mes;
	        this.año = año;
	    }

	    public boolean valida() {
	        return esDiaValido() && esMesValido() && esAñoValido();
	    }

	    private boolean esDiaValido() {
	        int diasMes = obtenerDiasDelMes();
	        return dia >= 1 && dia <= diasMes;
	    }

	    private boolean esMesValido() {
	        return mes >= 1 && mes <= 12;
	    }

	    private boolean esAñoValido() {
	        return año > 0; 
	    }

	    private int obtenerDiasDelMes() {
	        switch (mes) {
	            case 2: 
	                return esAnioBisiesto() ? 29 : 28;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                return 30;
	            default:
	                return 31;
	        }
	    }

	    private boolean esAnioBisiesto() {
	        return (año % 400 == 0) || ((año % 4 == 0) && (año % 100 != 0));
	    }
	}