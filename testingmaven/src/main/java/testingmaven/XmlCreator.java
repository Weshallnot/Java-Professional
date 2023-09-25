package testingmaven;

import java.io.File;

import javax.xml.bind.JAXB;

import testingmaven.beans.User;

public class XmlCreator {

	public static void main(String[] args) {
		
		User user = new User();
		 user.setName("Jon Skeet");
		 user.setUserID(8884321);
		 try {
		 JAXB.marshal(user, new File("UserDetails.xml"));
		 } catch (Exception e) {
		 System.err.println("Exception occurred while writing in XML!");
		 } finally {
		 System.out.println("XML created");
		 }

		
	}

}
