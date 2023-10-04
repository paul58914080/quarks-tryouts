package com.example

import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @Inject
    lateinit var greetingConfig: GreetingConfig

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "${greetingConfig.message()} from RESTEasy Reactive"
}