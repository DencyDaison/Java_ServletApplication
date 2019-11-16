package com.face.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;


public class LoginDAO {
	 static ResultSet result;

	public static boolean save(Connection connection, LoginBO logbo) throws SQLException {
		// TODO Auto-generated method stub
		
		Statement stmt=connection.createStatement();
		boolean status=false;
		String query="select * from registration where uname ='"+logbo.getUname()+"' and pswd='"+logbo.getPswd()+"';";
        result = stmt.executeQuery(query);
        if(result.next())
        {
            System.out.println("LoginSuccessful");
            logbo.setUname(result.getString("uname"));
            logbo.setName(result.getString("name"));
            logbo.setEmail(result.getString("email"));
            logbo.setAddress(result.getString("address"));    
            logbo.setMobno(result.getString("mobile"));
            status=true;
           
        }
        else
        {
        	 System.out.println("username and password are incorrect");
        	
        }
        return status;
	}

	

	

	}


