package test.fechas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class EjemploCalendar {
	
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

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getTime());
		
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 25);
		cal.set(Calendar.HOUR_OF_DAY, 17); // 0-24
		cal.set(Calendar.HOUR, 12); // 0-12
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(Calendar.SECOND, 0);
		
		long milliseconds = cal.getTimeInMillis();
		Date fecha = cal.getTime();
		
		String fechaHumana = getFormateado(fecha);
		System.out.println("Fecha Ahora: -> "+fechaHumana); 
		
		cal.set(Calendar.DAY_OF_YEAR, 0); 
		System.out.println("Fecha Ahora: -> "+getFormateado(fecha)); 
		
		boolean antesDe = cal.before(cal);
		boolean despuesDe = cal.after(cal);
		
		Date now = new Date();
		boolean despuesDe2 = cal.after(now);
		
		
		filtrarFechas();
	}
	
	
	public static void filtrarFechas () {
		Random random = new Random();
		
		List<Calendar> fechas = new ArrayList<Calendar>();
		// Generamos las Fechas a Filtrar
		for (int i = 0; i <= 10; i++) {
			
			Calendar cal = Calendar.getInstance();
			
			int rYear = random.nextInt(22) + 1;			
			cal.set(Calendar.YEAR, 2000+rYear);
			
			int rMonth = random.nextInt(12) + 1;	
			cal.set(Calendar.MONTH, rMonth);
			
			int rDay = random.nextInt(30) + 1;	
			cal.set(Calendar.DAY_OF_MONTH, rDay); 
			
			fechas.add(cal);
		}
		
		// Filtramos las fechas
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 0); 
		
		List<Calendar> fechasFiltradas = new ArrayList<Calendar>();
		for (Calendar calendar : fechas) {
			if (cal.before(calendar)) {
				fechasFiltradas.add(calendar);
			}
		}
		System.out.println(fechasFiltradas);
		
	}

}
