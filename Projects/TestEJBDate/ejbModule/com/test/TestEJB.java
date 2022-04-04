package com.test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestEJB
 */
@Stateless
@LocalBean
public class TestEJB {

    /**
     * Default constructor. 
     */
    public TestEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public String returnDate()
    {
    	return "\n the date is : " + java.time.LocalDate.now();
    }

}
