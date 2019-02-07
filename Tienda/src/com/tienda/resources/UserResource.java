package com.tienda.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.tienda.bean.User;
import com.tienda.service.TiendaService;
import com.tienda.util.UserNotFoundException;

@Path("/users")
public class UserResource { //resource class

	@GET
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) //MIME/Media type
	@Path("{uname}") //template parameter
	public User fetchUserDetails(@PathParam("uname") String username) throws UserNotFoundException{ //resource method
		return new TiendaService().getUserDetails(username);		
	}
	
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void createUser(User user){
		System.out.println(user.getEmail());
		System.out.println(user.getUsername());
		
	}
	
		
}