package test.fechas;

import java.util.Date;

public class EjemploDate {
	
	public static String getFormateado (Date fecha) {
		int year = 1900 + fecha.getYear();
		int month = 1 + fecha.getMonth();
		int day = fecha.getDate();
		
		int hour = fecha.getHours();
		int minutes = fecha.getMinutes();
		int secs = fecha.getSeconds();
		
		String formato = "%d/%d/%d %d:%d.%d";
		return String.format(formato, day, month, year, hour, minutes, secs);
	}

	public static void main(String[] args) {

		Date fecha = new Date();
		System.out.println(fecha);
		
		fecha.setYear(100);
		fecha.setHours(0);
		fecha.setMinutes(0);
		fecha.setSeconds(0);
		fecha.setDate(1);
		fecha.setMonth(0);
		
		// Formato Estandar de fecha
		System.out.println(fecha);
		// Millisegundos de la fecha
		System.out.println(fecha.getTime());
		
		Date fechaAhora = new Date();
		
		// Comparar Fechas
		boolean esDespues = fechaAhora.after(fecha);
		boolean esAntes = fechaAhora.before(fecha);
		boolean esIgual = fechaAhora.equals(fecha); // No se debe usar
		
		String strDate = fechaAhora.toLocaleString();
		String strDate2 = fechaAhora.toGMTString();
		String strDate3 = fechaAhora.toString();
		System.out.println("Date1-"+strDate);
		System.out.println("Date2-"+strDate2);
		System.out.println("Date3-"+strDate3);
		
		String fechaHumana = getFormateado(fechaAhora);
		System.out.println("Fecha Ahora: -> "+fechaHumana);
		
	}

}
