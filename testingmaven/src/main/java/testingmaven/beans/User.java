package testingmaven.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private long userID;
	 private String name;
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 

}
