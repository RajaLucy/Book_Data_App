package app.connectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getdata {
	public static void main(String[] args) throws Exception{
		
		Connection con = connectionFact.getConnection();
		String sql="select * from Book_data";
		PreparedStatement pep = con.prepareStatement(sql);
		ResultSet res = pep.executeQuery();
		while(res.next())
		{
			System.out.print(res.getInt(1)+"\t");
			System.out.print(res.getString(2)+"\t");
			System.out.print(res.getInt(3)+"\t");
			System.out.println(res.getString(4));
			
		}
		
		
		
		
	}

}
