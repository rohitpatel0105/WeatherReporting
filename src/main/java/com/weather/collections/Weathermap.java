
package com.weather.collections;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.weather.pojos.Clouds;
import com.weather.pojos.Coord;
import com.weather.pojos.Main;
import com.weather.pojos.Sys;
import com.weather.pojos.Weather;
import com.weather.pojos.Wind;
/**
 * @author rohit.patel
 *
 */
@Document(collection="weathermap")
public class Weathermap {

	@Id
	@Field private String weathermapid;
	@Field(value="coord")public Coord coord;
	@Field(value="weather") public List<Weather> weather = null;
	@Field(value="base") public String base;
	@Field(value="main") public Main main;
	@Field(value="wind") public Wind wind;
	@Field(value="clouds") public Clouds clouds;
	@Field(value="dt") public long dt;
	@Field(value="sys") public Sys sys;
	@Field(value="id") public long id;
	@Field(value="name") public String name;
	@Field(value="cod") public long cod;
	@Field(value="createdtime") public long createdtime;
	/**
	 * @return the weathermapid
	 */
	public String getWeathermapid() {
		return weathermapid;
	}
	/**
	 * @param weathermapid the weathermapid to set
	 */
	public void setWeathermapid(String weathermapid) {
		this.weathermapid = weathermapid;
	}
	/**
	 * @return the coord
	 */
	public Coord getCoord() {
		return coord;
	}
	/**
	 * @param coord the coord to set
	 */
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	/**
	 * @return the weather
	 */
	public List<Weather> getWeather() {
		return weather;
	}
	/**
	 * @param weather the weather to set
	 */
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	/**
	 * @return the base
	 */
	public String getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(String base) {
		this.base = base;
	}
	/**
	 * @return the main
	 */
	public Main getMain() {
		return main;
	}
	/**
	 * @param main the main to set
	 */
	public void setMain(Main main) {
		this.main = main;
	}
	/**
	 * @return the wind
	 */
	public Wind getWind() {
		return wind;
	}
	/**
	 * @param wind the wind to set
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	/**
	 * @return the clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}
	/**
	 * @param clouds the clouds to set
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	/**
	 * @return the dt
	 */
	public long getDt() {
		return dt;
	}
	/**
	 * @param dt the dt to set
	 */
	public void setDt(long dt) {
		this.dt = dt;
	}
	/**
	 * @return the sys
	 */
	public Sys getSys() {
		return sys;
	}
	/**
	 * @param sys the sys to set
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cod
	 */
	public long getCod() {
		return cod;
	}
	/**
	 * @param cod the cod to set
	 */
	public void setCod(long cod) {
		this.cod = cod;
	}
	/**
	 * @return the createdtime
	 */
	public long getCreatedtime() {
		return createdtime;
	}
	/**
	 * @param createdtime the createdtime to set
	 */
	public void setCreatedtime(long createdtime) {
		this.createdtime = createdtime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weathermap [weathermapid=" + weathermapid + ", coord=" + coord + ", weather=" + weather + ", base="
				+ base + ", main=" + main + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys
				+ ", id=" + id + ", name=" + name + ", cod=" + cod + ", createdtime=" + createdtime + "]";
	}
	

	
}
