/**
 * 
 */
package com.shue.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tim
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(EurekaApplication.class, args);
	}

}
