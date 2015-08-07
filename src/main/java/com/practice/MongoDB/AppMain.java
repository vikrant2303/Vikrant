package com.practice.MongoDB;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class AppMain {

	public static void main(String[] args) throws UnknownHostException {
		MongoClient client=new MongoClient("localhost",27017);
		DB database=client.getDB("test");
		DBCollection collection=database.getCollection("things");
		DBCursor cursor=collection.find();
		System.out.println(cursor.size());
//        List list=new ArrayList();
//        list.add("vikrant");
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		client.close();
	}
}
