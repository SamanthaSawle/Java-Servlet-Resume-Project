package edu.cvtc.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/Home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("\n<html>\n<head>\n<title>My Personal Website Home Page</title>\n</head>");
		pw.println("\n<body style='background-color:#7281a0; color:#e3e0e8;'>\n<header>\n<h1 style='text-align: center; background-color: #314155; border: 1px solid #e3e0e8; display: inline-block;'>Samantha Sawle's Personal Website</h1></header>");
		pw.println("\n<nav style='display: block; color:##fbdb7f; background-color: #7281a0; border: 1px solid #e3e0e8; box-shadow: 2px 2px 2px 2px #330000; display: inline-block; text-align: center; font-weight: bold; font-size: 120%; margin-right: 1%; margin-top: 1%; width: 10em; text-decoration: none;'>"
				+ "\n<ul style=' list-style: none;'>\n<li><a href='Home'>Home</a></li>"
				+ "\n<li><a href='About'>About</a></li>"
				+ "\n<li><a href='Contact'>Contact</a></li>\n</ul>\n</nav>");
		pw.println("\n<footer style='padding: 2%;'>\n<small>Copyright &copy Samantha Sawle</small>\n</footer>");		
		pw.println("\n</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
