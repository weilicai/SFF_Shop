package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse respones) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cName = new String(request.getParameter("cName").getBytes("ISO-8859-1"), "UTF-8");
		switch (cName) {
		case "TÐô" :
			respones.sendRedirect("T_shirt.html");
			break;
		case "Âí¼×" :
			respones.sendRedirect("majia.html");
			break;
		case "¼Ð¿Ë" : 
			respones.sendRedirect("jacket.html");
			break;
		case "ÎÀÒÂ" :
			respones.sendRedirect("fleece.html");
			break;
		case "ÐÝÏÐ¿ã" : 
			respones.sendRedirect("pants.html");
			break;
		default :
			respones.sendRedirect("SFF.html");
		}
		
	}
}
