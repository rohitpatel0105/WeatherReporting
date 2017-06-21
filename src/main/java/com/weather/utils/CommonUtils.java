/**
 * 
 */
package com.weather.utils;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * @author rohit.patel
 *
 */
public class CommonUtils {

	@SuppressWarnings("deprecation")
	public static long convertDateIntoMilliseconds()
	{
		Date date = new Date();
		date.setHours(0);
		date.setMinutes(0);
		date.setSeconds(0);
		long l = date.getTime();
		System.out.println(l);
		return l;
	}


	// Method to convert from degrees Kelvin to degrees Celcius
	public static double kelvinToCelcius(double degKelvin)
	{
		double degCelcius;
		degCelcius = degKelvin - 273.15;
		DecimalFormat df = new DecimalFormat("#.#");
		return Double.valueOf(df.format(degCelcius));
	}
}
