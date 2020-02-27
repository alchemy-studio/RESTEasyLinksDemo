package io.weli.resteasy2445;

import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;
import org.jboss.resteasy.links.RESTServiceDiscovery;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/links")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class FooResource {

    // Addlinks和LinkResource必须都有
    // 但是LinkResource作为类型的生成者，可以放在另外的方法，如下面的dummy方法所示
    @AddLinks
    @GET
    public Fruit get() {
        return new Fruit("Apple");
    }

    @LinkResource
    // 这个@POST，或者@GET，必须存在，这个方法才会被resteasy-links扫描
    @POST
    // Fruit类型存在于返回值或者方法的参数类型里，都可以被扫描到。
    public Fruit dummy() {
        return null;
    }

}

