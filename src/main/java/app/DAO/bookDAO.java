package app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import app.DTO.BookDTO;
import app.connectionPool.connectionFact;

public class bookDAO {
	
	//insert details database
	public boolean saveBook(BookDTO b)throws Exception
	{
		
		boolean result=false;
		Connection con = connectionFact.getConnection();
		String sql="insert into Book_data (bookName,bookPrice,bookAuthor) values(?,?,?)";
		PreparedStatement pep = con.prepareStatement(sql);
		pep.setString(1, b.getBookName());
		pep.setInt(2, b.getBookPrice());
		pep.setString(3, b.getBookAuthor());
		int count = pep.executeUpdate();
		if(count >0)
		{
			result=true;
		}
		return result;
	}
	//get all details 
	
	public List<BookDTO> getBooks() throws Exception
	{
		String sql="select * from Book_data";
		List<BookDTO> books=new ArrayList<>();
 		
		Connection con = connectionFact.getConnection();
		PreparedStatement pep = con.prepareStatement(sql);
		ResultSet res = pep.executeQuery();
		while(res.next())
		{
			BookDTO b=new BookDTO();
		    b.setBookId(res.getInt(1));
		    b.setBookName(res.getString(2));
		    b.setBookPrice(res.getInt(3));
		    b.setBookAuthor(res.getString(4));
		    books.add(b);
		}
		
		return books;
		
		
		
	}
	
	

}
