/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;



/**
 *
 * @author shawp
 */
public class Tables {
    public static void main(String args[]){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st= con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(200),name varchar (200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            st.executeUpdate("insert into appuser(userRole,name,dob,mobileNumber,email,username,password,address) values ('Admin','Admin','10-04-2003','3337726682','admin@gmail.com','admin','admin','India')");
            JOptionPane.showMessageDialog(null, "Table created Succesfully");
                    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
}
