package com.practice.MongoDB;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerStyle {

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(FreemarkerStyle.class, "/");
		Template template = configuration.getTemplate("Helloworld.ftl");
		StringWriter stringWriter=new StringWriter();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "Vikrant");
		template.process(map, stringWriter);
		System.out.println(stringWriter);
	}
}
