package com.lms.serviceImple;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lms.model.Book;
import com.lms.service.LmsService;
import com.lms.repository.LmsRepository;

@Service
public  class LmsServiceImple implements LmsService {
	
	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	LmsRepository lmsRepository;
	
	@Override
	public Book save(Book object) {
		logger.info("create book service started");
			try{
			  object=lmsRepository.save(object);
			    }
			catch(Exception e){
				logger.error(" Exception encounter while saving the data  ");
				e.printStackTrace();
			
		            	}
			logger.info("create book service ended");
		    return object;
			
	}
	@Override
	public Book getById(String id)  {
		logger.info("get by id service started");
		Book bookid=null;
		try{
			  bookid=lmsRepository.findOne(id);
		
			    }
			catch(Exception e){
				logger.error(" Exception encounter while saving the data  ");
				e.printStackTrace();
				//throw new LmsException("Could not retrieve Agent by specified Id");
				
            	}
			logger.info("create book service ended");
		    return bookid;
	
		
	}
	@Override
	public List<Book> getAll( ) 
	{
		logger.info("get All service started");
		List<Book>  list = new ArrayList<Book>();
		try{
			list=(List<Book>) lmsRepository.findAll();
			
		}
		catch(Exception e)
		{
			logger.error(" Exception encounter while saving the data  ");
			e.printStackTrace();
	            	}
		logger.info("get All service ended");
		return list;
			
	  }
	/*@Override
	public Boolean delete(String id) 
	{
	       Boolean bolean=false;
	         try{
	        	    bolean=lmsRepository.delete(id);
	         }
	         catch(Exception e)
	 		{
	 			logger.error(" Exception encounter while saving the data  ");
	 			e.printStackTrace();
	 	            	}
	    
	}
	 */
	
	public String delete(String id)
	{
		
		     
		try{
             lmsRepository.delete(id);
			
		}
		 catch(Exception e)
 		{
 			logger.error(" Exception encounter while saving the data  ");
 			e.printStackTrace();
 	            	}
		
		return "id has been deleted";
          
	}
	
	@Override
	public Book updateAgent(String id, Book object) {
		
		return null;
	}
	
	
	
	
	
	

}
