package com.lms.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Book;
import com.lms.service.LmsService;


@RestController
@RequestMapping("/lms")
public class LmsController {
	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired                 // it will go to service
	 LmsService lmsService;
	
		@RequestMapping("/hi")
	    private String test() {
		
		return "hello";

	}
	      // SAVE Controller 
	
	@RequestMapping(method=RequestMethod.POST)
	public Book create(@RequestBody Book book){
	
		logger.info("create by id controller started");
		//logger.info("Insert  book data controller started ==> "+book.toString());
	    // List<Book> list= new ArrayList<Book>();
		     try {
		    	 if(book!=null)
		    	   book=lmsService.save(book);
		         }
            catch(Exception e)
		      {
    	          logger.error("input id is wrong");
    	          e.printStackTrace();  
    	      }
		     
		   //  list.add(book);
		 	 logger.info("create by id controller ended");
		 	  
		 	
	             return book;
	
           }
	
	// GetbyId controller
	
	@RequestMapping(method=RequestMethod.GET,value="{id}")
	public List<Book> getById(@PathVariable String id)
	{
	     logger.info("Get agent by id controller started");
	     List <Book> list = new ArrayList<Book>();
	     
	     Book book=null;
		try{
			if(id!=null && !id.isEmpty())
		     book=lmsService.getById(id);
			
		}
		  catch(Exception e)
        {
          logger.error("input id is wrong");
          e.printStackTrace();  	
	    } 
		
	     list.add(book);
	     
		 logger.info("Get agent by id controller ended");
		 
		return list;
		
	}	
	      //Get all controller
	    
	@RequestMapping(method=RequestMethod.GET)
	public List<Book> getAll( )
	//public List<Book> getAll(@RequestParam String Query)
	{
		logger.info("getAll controller started");
		List<Book> list= new ArrayList<Book>();
		List<Book> object=null;
		try{
			 object=lmsService.getAll();
		}
		  catch(Exception e)
        {
          logger.error("input id is wrong");
          e.printStackTrace();  	
	    } 
	        list.addAll(object);
	        logger.info("getAll controller ended");
		    return list;
		
	}
	         //Delete controller        
	
	@SuppressWarnings("unused")
	@RequestMapping(method=RequestMethod.DELETE,value="{id}")
	public String delete(@PathVariable String id)
	{
		logger.info("delete controller started");
	 
		try{
			
			String object= lmsService.delete(id);
			
		}
		  catch(Exception e)
        {
			  
          logger.error("input id is wrong");
          e.printStackTrace();  	
	    } 
		logger.info("delete controller started");
	
		return id;	
	}
	
	   
	
	
	
}