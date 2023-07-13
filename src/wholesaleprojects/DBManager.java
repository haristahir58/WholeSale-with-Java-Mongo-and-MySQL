/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wholesaleprojects;

import com.mongodb.MongoClient;

/**
 *
 * @author hp
 */
public class DBManager {
    public static MongoClient getConnection()
    {
      MongoClient mongo = null;
      
      try
      {
          mongo = new MongoClient("localhost",27017);
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
      }
      return mongo;
      
      
    } 
    
    
}
