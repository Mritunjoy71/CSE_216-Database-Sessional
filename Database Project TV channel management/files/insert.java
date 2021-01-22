/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracledb;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nayeem
 */
public class insert
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        // TODO code application logic here

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CSE216", "1");
            String sql = "insert into USERS (USERNAME, PASSWORD, FULLNAME) values(?,?,?)" ;
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "1505007");
            pst.setString(2, "123");
            pst.setString(3, "Abcd");
            pst.executeUpdate();
            pst.close();
            con.close();
        }catch (SQLException e)
        {
            System.out.println("Connection Failed! Check it from console");
            e.printStackTrace();
        }
     
    }

}
