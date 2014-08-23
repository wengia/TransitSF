package models;

import java.util.List;

import org.simpleframework.xml.*;

@Root(name = "RTT")
public class RTT {
	@ElementList(name = "AgencyList")
	public List<Agency> agencyList;

	@Root(name = "Agency")
	public static class Agency {
		@Attribute(name = "Name")
		public String name;
		
		@Attribute(name = "HasDirection")
		public String hasDirection;
		
		@Attribute(name = "Mode")
		public String mode;
		
		@ElementList(name = "RouteList", required = false)
		public List<RouteForFiveOneOne> stopList;
	}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		
		for(Agency agency: agencyList)
			buf.append(agency.name + "\t" + agency.hasDirection + "\t" + agency.mode + "\n");
		
		return buf.toString();
	}
}
