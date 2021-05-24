package com.xworkz.xworkzapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.xworkzapp.dto.InstagramDTO;

public class InstagramDAOImpl implements InstagramDAO{

	public void saveInstaDTO(InstagramDTO dto) {
		
		
		SessionFactory sessionfactory = null;
		Session session = null;
		
		try {
			sessionfactory = new Configuration().configure().buildSessionFactory();
			session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			
		} finally {
			
			if (session != null) {
				session.close();
				System.out.println("session is closed");
				
			} else {
				System.out.println("session is not closed");
		    }
			
			if (sessionfactory != null) {
				sessionfactory.close();
				System.out.println("sessionfactory is closed");
				
			} else {
				System.out.println("sessionfactory is not closed");
           }
		}
		
	}

	public void getInstaDetails() {
		
		SessionFactory sessionfactory = null;
		Session session = null;
		
		try {
			sessionfactory = new Configuration().configure().buildSessionFactory();
			session = sessionfactory.openSession();
			InstagramDTO instagramDTO = session.get(InstagramDTO.class, 2);
			System.out.println(instagramDTO);
			
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			
			if (session != null) {
				session.close();
				System.out.println("session  is closed");
				
            } else {
				System.out.println("session  is not closed");
            }
			
			if (sessionfactory != null) {
				sessionfactory.close();
				System.out.println("sessionfactory is closed");
				
			} else {
				System.out.println("sessionfactory is not closed");
           }
		}
	}
	
}
