package com.javacodegeeks.enterprise.hibernate;


import org.hibernate.Session;

import com.javacodegeeks.enterprise.hibernate.utils.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Student student = new Student();

        student.setStudentName("Jeremy");
        student.setStudentAge("21");
        
        
        Project project1 = new Project("Security","Spring");
        project1.setStudent(student);
        
        student.getStudentProjects().add(project1);
        
        Project project2 = new Project("Computer Architecture","Spring");
        project2.setStudent(student);
        
        student.getStudentProjects().add(project2);
        
        
        session.save(student);
        session.save(project1);
        session.save(project2);
        
        session.getTransaction().commit();
        System.out.println("Great! Student was saved");
        
    }
}