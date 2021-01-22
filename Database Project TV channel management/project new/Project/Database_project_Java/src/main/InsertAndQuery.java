/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author user2
 */
public class InsertAndQuery {
    
    private Main main=new Main();
    private static String t;
    
    
    @FXML
    private Button Insert;
    @FXML
    private Button Query;
    
    @FXML
    private TextField Tquery;
    @FXML
    private TextField InsertTable;

    @FXML
    private void InsertOnAction(ActionEvent event) throws IOException, SQLException,InvocationTargetException, Exception
    {
            String AddInTable = InsertTable.getText();
            
            try
            {
                main.Insert();
               
            } catch (Exception e)
            {
                //System.out.println("main.LoginController.");
                e.printStackTrace();
            }

        }
    
    @FXML
    private void QueryOnAction(ActionEvent event) throws IOException, SQLException,InvocationTargetException,NullPointerException, Exception
    {
            String table = Tquery.getText();
            this.t=table;
            
            try
            {
                //main.getString(table);
                main.showTable();
            } catch (Exception e)
            {
                //System.out.println("main.LoginController.");
                e.printStackTrace();
            }

        }
    /*public String retString()
    {    
        
    }*/

    public String retString() {
        return t;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
