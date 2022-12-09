package com.saraya.servlet;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.ServletService;



@WebServlet(urlPatterns = "/date.do")


public class AddStudent extends HttpServlet {
    
		ServletService service = new ServletService();
	
		@Override
		 protected void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				request.setAttribute("students", service.getAllStudents());
				request.getRequestDispatcher("WEB-INF/views/addSudent.jsp").forward(request, response);
			}
		
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				String firstname = request.getParameter("firstname");
				String lastname = request.getParameter("lastname");
				LocalDate dateOfBirth = LocalDate.parse(request.getParameter("dateOfBirth"));
				String trainingDuration = request.getParameter("trainingDuration");
				LocalDate registrationDate = LocalDate.parse(request.getParameter("registrationDate"));
				String studentImage = request.getParameter("studentImage");
				String description = request.getParameter("description");
				service.addStudents(firstname,lastname,dateOfBirth,trainingDuration,registrationDate,studentImage,description);
				response.sendRedirect("/students.do");
			}

	}

