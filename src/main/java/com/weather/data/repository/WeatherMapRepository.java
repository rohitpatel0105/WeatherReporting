package com.weather.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.weather.collections.Weathermap;
import com.weather.data.customrepository.WeatherMapRepositoryCustom;

/**
 * @author rohit.patel
 */
@Transactional
public interface WeatherMapRepository extends MongoRepository<Weathermap, String>, WeatherMapRepositoryCustom{
	
	
}
