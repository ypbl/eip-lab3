package eip.fileintegration.db;

/**
 *
 * @author ernestoexposito
 */
public class Importer {

    // Java Database Connectivity (JDBC) driver for JavaDB (Derby)   
    
    // The URL to the database (can be retrieved from netbeans/services/Databases
   
    // the database user
    
    // the databased password
    
    // the connection to the database to be used to export data 
    

    public Importer() throws Exception {
        // the connection is established to the database
        
    }

    Object[] importObjects() throws Exception {
        // a SELECT SQL command intended to retrieve all the products from the database is prepared
        
        // a SQL statement to be sent via the database connection is created 
        
        // the SELECT command is executed and the results are retrieved
        
        // a list is created to add the retrieved products
        
            // for each result set the columns are retrieved
            
            // a product is created with the retrieved data
            
            // the product is added to the list
            
        
        // the results set is cloed
        
        // an object of products is sent back
        return null;
    }

    public void close() {
        // the connection is closed

    }
}
