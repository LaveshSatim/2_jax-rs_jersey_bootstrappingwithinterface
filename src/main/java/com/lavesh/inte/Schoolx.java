package com.lavesh.inte;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.ext.Provider;

public interface Schoolx {

	@GET
	@Path("/{schoolname}/{location}/type")
	@Produces("text/plain")
	public String getdata(@QueryParam("division") String divison, @PathParam("schoolname") String schoolname,
			@PathParam("location") String location);
}
