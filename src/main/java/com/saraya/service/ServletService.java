package com.saraya.service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.Student;


public class ServletService {
	private static List<Student> students = new ArrayList<>();
	
	private static int count = 4;
	
	 static {
		 students.add(new Student(1,"Modou","Gueye",LocalDate.of(2022, 10, 25),"6 month",LocalDate.now(),"https://zupimages.net/up/22/32/ga41.png","Modou Gueye student à l'UVS à ma troisieme année de formtion actuellement je suis à saraya Tech pour une formation de devellopement web student à l'UVS à ma troisieme année de formtion actuellement je suis à saraya Tech pour une formation de devellopement web"));
		 students.add(new Student(2,"Yande","Faye",LocalDate.of(2022, 10, 25),"6 month",LocalDate.now(),"https://zupimages.net/up/22/32/tayd.png","Yande Faye studente à l'UVS à ma troisieme année de formtion actuellement je suis à saraya Tech pour une formation de devellopement web"));
		 students.add(new Student(3,"Diodio","Diallo",LocalDate.of(2022, 10, 25),"6 month",LocalDate.now(),"https://zupimages.net/up/22/32/fjt2.png","Diodio Diallo studente à l'UVS à ma troisieme année de formtion actuellement je suis à saraya Tech pour une formation de devellopement web"));
		 students.add(new Student(4,"Denise","Ndiaye",LocalDate.of(2022, 10, 25),"6 month",LocalDate.now(),"https://zupimages.net/up/22/32/e6b0.png","Denise Ndiaye studente à l'UVS à ma troisieme année de formtion actuellement je suis à saraya Tech pour une formation de devellopement web"));
		 
	 }

	 public List <Student> getAllStudents(){
		return students;
		 
	 }
	 public void addStudents(String firstname,String lastname,LocalDate dateOfBirth,String trainingDuration,LocalDate registrationDate,
			 String studentImage, String description) {
		 students.add(new Student(++count, firstname,lastname,dateOfBirth,trainingDuration,registrationDate,studentImage,description));
		 
	
}

	public void deleteStudent(int id) {
		Iterator <Student> iterate = students.iterator();
		while(iterate.hasNext()) {
			Student student = iterate.next();
			if(student.getId() == id) {
				iterate.remove();
			}
		}
		
	}
	public Student   getDetail(int id) {
			Iterator <Student> iterator = students.iterator();
			while(iterator.hasNext()) {
				Student student = iterator.next();
				if(student.getId() == id) {
					return student;
				}
			}
			return null;
		}
	}
	

	
	

	 

