package io.alchemystudio.resteasy.links;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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

    // 这个constructor必须存在，否则jackson无法正确序列化这个class
    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
