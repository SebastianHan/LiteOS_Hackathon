package org.levainservice.rest.oms;

import org.levainservice.rest.RESTClient;

import com.google.gson.Gson;

public class BaseClient {
	public static final String SERVICE_BASE_URL = "http://192.168.1.100:8080/server/rest";

	public RESTClient client = new RESTClient();;
	
	public Gson gson = new Gson();
	public BaseClient() {
		
	}
}
