package ca.usherbrooke.fgen.api.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.inject.Inject;
import io.quarkus.security.identity.SecurityIdentity;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class authentificationService {

    @Inject
    SecurityIdentity identity;

    @POST
    @Path("testdgdf")
    public String test() {
        return (new User(identity).getUserID());
    }

    public static class User {

        private final String userName;

        User(SecurityIdentity identity) {
            this.userName = identity.getPrincipal().getName();//permet de get le CIP du dude
            //this.userName = identity.getCredentials().toString();
        }

        public String getUserID() {
            return userName;
        }
    }
}