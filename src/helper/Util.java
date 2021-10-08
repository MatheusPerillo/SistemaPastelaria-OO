package helper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Esta é uma classe auxiliar que implementa
 * máscaras para datas e números decimais.
 * Convertendo variáveis do tipo Double para String
 * e Date para String.
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Util {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

	/**
	 * 
	 * @param valor a ser formatado
	 * @return String formatada ("R$ #,##0.00")
	 */
	public static String doubleParaString(Double valor) {
		return Util.nf.format(valor);
	}
	
	/**
	 * 
	 * @param date o valor de hora a ser formatado em uma string de data e hora.
	 * @return String formatada hora/tempo ("dd/MM/yyyy HH:mm:ss").
	 */
	public static String dateParaString(Date date) {
		return Util.sdf.format(date);
	}
	
	
	
	
}
