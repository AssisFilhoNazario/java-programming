package aula19Datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Testecalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 10);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 0);
		
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(c.getTime()));
		
		

	}

}
