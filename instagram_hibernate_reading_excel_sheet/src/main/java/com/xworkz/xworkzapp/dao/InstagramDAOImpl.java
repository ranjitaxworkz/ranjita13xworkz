package com.xworkz.xworkzapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.xworkzapp.Single;
import com.xworkz.xworkzapp.dto.InstagramDTO;

public class InstagramDAOImpl implements InstagramDAO{

	public void saveInstaDTO(InstagramDTO dto) {
		System.out.println("Inside saveInstaDTO method ");
		Session session = null;
		
		try {
		   SessionFactory factory = Single.getSessionfactory();
			session = factory.openSession();
		   session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
		    }
//			Single.close();
		}
		
	}

	public void getInstaDetails() {
		Session session = null;
		
		try {
			SessionFactory factory= Single.getSessionfactory();
            session = factory.openSession();
			InstagramDTO instagramDTO = session.get(InstagramDTO.class, 2);
			System.out.println(instagramDTO);
			
		} catch (Exception e) {
			
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session  is closed");
			} else {
				System.out.println("session  is not closed");
            }
//			Single.close();
		}
	}

	@Override
	public void updateData() {
		Session session = null;
		
		try {
			SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			InstagramDTO instagramDTO = session .get(InstagramDTO.class, 2);
			instagramDTO.setType("public");
			Transaction transaction = session.beginTransaction();
		    session.saveOrUpdate(instagramDTO);
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
			Single.close();
		}
		
	}

	@Override
	public void deletedata() {
		Session session = null;
		
		try {
			SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			
			InstagramDTO dto = session .get(InstagramDTO.class, 9);
			Transaction transaction = session.beginTransaction();
		    session.delete(dto);
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
			
			Single.close();
		}
	}
	@Override
	public void loadAllInstagramUserRecords() {
       System.out.println("Invoked loadAllInstagramUserRecords");	
       Session session = null;
       try {
    	   SessionFactory factory = Single.getSessionfactory();
			session = factory.openSession();
			Query namedQuery = session.createNamedQuery("getallrecords");
			List<InstagramDTO> list = namedQuery.list();
			for (InstagramDTO instagramDTO : list) {
				System.out.println(instagramDTO);
				
			}
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
				
			} else {
				System.out.println("session is not closed");
		    }
			
			Single.close();
	}
	
}

	@Override
	public void getInstaUserNameById(int id) {
		 System.out.println("Invoked getInstaUserNameById");	
	       Session session = null;
	       try {
	    	    SessionFactory factory = Single.getSessionfactory();
			    session = factory.openSession();
				Query namedQuery = session.createNamedQuery("getbyid");
				namedQuery.setParameter("Id", id);
				List list = namedQuery.list();
					System.out.println(list);
					
		  } catch (Exception e) {
				e.printStackTrace();
				
		  } finally {
				if (session != null) {
					session.close();
					System.out.println("session is closed");
					
				} else {
					System.out.println("session is not closed");
			    }
				
				Single.close();
		}
		
	}

	@Override
	public void getMaximumNoOfFollowers() {
		System.out.println("Invoked getMaximumNoOfFollowers");	
	       Session session = null;
	       try {
	    	    SessionFactory factory = Single.getSessionfactory();
			    session = factory.openSession();
				Query namedQuery = session.createNamedQuery("getMaxFollowers");
				List list = namedQuery.list();
					System.out.println(list);
					
		  } catch (Exception e) {
				e.printStackTrace();
				
		  } finally {
				if (session != null) {
					session.close();
					System.out.println("session is closed");
					
				} else {
					System.out.println("session is not closed");
			    }
		  }
				Single.close();
		}

	@Override
	public void getMinimumNoOfFollowers() {
		System.out.println("Invoked getMinimumNoOfFollowers");	
	       Session session = null;
	       
	       try {
	    	    SessionFactory factory = Single.getSessionfactory();
			    session = factory.openSession();
				Query namedQuery = session.createNamedQuery("getMinFollowers");
				List list = namedQuery.list();
					System.out.println("minimum Followers of instagram user is :" +list);
					
		  } catch (Exception e) {
				e.printStackTrace();
				
		  } finally {
				if (session != null) {
					session.close();
					System.out.println("session is closed");
					
				} else {
					System.out.println("session is not closed");
			    }
		  
				
				Single.close();
		  }
		}		
	

	@Override
	public void getCountOfAllInstagramRecords() {
		System.out.println("Invoked getCountOfAllInstagramRecords");	
	       Session session = null;
	       try {
	    	    SessionFactory factory = Single.getSessionfactory();
			    session = factory.openSession();
				Query namedQuery = session.createNamedQuery("getCountAllRecords");
				List list = namedQuery.list();
					System.out.println(list);
					
		  } catch (Exception e) {
				e.printStackTrace();
				
		  } finally {
				if (session != null) {
					session.close();
					System.out.println("session is closed");
					
				} else {
					System.out.println("session is not closed");
			    }
				
				Single.close();
		}		
	}

	@Override
	public void getSumOfAllUsersNoOfFollowers() {
		System.out.println("Invoked getSumOfAllUsersNoOfFollowers");	
	       Session session = null;
	       try {
	    	    SessionFactory factory = Single.getSessionfactory();
			    session = factory.openSession();
				Query namedQuery = session.createNamedQuery("getSumOfUserFollowers");
				List list = namedQuery.list();
					System.out.println(list);
					
		  } catch (Exception e) {
				e.printStackTrace();
				
		  } finally {
				if (session != null) {
					session.close();
					System.out.println("session is closed");
					
				} else {
					System.out.println("session is not closed");
			    }
				
				Single.close();
		}		
	}
}


