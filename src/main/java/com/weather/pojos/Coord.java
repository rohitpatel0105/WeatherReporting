
package com.weather.pojos;

/**
 * @author rohit.patel
 *
 */
public class Coord {

    public long lon;
    public double lat;
	/**
	 * @return the lon
	 */
	public long getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(long lon) {
		this.lon = lon;
	}
	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coord [lon=" + lon + ", lat=" + lat + "]";
	}

}
