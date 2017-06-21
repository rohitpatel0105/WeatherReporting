package com.weather.utils;

import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
/**
 * @author rohit.patel
 *
 */
@Component
public class RestClient {
	private static final Logger logger = LoggerFactory.getLogger(RestClient.class);
    
	public final String get(String uri, Map<String, String> map) throws Exception {
		logger.debug("RestClient.get.uri:" + uri);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(uri);
            if (null != map) {
	            for (Map.Entry<String, String> entry: map.entrySet()) {
	            	httpget.setHeader(entry.getKey(), entry.getValue());
	            	logger.debug("RestClient.get.header:" + entry.getKey() + ":" + entry.getValue());
	            }
            }
            return httpclient.execute(httpget, new WeatherResponseHandler());
        } finally {
            httpclient.close();
        }
    }

	public final String post(String uri, Map<String, String> map, String body) throws Exception {
		logger.debug("RestClient.post.uri:" + uri);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
        	HttpPost httpPost = new HttpPost(uri);
        	if (null != map) {
	            for (Map.Entry<String, String> entry: map.entrySet()) {
	            	httpPost.setHeader(entry.getKey(), entry.getValue());
	            	logger.debug("RestClient.post.header:" + entry.getKey() + ":" + entry.getValue());
	            }
        	}
            if (null != body) {
            	logger.debug("RestClient.post.body:" + body);
	            StringEntity entity = new StringEntity(body);
	            httpPost.setEntity(entity);
            }
            return httpclient.execute(httpPost, new WeatherResponseHandler());
        } finally {
            httpclient.close();
        }
    }
	
	public final String put(String uri, Map<String, String> map, String body) throws Exception {
		logger.debug("RestClient.put.uri:" + uri);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
        	HttpPut httpPut = new HttpPut(uri);
        	if (null != map) {
	            for (Map.Entry<String, String> entry: map.entrySet()) {
	            	httpPut.setHeader(entry.getKey(), entry.getValue());
	            	logger.debug("RestClient.put.header:" + entry.getKey() + ":" + entry.getValue());
	            }
        	}
            if (null != body) {
            	logger.debug("RestClient.put.body:" + body);
	            StringEntity entity = new StringEntity(body);
	            httpPut.setEntity(entity);
            }
            return httpclient.execute(httpPut, new WeatherResponseHandler());
        } finally {
            httpclient.close();
        }
    }
	
	public final String put(String uri, Map<String, String> map) throws Exception {
		logger.debug("RestClient.put.uri:" + uri);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
        	HttpPut httpPut = new HttpPut(uri);
        	if (null != map) {
	            for (Map.Entry<String, String> entry: map.entrySet()) {
	            	httpPut.setHeader(entry.getKey(), entry.getValue());
	            	logger.debug("RestClient.put.header:" + entry.getKey() + ":" + entry.getValue());
	            }
        	}
            return httpclient.execute(httpPut, new WeatherResponseHandler());
        } finally {
            httpclient.close();
        }
    }
	
	public final String put(String uri, Map<String, String> map, byte[] bytes) throws Exception {
		logger.debug("RestClient.put.uri:" + uri);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
        	HttpPut httpPut = new HttpPut(uri);
        	if (null != map) {
	            for (Map.Entry<String, String> entry: map.entrySet()) {
	            	httpPut.setHeader(entry.getKey(), entry.getValue());
	            	logger.debug("RestClient.put.header:" + entry.getKey() + ":" + entry.getValue());
	            }
        	}
            if (null != bytes) {
            	HttpEntity entity = new ByteArrayEntity(bytes);
	            httpPut.setEntity(entity);
            }
            return httpclient.execute(httpPut, new WeatherResponseHandler());
        } finally {
            httpclient.close();
        }
    }
}

