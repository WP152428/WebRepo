package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(description = "첫번째 서블릿", urlPatterns = { "/hello" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 데이터 처리 
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		System.out.printf("id : %s, name : %s\n",id,name);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Text</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello, Servlet</h1>");
		out.println("<h2>id : " + id + " , name : " + name + "</h2>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
		
	}

	/* (non-Javadoc)
	    * @see javax.servlet.GenericServlet#init()
	    */
	   @Override
	   public void init() throws ServletException {
	      System.out.println("init() 호출");
	   }
	   /* (non-Javadoc)
	    * @see javax.servlet.http.HttpServlet#service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	    */
	   @Override
	   public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	      System.out.println("service() 호출");
	      super.service(arg0, arg1);
	   }
	   /* (non-Javadoc)
	    * @see javax.servlet.GenericServlet#destroy()
	    */
	   @Override
	   public void destroy() {
	      System.out.println("destroy() 호출111");
	   }
}