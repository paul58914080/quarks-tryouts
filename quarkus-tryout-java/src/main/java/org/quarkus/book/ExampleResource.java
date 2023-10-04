package org.quarkus.book;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class ExampleResource {
  @ConfigProperty(name = "books.genre", defaultValue = "Science Fiction")
  String genre;


  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    System.out.println(genre);
    return "Hello from RESTEasy Reactive";
  }

}
