package com.lavesh.inte;

import java.security.SecureRandom;

import jakarta.ws.rs.Path;

@Path("/newschool")
public class Newschool implements Schoolx {

	@Override
	public String getdata(String divison, String schoolname, String location) {
		return "id : " + new SecureRandom().nextDouble() * 100 + "division : " + divison + " schoolname : " + schoolname
				+ " location : " + location;
	}

}
