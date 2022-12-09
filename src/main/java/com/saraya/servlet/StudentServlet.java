package com.saraya.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.Student;
import com.saraya.service.ServletService;

@WebServlet(urlPatterns = "/students.do")

public class StudentServlet  extends HttpServlet {
	
	ServletService service = new ServletService();

	 @Override
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			request.setAttribute("students", service.getAllStudents());
			request.getRequestDispatcher("WEB-INF/views/student-list.jsp").forward(request, response);
		}
	}


