package models;

import java.util.List;

import org.simpleframework.xml.*;

@Root(name = "route")
public class RouteForNextBus {
	@Attribute(name = "tag")
	public String tag;
	
	@Attribute(name = "title")
	public String title;
	
	@Attribute(name = "shortTitle", required = false)
	public String shortTitle;
	
	// Detail of One Route
	@Attribute(name = "color", required = false)
	public String color;
	
	@Attribute(name = "oppositeColor", required = false)
	public String oppositeColor;
	
	@Attribute(name = "latMin", required = false)
	public String latMin;
	
	@Attribute(name = "latMax", required = false)
	public String latMax;
	
	@Attribute(name = "lonMin", required = false)
	public String lonMin;
	
	@Attribute(name = "lonMax", required = false)
	public String lonMax;
	
	@ElementList(inline = true, required = false)
	List<Stop> stopList;
	
	@ElementList(inline = true, required = false)
	List<Direction> directions;
	
	@Root(name = "stop")
	public static class Stop {
		@Attribute(name = "tag")
		public String tag;
		
		@Attribute(name = "title", required = false)
		public String title;
		
		@Attribute(name = "lat", required = false)
		public String latitude;
		
		@Attribute(name = "lon", required = false)
		public String longitude;
		
		@Attribute(name = "stopId", required = false)
		public String stopId;
	}
	
	@Root(name = "direction")
	public static class Direction{
		@Attribute(name = "tag")
		public String tag;
		
		@Attribute(name = "title")
		public String title;
		
		@Attribute(name = "name")
		public String name;
		
		@Attribute(name = "useForUI")
		public String useForUI;
		
		@ElementList(inline = true)
		public List<Stop> dirStopList;
	}
	
}
