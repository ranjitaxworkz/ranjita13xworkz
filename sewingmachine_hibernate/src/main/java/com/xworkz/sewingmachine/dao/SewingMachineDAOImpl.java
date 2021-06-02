package com.xworkz.sewingmachine.dao;

import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.sewingmachine.dto.SewingMachineDTO;
import com.xworkz.xworkzapp.Single;

public class SewingMachineDAOImpl implements SewingMachineDAO {

	@Override
	public void saveSewingMachinedetails(SewingMachineDTO dto) {

		Session session = null;

		try {
			SessionFactory factory = Single.getSessionfactory();
			session = factory.openSession();
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}
		Single.close();

	}

	@Override
	public void fetchSewingMachineDetails() {

		Session session = null;

		try {
			SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			SewingMachineDTO machineDTO = session.get(SewingMachineDTO.class, 4);
			System.out.println(machineDTO);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}

		Single.close();
	}

	@Override
	public void updateSewingMachineDetails() {
		Session session = null;

		try {
			SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			SewingMachineDTO machineDTO = session.get(SewingMachineDTO.class, 1);
			machineDTO.setColor("red");
			Transaction transaction = session.beginTransaction();
            session.update(machineDTO);
			 transaction.commit();

	    } catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			
		} finally {
			if (session != null ) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}
		Single.close();

	}

	@Override
	public void deleteSewingMachineDetails() {
		Session session = null;
		
        try {
        	SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			SewingMachineDTO dto = session.get(SewingMachineDTO.class, 5);
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
         }
        Single.close();
	}

	@Override
	public void loadAllSewingMachineRecords() {
		System.out.println("Invoked loadAllSewingMachineRecords");
		Session session = null;

		try {
			SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			Query namedQuery = session.createNamedQuery("GetAllRecords");
			List<SewingMachineDTO> list = namedQuery.list();
			for (SewingMachineDTO DTO : list) {
				System.out.println(DTO);
				}
			System.out.println(list);	
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}

		Single.close();
	}

	@Override
	public void getMaxPriceOfSewingMachine() {
		System.out.println("Invoked getMaxPriceOfSewingMachine");
		Session session = null;

		try {
			SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			Query namedQuery = session.createNamedQuery("GetMaxPriceOfSewingMachine");
			List list = namedQuery.list();
			
		    System.out.println(list);	
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}

		Single.close();
	}
	

	@Override
	public void getminPriceOfSewingMachine() {
		System.out.println("Invoked getminPriceOfSewingMachine");
		Session session = null;

		try {
			SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			Query namedQuery = session.createNamedQuery("GetminPriceOfSewingMachine");
			List list = namedQuery.list();
			
		    System.out.println(list);	
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}

		Single.close();		
	}

	@Override
	public void getAvgPriceOfSewingMachine() {
		System.out.println("Invoked getAvgPriceOfSewingMachine");
		Session session = null;

		try {
			SessionFactory sessionfactory = Single.getSessionfactory();
			session = sessionfactory.openSession();
			Query namedQuery = session.createNamedQuery("GetAvgPrice");
			List list = namedQuery.list();
			
		    System.out.println(list);	
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}

		Single.close();				
	}

			
		@Override
		public void getSumOfAllSewingMachinePrice() {
			System.out.println("Invoked getSumOfAllSewingMachinePrice");
			Session session = null;

			try {
				SessionFactory sessionfactory = Single.getSessionfactory();
				session = sessionfactory.openSession();
				Query namedQuery = session.createNamedQuery("GetTotalPriceOfAllRecords");
				List list = namedQuery.list();
				
			    System.out.println(list);	
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				if (session != null) {
					session.close();
					System.out.println("Session is Closed");
				} else {
					System.out.println("Session is not Closed");
				}
		}

		Single.close();			
	}

}
