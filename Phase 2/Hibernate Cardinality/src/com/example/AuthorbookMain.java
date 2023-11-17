package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class AuthorbookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loads the hibernate.cfg.xml file
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//in the file start reading the tags 		
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();	
		//go to session factory and read the tags 		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		//all the crud operations need to be done in session 
		Session s=sf.openSession();
		//what ever the operation of crud happening it need to get saved 
		Transaction t=s.beginTransaction();
		Author au=new Author();
//		au.setName("Wilson");
//		au.setEmail("w@c.c");
//		s.save(au);   //inserted 
//
//		Book book=new Book();
//		book.setTitle("C");
//		book.setAuthor(au);
//		s.save(book);
		Query<Author> q = s.createQuery("select name from Author a left join Book b on a.id=b.id where title='java'");
		List<Author> list= q.list();
		for(Author a:list) {
			System.out.println(a);
		}


		t.commit();
		s.close();
		sf.close();

	}

}
