package com.weather.controller;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weather.collections.Weathermap;
import com.weather.data.repository.WeatherMapRepository;
import com.weather.pojos.MinMaxTemp;
import com.weather.pojos.TempAndTime;
import com.weather.utils.CommonUtils;
import com.weather.utils.WeatherReportingException;

/**
 * @author rohit.patel
 */

@RestController
public class WeatherMapController {

	@Autowired
	private WeatherMapRepository weatherMapRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	private static final Logger logger = LoggerFactory.getLogger(WeatherMapController.class);

	@RequestMapping(value = "/minmaxtemperature", method = RequestMethod.GET)
	public ResponseEntity<MinMaxTemp> minmaxtemperature() throws WeatherReportingException
	{
		logger.debug("entered into minmaxtemperature");
		MinMaxTemp minMaxTemp = new MinMaxTemp();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
		// Minimum temperature
		Query query = new Query();
		try
		{
			query.with(new Sort(Sort.Direction.ASC, "main.temp")).limit(1);
			query.addCriteria(Criteria.where("createdtime").gte(CommonUtils.convertDateIntoMilliseconds()).lte(System.currentTimeMillis()));
			Weathermap minObject = mongoTemplate.findOne(query, Weathermap.class);
			minMaxTemp.setMinTemp(minObject.getMain().getTemp());
			Date date = new Date(minObject.getCreatedtime());
			minMaxTemp.setMinTempTime(formatter.format(date).toString());

			// Maximum temperature
			query = new Query();
			query.with(new Sort(Sort.Direction.DESC, "main.temp")).limit(1);
			query.addCriteria(Criteria.where("createdtime").gte(CommonUtils.convertDateIntoMilliseconds()).lte(System.currentTimeMillis()));
			Weathermap maxObject = mongoTemplate.findOne(query, Weathermap.class);
			minMaxTemp.setMaxTemp(maxObject.getMain().getTemp());
			date = new Date(maxObject.getCreatedtime());
			minMaxTemp.setMaxTempTime(formatter.format(date).toString());
		}
		catch(Exception exception)
		{
			logger.error("error :"+ exception.getMessage());
			throw new WeatherReportingException("unexpected.error", HttpStatus.BAD_REQUEST);
		}
		logger.debug("exit from minmaxtemperature");
		return new ResponseEntity<MinMaxTemp>(minMaxTemp, HttpStatus.OK);
	}


	@RequestMapping(value = "/increasingTemperatureList", method = RequestMethod.GET)
	public ResponseEntity<List<TempAndTime>> increasingTemperatureList() throws WeatherReportingException
	{
		List<Weathermap> weatherList = null;
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
		Map<Double, String> increasingTempMap = null;
		List<TempAndTime> increasingTempList = new LinkedList<TempAndTime>();
		logger.debug("entered into increasingTemperatureList");
		try
		{
			Query query = new Query();
			query.with(new Sort(Sort.Direction.ASC, "main.temp"));
			query.addCriteria(Criteria.where("createdtime").gte(CommonUtils.convertDateIntoMilliseconds()).lte(System.currentTimeMillis()));
			weatherList = mongoTemplate.find(query, Weathermap.class);
			increasingTempMap = new LinkedHashMap<Double, String>();
			for(Weathermap weathermap : weatherList)
				if(increasingTempMap.containsKey(weathermap.getMain().getTemp()))
					continue;
				else
				{
					Date date = new Date(weathermap.getCreatedtime());
					increasingTempMap.put(weathermap.getMain().getTemp(), formatter.format(date).toString());
					TempAndTime tempAndTime = new TempAndTime();
					tempAndTime.setTemp(weathermap.getMain().getTemp());
					tempAndTime.setTempTime(formatter.format(date).toString());
					increasingTempList.add(tempAndTime);
				}
		}
		catch(Exception exception)
		{
			logger.error("error :"+ exception.getMessage());
			throw new WeatherReportingException("unexpected.error", HttpStatus.BAD_REQUEST);
		}
		logger.debug("exit from increasingTemperatureList");
		return new ResponseEntity<List<TempAndTime>>(increasingTempList, HttpStatus.OK);
	}
}
