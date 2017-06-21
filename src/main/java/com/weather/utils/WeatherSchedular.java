/**
 * 
 */
package com.weather.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.collections.Weathermap;
import com.weather.data.repository.WeatherMapRepository;

/**
 * @author rohit.patel
 *
 */
@Service
public class WeatherSchedular implements Serializable{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(WeatherSchedular.class); 

	@Autowired
	private RestClient restClient;
	
	@Value("${openweathermap.api}")
	String openweathermapApi;
	
	@Value("${content.type.key}")
	String contentTypeKey;
	
	@Value("${content.type.value}")
	String contentTypeValue;
	
	@Autowired
	private WeatherMapRepository weatherMapRepository;
	
	@Scheduled(cron = "${schedular_execution_time}")
	public void weatherSchedular(){
		logger.info(" weatherSchedular started");
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			Map<String, String> map = new HashMap<>();
			map.put(contentTypeKey, contentTypeValue);
			String result = restClient.get(openweathermapApi, map);
			Weathermap weathermap = mapper.readValue(result, Weathermap.class);
			weathermap.setCreatedtime(System.currentTimeMillis());
			weathermap.getMain().setTemp(CommonUtils.kelvinToCelcius(weathermap.getMain().getTemp()));
			weatherMapRepository.save(weathermap);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception = "+ e);
		}
		logger.debug(" weatherSchedular completed ");
	}
}
