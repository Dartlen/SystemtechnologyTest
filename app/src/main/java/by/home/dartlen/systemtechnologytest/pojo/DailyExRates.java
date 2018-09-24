package by.home.dartlen.systemtechnologytest.pojo;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

@Root(name = "DailyExRates")
public class DailyExRates {
    @Attribute
    public String Date;

    @ElementList(inline=true, entry="Currency")
    public List<Currency> list;
}
