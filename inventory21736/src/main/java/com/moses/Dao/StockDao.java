package com.moses.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.moses.Controller.DbConnection;
import com.moses.Model.Stock;

public class StockDao {

public static void saveStock(int sn, String name, Double price, String quantity, LocalDate manufactureDate, LocalDate expiryDate) {
		
		try (Connection con=DbConnection.getConnected()){
			String sql_save_stock="INSERT INTO stock ( sn,  name,  price,  quantity,  manufactureDate,  expiryDate) values (?,?,?,?,?,?)";
			
			PreparedStatement statement=con.prepareStatement(sql_save_stock);
			statement.setInt(1, sn);
			statement.setString(2, name);
			statement.setDouble(3, price);
			statement.setString(4, quantity);
			statement.setDate(5, Date.valueOf(manufactureDate));
			statement.setDate(6, Date.valueOf(expiryDate));
			
			
			statement.execute();
			System.out.println("Inserted successfully");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	
}

public static List<Stock> getAllStocks(){
	List<Stock> stockList=new ArrayList<>();
	try (Connection con=DbConnection.getConnected()){
		String sql_get_all_stocks="SELECT * FROM stock";
		
		PreparedStatement statement=con.prepareStatement(sql_get_all_stocks);
		
		ResultSet rs= statement.executeQuery();
		while(rs.next()) {
			 int sn=rs.getInt(1);
			 String name=rs.getString(2);
			 Double price=rs.getDouble(3);
			 String quantity=rs.getString(4);
			 LocalDate manufactureDate=rs.getDate(5).toLocalDate();
			 LocalDate expiryDate=rs.getDate(6).toLocalDate();
			 
			Stock stock=new Stock(sn,  name,  price,  quantity,  manufactureDate,  expiryDate);
			stockList.add(stock);
		
			
		}
		
	} catch (Exception ex) {
		
		ex.printStackTrace();
	}
return stockList;
	

}

}
