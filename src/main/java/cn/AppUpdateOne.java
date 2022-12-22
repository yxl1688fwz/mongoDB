package cn;

import com.mongodb.client.MongoCollection;
import mongo.MongoDBPoolutil;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class AppUpdateOne {
    public static void main(String[] args) {
        MongoCollection mongoCollection= MongoDBPoolutil.getCollection("yxlDB","yxlJH");
        mongoCollection.updateOne(eq("_id",199),new Document("$set",new Document("likes",52)));
        System.out.println("修改数据成功！");
    }
}
