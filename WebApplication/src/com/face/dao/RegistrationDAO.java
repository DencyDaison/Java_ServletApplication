package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBO;

public class RegistrationDAO {

	public static void save(Connection connection, RegisterBO regbo) throws SQLException{
		// TODO Auto-generated method stub
		Statement stmt=connection.createStatement();
		String query="INSERT INTO registration(name,address,email,mobile,uname,pswd)Values('"+regbo.getName()+"','"+regbo.getAddress()+"','"+regbo.getEmail()+"','"+regbo.getMobno()+"','"+regbo.getUname()+"','"+regbo.getPswd()+"')";
		int resultset=stmt.executeUpdate(query);
		if(resultset==1)
		{
			System.out.println("Data inserted Successfuly");
			
					
		}
		else
		{
			System.out.println("please check and try");
		}
	}
	

}
