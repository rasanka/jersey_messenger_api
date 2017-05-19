package com.ebees.rest.messenger.api.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.ebees.rest.messenger.api.models.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage("404", ex.getMessage(), "URL");
		return Response
				.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}

}
