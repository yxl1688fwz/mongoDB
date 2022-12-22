package mongo;

import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;

public class MongoDBPoolutil {
    private static MongoClient client=null;
    static {
        if(client==null){
            MongoClientOptions.Builder builder=new MongoClientOptions.Builder();
            builder.connectionsPerHost(10);         //每个地址最大连接数
            builder.connectTimeout(5000);           //连接超过时间
            builder.socketTimeout(5000);            //设置读写操作超时时间
            ServerAddress address =new ServerAddress("localhost",27017);
            client=new MongoClient(address,builder.build());
//            client=new MongoClient(address,builder.build());
        }
    }

    public static MongoDatabase getDatabase(String dbName){ return client.getDatabase(dbName);}

    public static MongoCollection getCollection(String dbName,String collName){
        return client.getDatabase(dbName).getCollection(collName);
    }

}
