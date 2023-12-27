package app.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.DAO.bookDAO;
import app.DTO.BookDTO;
@WebServlet("/LOG")
public class bookServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html");
	
		//get parameter data
		String Name = req.getParameter("bname");
		String Price = req.getParameter("bprice");
		String Author = req.getParameter("bauthor");
		
		//pass to DAO methods
		
		BookDTO b=new BookDTO();
		b.setBookName(Name);
		if (Price != null && !Price.isEmpty()) {
		    try {
		        int parsedPrice = Integer.parseInt(Price);
		        // Use parsedPrice where needed
		        b.setBookPrice(parsedPrice);
		    } catch (NumberFormatException e) {
		        // Handle the case where the input is not a valid integer
		        e.printStackTrace(); // or log the error
		    }
		} 
	
		b.setBookAuthor(Author);
		
		//create object DAO and call methods
		
		bookDAO dao=new bookDAO();
		try {
			
			if(dao.saveBook(b))
			{
			req.setAttribute("Success", "RECORD SAVED");
				
				
			}
			else {
				req.setAttribute("Error", "FAILED");
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("insert.jsp").include(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		bookDAO dao=new bookDAO();
		try {
			List<BookDTO> books = dao.getBooks();
					req.setAttribute("Listbooks", books);
					req.getRequestDispatcher("data.jsp").forward(req, resp);

	            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
	


