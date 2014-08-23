package models;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "body")
public class NextBusBody {
	@Attribute(name = "copyright")
	public String copyright;
	
	@ElementList(inline = true)
	public List<RouteForNextBus> routeList;
}
