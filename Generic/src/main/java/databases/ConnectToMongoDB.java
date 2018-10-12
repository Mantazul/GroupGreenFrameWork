package databases;

import base.CommonAPI;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ConnectToMongoDB extends CommonAPI {
    public static MongoDatabase mongoDatabase = null;
    public static MongoDatabase connectToMongoDB(){
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("PNT");
        System.out.println("Database Connected");
        return mongoDatabase;
    }
    public String insertIntoMongoDB(List<WebElement> elements,String tableName,String columnName){
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection myCollection = mongoDatabase.getCollection(tableName);
        boolean collectionExists = mongoDatabase.listCollectionNames()
                .into(new ArrayList<String>()).contains(tableName);
        if(collectionExists) {
            myCollection.drop();
        }
        for(int i=0; i<elements.size(); i++){
            MongoCollection<Document> collection = mongoDatabase.getCollection(tableName);
            Document document = new Document().append(columnName, elements.get(i).getText());
            collection.insertOne(document);
        }
        return  "Show all location";
    }
    public List<String> LocationListFromMongoDB(String profileName,String columnName){
        List<String> list = new ArrayList<String>();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(profileName);
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for(Document doc:iterable) {
            //int idInt = 0;
            String location = (String) doc.get(columnName);
            list.add(location);
        }
        return list;
    }
}
