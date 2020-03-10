package io.alchemystudio.resteasy.links;

import org.jboss.resteasy.links.RESTServiceDiscovery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

// 这个class用来展示`ClassLinksProvider`的能力
// 可以看到这个class里面没有`RESTServiceDiscovery`的实例
// 但是如果访问`ClassLinksProviderService.getForClass()`方法，还是可以
// 重建基于它的`RESTServiceDiscovery`信息。
// 具体看`README.md`

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Car {
    @XmlID
    @XmlAttribute
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
