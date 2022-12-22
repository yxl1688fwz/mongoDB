package mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class yxl {
    public static void main(String[] args) {
        MongoClient mongoClient=new MongoClient("localhost",27017);
        MongoDatabase mongoDatabase=mongoClient.getDatabase("yxlDB");
        System.out.println("连接成功");
        System.out.println(mongoDatabase.getName());

        MongoCollection collection= mongoDatabase.getCollection("yxlJH");
        System.out.println("然后不会了");

    }
}
