package com.lms.lmstest;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lms.Application;
import com.lms.model.Book;
import com.lms.service.LmsService;


//@ContextConfiguration(locations = "classpath:/META-INF/ldap-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
public class Testtest {
	
	      @Autowired
	      private  LmsService lmsService;
	
	     @Test
	     public void Lmstest()
	     {
	    	 Book book = new Book();
	    	 book.setBookauthor("raj");
	    	 book.setBookname("java");
	    	 book.setBookduedate("12/02/2017");
	    	 book.setIsbn_no("45262");
	    	 book.setBookduedate("23/05/2016");
	    	 
	    	 Book obj= lmsService.save(book);
	    	 assertNotNull(obj);
	    	 
	     }

}
