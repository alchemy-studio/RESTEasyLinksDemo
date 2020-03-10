package io.alchemystudio.resteasy.links;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import org.jboss.resteasy.core.ResourceMethodRegistry;
import org.jboss.resteasy.core.ResteasyContext;
import org.jboss.resteasy.links.RESTServiceDiscovery;
import org.jboss.resteasy.links.ClassLinksProvider;
import org.jboss.resteasy.spi.Registry;

@Path("/class")
public class ClassLinksProviderService {

    @Context
    private UriInfo uriInfo;

    @GET
    @Produces("application/json")
    public RESTServiceDiscovery getForClass(@QueryParam("className") String className) throws ClassNotFoundException {
        ClassLinksProvider provider = new ClassLinksProvider(uriInfo, getResourceMethodRegistry());
        return provider.getLinks(Class.forName(className));
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Fruit.class.getName());
        System.out.println(Class.forName(Fruit.class.getName()));
    }

    private ResourceMethodRegistry getResourceMethodRegistry() {
        return (ResourceMethodRegistry) ResteasyContext.getContextData(Registry.class);
    }
}
