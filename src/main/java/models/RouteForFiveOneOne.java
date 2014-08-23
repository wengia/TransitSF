package models;

import java.util.List;

import org.simpleframework.xml.*;

@Root(name = "Route")
public class RouteForFiveOneOne {
	@Attribute(name = "Name")
	public String name;
	
	@Attribute(name = "Code")
	public String code;
	
	@ElementList(name = "RouteDirectionList", required = false)
	public List<RouteDirection> routeDirectionList;
	
	@Root(name = "RouteDirection")
	public static class RouteDirection {
		@Attribute(name = "Name")
		public String name;
		
		@Attribute(name = "Code")
		public String code;
		
		@ElementList(name = "StopList", required = false)
		public List<Stop> stopList;
		
		@Root(name = "Stop")
		public static class Stop {
			@Attribute(name = "name")
			public String name;
			
			@Attribute(name = "StopCode")
			public String stopcode;
			
			@ElementList(name = "DepartureTimeList", entry = "DepartureTime", required = false)
			public List<String> departureTimeList;
		}
		
	}
}
