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

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo {

	private String id;
	private String summary;
	private String description;
	  
	public Todo(){
		
	}
	public Todo (String id, String summary){
		this.id = id;
	    this.summary = summary;
	}
	public String getId() {
	    return id;
	}
	public void setId(String id) {
	    this.id = id;
	}
	public String getSummary() {
	    return summary;
	}
	public void setSummary(String summary) {
	    this.summary = summary;
	}
	public String getDescription() {
	    return description;
	}
	public void setDescription(String description) {
	    this.description = description;
	}
}
