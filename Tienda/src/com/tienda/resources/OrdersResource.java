package com.tienda.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.tienda.bean.Order;
import com.tienda.service.TiendaService;
import com.tienda.util.DataStore;
import com.tienda.util.OrderNotFoundException;

public class OrdersResource { //sub-resource
	@Context
	private UriInfo uriInfo;
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) //MIME/Media type
	@Path("{number}")
	public Response fetchOrderDetailsForUser(@PathParam("uname") String username,@PathParam("number") String number) throws OrderNotFoundException{ //resource method
		return Response.ok(new TiendaService().getOrderDetailsForUser(username, number)).build();
	}

	@GET
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) //MIME/Media type
	public Set<Order> fetchAllOrderForUser(@PathParam("uname") String username){ //resource method
		 Set<Order> set= new TiendaService().getAllOrdersForUser(username);
		 return set;
	}

	@POST
	@Consumes(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response createOrder(Order order) throws URISyntaxException{
		new TiendaService().createOrder(order);
		UriBuilder ub=uriInfo.getBaseUriBuilder();
		ub.path(UserResource.class);
		ub.path(order.getOrderedBy().getName());
		ub.path("orders");
		ub.path(order.getNumber());
		
		System.out.println(ub);
		return Response.created(ub.build()).build();
	}
}
