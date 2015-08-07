package com.practice.MongoDB;

import spark.*;

public class SparkStyle {
	public static void main(String[] args) {
		Spark.get(new Route("/") {
			@Override
			public Object handle(Request request, Response response) {
				return "Hello World from spark";
			}
		});

	}
}
