package com.ebees.rest.messenger.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("injectdemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class DemoResource {

	@Path("/testparam")
	public String testParam(@MatrixParam("param") String param,
			@HeaderParam("sessionId") String sessionId,
			@CookieParam("name") String cookie) {
		return "MATRIX -"+param+" HEADER -"+sessionId+" COOKIE -"+cookie; 
	}
	
	@Path("/context")
	public String testContext(@Context UriInfo uriInfo,
			@Context HttpHeaders header) {
		String url = uriInfo.getAbsolutePath().toString();
		String cookie = header.getCookies().toString();
		
		return "URL -"+url+" COOKIES -"+cookie;
	}
}
