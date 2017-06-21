package com.weather.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author rohit.patel
 * 
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.weather" })
@EnableMongoRepositories(basePackages={"com.weather.data.repository"})
@EnableScheduling
public class ApplicationConfig extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationConfig.class);
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
			MongoMappingContext context) {

		MappingMongoConverter converter =
				new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
		converter.setTypeMapper(new DefaultMongoTypeMapper(null));

		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);

		return mongoTemplate;

	}
}