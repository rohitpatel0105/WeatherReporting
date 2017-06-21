/**
 * 
 */
package com.weather.pojos;

/**
 * @author rohit.patel
 *
 */
public class MinMaxTemp {

	public double minTemp;
	public String minTempTime;
	public double maxTemp;
	public String maxTempTime;
	/**
	 * @return the minTemp
	 */
	public double getMinTemp() {
		return minTemp;
	}
	/**
	 * @param minTemp the minTemp to set
	 */
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	/**
	 * @return the minTempTime
	 */
	public String getMinTempTime() {
		return minTempTime;
	}
	/**
	 * @param minTempTime the minTempTime to set
	 */
	public void setMinTempTime(String minTempTime) {
		this.minTempTime = minTempTime;
	}
	/**
	 * @return the maxTemp
	 */
	public double getMaxTemp() {
		return maxTemp;
	}
	/**
	 * @param maxTemp the maxTemp to set
	 */
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	/**
	 * @return the maxTempTime
	 */
	public String getMaxTempTime() {
		return maxTempTime;
	}
	/**
	 * @param maxTempTime the maxTempTime to set
	 */
	public void setMaxTempTime(String maxTempTime) {
		this.maxTempTime = maxTempTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MinMaxTemp [minTemp=" + minTemp + ", minTempTime=" + minTempTime + ", maxTemp=" + maxTemp
				+ ", maxTempTime=" + maxTempTime + "]";
	}
	
}
