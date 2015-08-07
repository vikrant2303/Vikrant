package com.practice.reflection.proxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONObject;

public class MainClass {

	private static Map map;
	public static void main(String[] args) {
		
		Map hashmaMap=new HashMap<String , String>();
		hashmaMap.put("name ", "vikrant");
		hashmaMap.put("Age", "24");
		MainClass obj=new MainClass();
		obj.map=hashmaMap;
		mapToJson(obj);
	}
	
	private static JSONObject mapToJson(Object object) {
		JSONObject jsonObject=new JSONObject();
		if (object instanceof Map) {
			Iterator it = ((Map)object).entrySet().iterator();
			while (it.hasNext()) {
			  Entry thisEntry = (Entry) it.next();
			  Object key = thisEntry.getKey();
			  Object value = thisEntry.getValue();
			 // logger.debug("JSONConvertor.mapToJson value for key :"+key.toString()+ " is "+value.toString());
			  try {
				JSONObject keyObject=objectToJson(key);
				JSONObject valueObject=objectToJson(value);
				jsonObject.put(key.getClass().getSimpleName(), new JSONObject().put(keyObject.toString().replace("\"", ""),new JSONObject().put(value.getClass().getSimpleName(), valueObject)));
				

			} catch (Exception e) {
				e.printStackTrace();
				//logger.info("Jsonconvertor.mapTpJson :"+e.getMessage());
			}
			}

		}
		return jsonObject;
	}
	public static JSONObject objectToJson(Object object)
			throws NoSuchFieldException, SecurityException {
		JSONObject jsonObj = new JSONObject();
		try {
			
			//handle all the fields of a class and converts into json object
			Field[] fields = object.getClass().getDeclaredFields();
			if (fields!=null) {
				
				for (Field field : fields) {
					if(field.getName().contains("serialVersionUID")||field.getType().getSimpleName().equals("Logger"))
						continue;
					if(field.getType().getCanonicalName().equals(field.getDeclaringClass().getName()))
						continue;
					fieldsToJson(field,jsonObj,object);
				}
			}
			else{
				//logger.debug("JSONConvertor.objectToJson No field exists in class :"+object.getClass().getName());
			}
			//handle all the fields of the super class and convert into json object
			Field[] superFields = object.getClass().getSuperclass()
					.getDeclaredFields();
			if (superFields!=null) {
				for (Field field : superFields) {
					if(field.getName().contains("serialVersionUID")||field.getType().getSimpleName().equals("Logger"))
						continue;
					fieldsToJson(field, jsonObj, object);
				}
			}else{
				//logger.debug("JSONConvertor.objectToJson No field exists in Super class :"+object.getClass().getName() +" Super class :"+object.getClass().getSuperclass().getName());
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObj;

	}
/**
 * Takes the field of a class, analyze the type of the field and convert it into json object
 * @param field
 * @param jsonObj
 * @param object
 */
private static void fieldsToJson(Field field, JSONObject jsonObj,Object object) {

	//logger.debug("JSONConvertor.fieldsToJson field name : "+field.getName());
	try {
		if (!field.isAccessible())
			field.setAccessible(true);
		
		if (field.getType().isPrimitive()
				|| field.getType().getName().equals("java.lang.String")) {
			Object value = field.get(object);
			if (value != null) 
			jsonObj.put(field.getName(), value);
			else
				jsonObj.put(field.getName(), "");
			
		} 
			else if(field.getType().getName().equals("java.util.Map")){
				JSONObject jsonObject=mapToJson(field.get(object));
				jsonObj.put(field.getName(), jsonObject);
			
			}
			else if(field.getType().isEnum()){
				jsonObj.put(field.getName(), field.get(object));
			}
			else if (field.get(object) != null) {
					JSONObject jsonObjlocal=objectToJson(field.get(object));
					jsonObj.put(field.getName(), new JSONObject().put(field.getType().getSimpleName(),jsonObjlocal));
				}
				else{	
					if(Modifier.isAbstract(field.getType().getModifiers())){
						field.getType().getClass().newInstance();
						object.getClass().getDeclaredClasses();
						object.getClass().getDeclaringClass();
						for(Method method : object.getClass().getDeclaredMethods()){
							if(method.getName().equalsIgnoreCase("getEventCondition")){
							Object obj=	method.invoke(object, new Object[0]);
							System.out.println(obj);
								
							}
						
						}
					}else {						
							jsonObj.put(field.getName(),new JSONObject().put(field.getType().getSimpleName(),""));
					}
					
				}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
		
//	public static void main(String[] args) {
//		TestInterface testInterfaceImpl=(TestInterface)Proxy.newProxyInstance(TestInterface.class.getClassLoader(),
//				new Class<?>[]{TestInterface.class}, new TestInvocationHandler(new TestInterfaceImpl()));
//		System.out.println(testInterfaceImpl.getName());
//	}
}
