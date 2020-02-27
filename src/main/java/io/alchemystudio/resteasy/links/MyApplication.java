package io.alchemystudio.resteasy.links;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;

@ApplicationPath("/")
public class MyApplication extends Application {

// 去掉下面的也可以
//    HashSet<Object> singletons = new HashSet<Object>();
//
//    public MyApplication() {
//        singletons.add(new FooResource());
//
//    }

}
