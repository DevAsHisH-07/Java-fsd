package com.admin.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admin.dbutil.DbUtil;
import com.admin.pojo.User;

public class UserDao {

 public void saveUser(User user) {
     Transaction transaction = null;
     try (Session session = DbUtil.dbConn()) {
         transaction = session.beginTransaction();
         session.save(user);
         transaction.commit();
     } catch (Exception e) {
         if (transaction != null) {
             transaction.rollback();
         }
         e.printStackTrace();
     }
 }

 public User getUserByEmail(String email) {
     try (Session session = DbUtil.dbConn()) {
         return session.createQuery("FROM User WHERE email = :email", User.class)
                 .setParameter("email", email)
                 .uniqueResult();
     } catch (Exception e) {
         e.printStackTrace();
     }
     return null;
 }
}


