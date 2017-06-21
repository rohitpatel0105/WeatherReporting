
package com.weather.pojos;
/**
 * @author rohit.patel
 *
 */

public class Main {

    public double temp;
    public double pressure;
    public long humidity;
    public double temp_min;
    public double temp_max;
    public double sea_level;
    public double grnd_level;
	/**
	 * @return the temp
	 */
	public double getTemp() {
		return temp;
	}
	/**
	 * @param temp the temp to set
	 */
	public void setTemp(double temp) {
		this.temp = temp;
	}
	/**
	 * @return the pressure
	 */
	public double getPressure() {
		return pressure;
	}
	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	/**
	 * @return the humidity
	 */
	public long getHumidity() {
		return humidity;
	}
	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(long humidity) {
		this.humidity = humidity;
	}
	/**
	 * @return the temp_min
	 */
	public double getTemp_min() {
		return temp_min;
	}
	/**
	 * @param temp_min the temp_min to set
	 */
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	/**
	 * @return the temp_max
	 */
	public double getTemp_max() {
		return temp_max;
	}
	/**
	 * @param temp_max the temp_max to set
	 */
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	/**
	 * @return the sea_level
	 */
	public double getSea_level() {
		return sea_level;
	}
	/**
	 * @param sea_level the sea_level to set
	 */
	public void setSea_level(double sea_level) {
		this.sea_level = sea_level;
	}
	/**
	 * @return the grnd_level
	 */
	public double getGrnd_level() {
		return grnd_level;
	}
	/**
	 * @param grnd_level the grnd_level to set
	 */
	public void setGrnd_level(double grnd_level) {
		this.grnd_level = grnd_level;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Main [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", temp_min=" + temp_min
				+ ", temp_max=" + temp_max + ", sea_level=" + sea_level + ", grnd_level=" + grnd_level + "]";
	}

}
