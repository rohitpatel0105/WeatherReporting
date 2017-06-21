package com.weather.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author rohit.patel
 *
 */
public class Log {
	private static Logger logger = LoggerFactory.getLogger(Log.class.getName());
	
	
	/**
	 * Use warn or error for human-visible issues.
	 * 
	 * @param msg
	 */
	public static void error(String msg) {
		logger.error(msg);
	}

	/**
	 * Use warn or error for human-visible issues.
	 * 
	 * @param msg
	 */
	public static void error(String msg,Throwable t) {
		logger.error(msg,t);
	}
	/**
	 * Use warn or error for human-visible issues. Generally used for logging
	 * errors.
	 * 
	 * @param msg
	 */
	public static void warn(String msg) {
		logger.warn(msg);
	}

	/**
	 * Use info for human-visible issues.
	 * 
	 * @param msg
	 */
	public static void info(String msg) {
		/*String clazz = ", "
				+ Thread.currentThread().getStackTrace()[3].getClassName();
		logger.debug(msg + clazz);*/
		logger.debug(msg);
	}
	
	/**
	 * Use warn or error for human-visible issues.
	 * 
	 * @param msg
	 */
	public static void error(String msg,String t) {
		//logger.debug(msg,t);
		logger.error(msg,t);
	}

	/**
	 * Use info for human-visible issues.
	 * 
	 * @param msg
	 */
	public static void debug(String msg) {	
		logger.debug(msg);
	}
	
}
