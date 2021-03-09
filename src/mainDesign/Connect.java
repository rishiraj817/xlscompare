/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainDesign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hp
 */
public class Connect {
    public Connection con=null;
    public PreparedStatement ps;
    public  Statement st=null;
    public ResultSet rs=null;
    
    Connect(){try{
    Class.forName("oracle.jdbc.OracleDriver");
         System.out.println("hogya"); 
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
      
        System.out.println("hogya"); 
    
    }
    catch(Exception e)
    {  System.out.println(e);
    }
    
    
    }
    
}
