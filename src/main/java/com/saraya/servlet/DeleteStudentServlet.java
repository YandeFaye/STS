package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.ServletService;



@WebServlet(urlPatterns = "/delete-student.do")
public class DeleteStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) 
    		throws ServletException, IOException {
    	
    	ServletService service = new ServletService();
    	
    	int id = Integer.parseInt(httpServletRequest.getParameter("id"));
    	
        service.deleteStudent(id);
        
        httpServletResponse.sendRedirect("/students.do");
    }

}
