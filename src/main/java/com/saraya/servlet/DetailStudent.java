package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.ServletService;

@WebServlet(urlPatterns = "/detail.do")

public class DetailStudent extends HttpServlet {
	
	 @Override
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) 
    		throws ServletException, IOException {
    	
    	ServletService service = new ServletService();
    	
    	int id = Integer.parseInt(httpServletRequest.getParameter("id"));
    	
    	httpServletRequest.setAttribute("details",service. getDetail(id));
    	httpServletRequest.getRequestDispatcher("WEB-INF/views/detail.jsp").forward(httpServletRequest, httpServletResponse);
        httpServletResponse.sendRedirect("/detail.do");
    }

}
