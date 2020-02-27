package io.alchemystudio.resteasy.links;


import org.jboss.resteasy.links.RESTServiceDiscovery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Fruit {
    @XmlID
    @XmlAttribute
    private String name;

    // 这个必须有，最终生成的atom数据在这里
    @XmlElement
    private RESTServiceDiscovery rest;

    public RESTServiceDiscovery getRest() {
        return rest;
    }

    public void setRest(RESTServiceDiscovery rest) {
        this.rest = rest;
    }

    public Fruit() {};

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
