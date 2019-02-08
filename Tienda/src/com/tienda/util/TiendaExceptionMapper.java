package com.tienda.util;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
@Provider //component class
public class TiendaExceptionMapper implements ExceptionMapper<TiendaException> {

	@Override
	public Response toResponse(TiendaException arg0) {
		return Response.status(Response.Status.BAD_REQUEST)
				.entity(arg0.getExceptionMessage())
				.build();
	}

}