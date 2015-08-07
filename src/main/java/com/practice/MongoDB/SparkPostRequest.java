package com.practice.MongoDB;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class SparkPostRequest {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("deprecation")
		final Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(SparkWithFreemarke.class, "/");
		
		
		Spark.get(new Route("/test") {

			StringWriter stringWriter = new StringWriter();

			@Override
			public Object handle(Request resquest, Response response) {
				try {
					Template template = configuration
							.getTemplate("Fruit.ftl");
					Map<String,Object> map=new HashMap<String, Object>();
					map.put("Fruits",Arrays.asList("Oreange","Apple","Banana","Mango"));
					template.process(map, stringWriter);
					System.out.println(stringWriter);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return stringWriter;
			}
		});
		Spark.post(new Route("/favfruit") {
			
			@Override
			public Object handle(Request request, Response response) {
				
				return request.queryParams("fruit");
			}
		});
	}
}
