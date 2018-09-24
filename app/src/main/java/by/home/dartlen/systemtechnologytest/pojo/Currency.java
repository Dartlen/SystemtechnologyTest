package by.home.dartlen.systemtechnologytest.pojo;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Currency")
public class Currency {
    private String content;
    @Attribute
    private String Id;
    @Element(name="NumCode")
    private String NumCode;
    @Element(name="CharCode")
    private String CharCode;
    @Element(name="Scale")
    private String Scale;
    @Element(name="Name")
    private String Name;
    @Element(name="Rate")
    private String Rate;
}
