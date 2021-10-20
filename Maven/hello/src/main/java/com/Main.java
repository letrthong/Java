// https://maven.apache.org/plugins/maven-jar-plugin/

package com;
import org.apache.commons.codec.digest.DigestUtils;

public class Main {

	public static void main(String[] args) {
		
		 String password = "123456";
		 String result = DigestUtils.sha256Hex(password);
		 System.out.println("Hello World!"); 
		 System.out.println(result.toString()); 
	}

}
