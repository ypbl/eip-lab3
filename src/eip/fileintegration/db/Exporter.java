package eip.fileintegration.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ernestoexposito
 */
public class Exporter {

    // Java Database Connectivity (JDBC) driver for JavaDB (Derby)   
    
    // The URL to the database (can be retrieved from netbeans/services/Databases
   
    // the database user
    
    // the databased password
    
    // the connection to the database to be used to export data 
    
    

    public Exporter() throws Exception {
        // the connection is established to the database
        
    }

    public void exportObject(Product p)  {
        // a SQL statement to be sent via the database connection is created
        // the SQL string statement is prepared including the product attributes
        // the statement is executed
        // the statmeent is closed.

    }
    
    public void close()  
    {
        // the connection is closed.

    }

}
