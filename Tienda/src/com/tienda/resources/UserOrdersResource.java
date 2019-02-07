package com.tienda.resources;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.tienda.bean.Order;
import com.tienda.service.TiendaService;
import com.tienda.util.UserNotFoundException;

@Path("orders")
public class UserOrdersResource {
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON}) //MIME/Media type
	public Set<Order> fetchUserDetails(@QueryParam("uname") String username) throws UserNotFoundException{ //resource method
		return new TiendaService().getAllOrdersForUser(username);		
	}

}
