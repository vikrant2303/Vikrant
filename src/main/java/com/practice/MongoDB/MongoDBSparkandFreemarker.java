package com.practice.MongoDB;

import java.io.Serializable;
import java.io.StringWriter;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class MongoDBSparkandFreemarker implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("deprecation")
		final Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(SparkWithFreemarke.class, "/");
		MongoClient client = new MongoClient("localhost", 27017);
		DB database = client.getDB("test");
		DBCollection collection = database.getCollection("things");
		DBObject o1=new BasicDBObject();
		o1.put("name", "vikrant");
		final DBObject object=collection.findOne(o1);
		System.out.println(object);
		Spark.get(new Route("/test") {

			StringWriter stringWriter = new StringWriter();

			@Override
			public Object handle(Request resquest, Response response) {
				try {
					Template template = configuration
							.getTemplate("Helloworld.ftl");
					template.process(object, stringWriter);
				} catch (Exception e) {
					//halt(500);
					e.printStackTrace();
				}
				return stringWriter;
			}
		});
	}

}
