//*********************************************************************
//
//                        Copyright (C) 2014
//                      Carnegie Learning Inc.
//
//                       All Rights Reserved.
//
//This program is the subject of trade secrets and intellectual
//property rights owned by Carnegie Learning.
//
//This legend must continue to appear in the source code despite
//modifications or enhancements by any party.
//
//*********************************************************************

/*
  $Id$
  $Name$
*/
package restForCRUD.model;

import java.util.HashMap;
import java.util.Map;

public enum TodoDao {

	instance;
	  
	private Map<String, Todo> contentProvider = new HashMap<String, Todo>();
	  
	private TodoDao() {
	    
	    Todo todo = new Todo("1", "Learn REST");
	    todo.setDescription("Read http://www.vogella.com/tutorials/REST/article.html");
	    contentProvider.put("1", todo);
	    todo = new Todo("2", "Do something");
	    todo.setDescription("Read complete http://www.vogella.com");
	    contentProvider.put("2", todo);
	    
	}
	public Map<String, Todo> getModel(){
	    return contentProvider;
	}
}
