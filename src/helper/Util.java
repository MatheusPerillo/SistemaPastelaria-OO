package helper;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Util {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

	
	public static String doubleParaString(Double valor) {
		return Util.nf.format(valor);
	}
	public static String dateParaString(Date date) {
		return Util.sdf.format(date);
	}
	
	
	
	
}
