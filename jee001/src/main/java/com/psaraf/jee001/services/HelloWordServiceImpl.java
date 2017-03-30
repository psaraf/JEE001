/**
 * 
 */
package com.psaraf.jee001.services;

import javax.enterprise.inject.Default;

/**
 * @author prashantsaraf
 *
 */
@Default
public class HelloWordServiceImpl implements HelloWordService {

	/* (non-Javadoc)
	 * @see com.psaraf.jee001.services.HelloWordService#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String name) {
		return "Hello "+name +"!";
	}

}
