package cn;

import com.mongodb.client.MongoCollection;
import mongo.MongoDBPoolutil;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class AppInsertMany {
    public static void main(String[] args) {
        MongoCollection mongoCollection= MongoDBPoolutil.getCollection("yxlDB","yxlJH");

        Document document1=new Document("_id",1).append("title","MongoDB Insert Demo1");
        Document document2=new Document("_id",2).append("title","MongoDB Insert Demo2");
        List<Document> documents=new ArrayList<>();
        documents.add(document1);
        documents.add(document2);

        mongoCollection.insertMany(documents);
        System.out.println("插入多条数据成功！");
    }
}
