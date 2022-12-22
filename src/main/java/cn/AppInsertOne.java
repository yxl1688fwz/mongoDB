package cn;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import mongo.MongoDBPoolutil;
import org.bson.Document;


public class AppInsertOne {
    public static void main(String[] args) {
        MongoCollection mongoCollection= MongoDBPoolutil.getCollection("yxlDB","yxlJH");

        Document document=new Document("_id",199)
                .append("title","MongoDB Insert Demo");
        mongoCollection.insertOne(document);
        System.out.println("成功插入一条数据");
    }

}
