package testingmaven;

import java.io.File;

import javax.xml.bind.JAXB;

import testingmaven.beans.User;

public class XmlReader {

	public static void main(String[] args) {

		try {
			User user = JAXB.unmarshal(new File("UserDetails.xml"), User.class);
			System.out.println(user.getName()); // prints Jon Skeet
			System.out.println(user.getUserID()); // prints 8884321
		} catch (Exception e) {
			System.err.println("Exception occurred while reading the XML!");
		}
	}

}
