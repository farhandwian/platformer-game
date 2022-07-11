/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Reyvan
 */
public class TableScore {
    public List<Score> getAll() {
        String sql_select = "SELECT * FROM scores";
        List<Score> scoreList = new ArrayList<>();
        
        try(Connection conn = DBconnection.createNewDBconnection()){
			
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery(sql_select);			

             while (results.next()) {

                    Score scoreObj = new Score();
                    
                    scoreObj.setID(Integer.valueOf(results.getString("id")));
                    scoreObj.setUsername(results.getString("username"));
                    scoreObj.setAdapt(Integer.valueOf(results.getString("adapt")));
                    scoreObj.setFall(Integer.valueOf(results.getString("fall")));
                    
                    scoreList.add(scoreObj);
             }
             
        } catch (SQLException e) {
                e.printStackTrace();
        }
        
        return scoreList;
    }
    
    public void createNew(String username, int adapt, int fall) {
        String insert_query = "INSERT INTO scores VALUES(NULL, '" + username + "', " + Integer.toString(adapt) + ", " + Integer.toString(fall) + ")";;
        
        try(Connection conn = DBconnection.createNewDBconnection()){		
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(insert_query);
        } catch (SQLException e) {
                e.printStackTrace();
        }
    }
}
