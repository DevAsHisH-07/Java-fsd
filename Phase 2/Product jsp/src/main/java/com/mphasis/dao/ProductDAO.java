package com.mphasis.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mphasis.dbutil.DbUtil;
import com.mphasis.pojo.Product;

public class ProductDAO {

	public int addproduct(Product product) {
		Session session=DbUtil.dbConn();
		Transaction trans=session.beginTransaction();
		int value=(Integer) session.save(product);
		trans.commit();
		session.close();
		return value;
		
	}
	
	public List<Product> display(){
		Session session=DbUtil.dbConn();
		Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Product");
		List<Product> list=query.list();
		trans.commit();
		session.close();
		return list;
	}
	
	public List<Product> delete(Product product){
		Session session=DbUtil.dbConn();
		Transaction trans=session.beginTransaction();
		session.delete(product);
		trans.commit();
		session.close();
		return display();
	}
	
	
}
