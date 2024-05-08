package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entites.Note;
import com.hellper.FactoriProvider;


public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SaveNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			
			Note note=new Note(title, content, new Date());
			
			//System.out.println(note.getId()+" "+note.getTitle()+" "+note.getContent()+" "+note.getAddedDate());
	       
			//Hibernate :Save
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ram");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			 Session s=FactoriProvider.getfactory().openSession(); 
			
	         //Transaction tx=s.beginTransaction();
	         entityTransaction.begin();
			 entityManager.persist(s.save(note)); 
			 entityTransaction.commit();
			 s.close();
			
			response.setContentType("text/html");
			PrintWriter  out=response.getWriter();
			out.println("<h1>Note is added successfully</h1>");
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
