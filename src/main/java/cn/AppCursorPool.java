package cn;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import mongo.MongoDBPoolutil;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class AppCursorPool {
    public static void main(String[] args) {
        MongoCollection mongoCollection= MongoDBPoolutil.getCollection("yxlDB","yxlJH");
        MongoCursor<Document> cursor=mongoCollection.find(eq("_id",1)).iterator();
        while (cursor.hasNext()){
            System.out.println(cursor.next().toJson());
        }
    }
}
