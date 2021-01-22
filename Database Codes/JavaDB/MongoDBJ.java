import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class MongoDBJ {

  private static MongoClient mongoClient;

  public static void main( String args[] ) {
    try
    {
      mongoClient = new MongoClient();
      MongoDatabase database = mongoClient.getDatabase("test");
      System.out.println("Connect to database successfully");

      MongoCollection<Document> collection = database.getCollection("inventory");
      System.out.println("Collection mycol selected successfully");

      Document myDoc = collection.find().first();
      System.out.println(myDoc.toJson());

      MongoCursor<Document> cursor = collection.find().iterator();
      try {
        while (cursor.hasNext()) {
          System.out.println(cursor.next().toJson());
        }
      } finally {
        cursor.close();
      }
    } catch(Exception e){
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    }
  }
}