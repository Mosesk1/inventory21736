package com.moses.Controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moses.Dao.StockDao;

/**
 * Servlet implementation class Record
 */
@WebServlet("/Record")
public class Record extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Record() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out = response.getWriter();
		
		int sn=Integer.parseInt(request.getParameter("sn"));
		String name=request.getParameter("name");
		Double price=Double.parseDouble(request.getParameter("price"));
		String quantity=request.getParameter("quantity");
		LocalDate manufactureDate= LocalDate.now();
		LocalDate expiryDate=LocalDate.parse(request.getParameter("expiryDate"));
		
		
		StockDao.saveStock( sn,  name,  price,  quantity,  manufactureDate,  expiryDate);
		//out.println("save "+ sn);
		response.sendRedirect("inventory.jsp");

	}

}
