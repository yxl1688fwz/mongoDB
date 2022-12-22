package cn;

import com.mongodb.client.MongoCollection;
import mongo.MongoDBPoolutil;
import org.bson.Document;

public class AppDeletePool {
    public static void main(String[] args) {
        MongoCollection mongoCollection= MongoDBPoolutil.getCollection("yxlDB","yxlJH");

        Document document=new Document("_id",199)
                .append("title","MongoDB Insert Demo");
        mongoCollection.deleteOne(document);
        System.out.println("删除数据成功!");
    }
}
