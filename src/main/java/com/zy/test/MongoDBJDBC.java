package com.zy.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class MongoDBJDBC {

    public static void main(String args[]) {
        try {
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            // 连接到数据库
            MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");

            // 创建集合
          /*  mongoDatabase.createCollection("test1");
            System.out.println("create collection successful");*/

            // 写入数据 - 首先选择集合
            MongoCollection<Document> test1 = mongoDatabase.getCollection("test1");


            //关于更新文档的相关操作
 /*           test1.updateMany(Filters.eq("age",22),new Document("$set",new Document("age",99)));
            System.out.println("更新成功");*/

            //删除文档
            test1.deleteMany(Filters.eq("age",99));
            System.out.println("删除成功!");


        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}