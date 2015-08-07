package com.practice.MongoDB;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class SparkWithFreemarke {

	public static void main(String[] args) throws Exception {
		final Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(SparkWithFreemarke.class, "/");

		Spark.get(new Route("/") {

			StringWriter stringWriter = new StringWriter();
			Map<String, Object> map = new HashMap<String, Object>();

			@Override
			public Object handle(Request resquest, Response response) {
				try {
					Template template = configuration
							.getTemplate("Helloworld.ftl");
					map.put("name", "vikrant");
					template.process(map, stringWriter);
				} catch (Exception e) {
					halt(500);
					e.printStackTrace();
				}
				return stringWriter;
			}
		});
	}
}
