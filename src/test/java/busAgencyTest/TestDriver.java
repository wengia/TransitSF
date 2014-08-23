package busAgencyTest;

import models.NextBusBody;
import models.RTT;
import models.RouteForNextBus;
import retrofit.RestAdapter;
import adapter.FiveOneOneAPIService;
import adapter.NextbusAPIService;

import com.mobprofs.retrofit.converters.SimpleXmlConverter;

public class TestDriver {
	public static void main(String[] args) {
		RestAdapter restAdapter = new RestAdapter.Builder()
	        .setEndpoint(FiveOneOneAPIService.ROOT)
	        .setConverter(new SimpleXmlConverter())
	        .build();
		
		FiveOneOneAPIService fiveoneone = restAdapter.create(FiveOneOneAPIService.class);
		RTT myRTT = fiveoneone.getNextDeparturesByStopCode(FiveOneOneAPIService.TOKEN, "13915");
		
		System.out.print(myRTT.toString());
		
		
		// NextBus
		RestAdapter nextBusAdapter = new RestAdapter.Builder()
			.setEndpoint(NextbusAPIService.ROOT)
			.setConverter(new SimpleXmlConverter())
			.build();
		
		NextbusAPIService nb = nextBusAdapter.create(NextbusAPIService.class);
		NextBusBody list = nb.getRoute("sf-muni", "N");
		
		for(RouteForNextBus route: list.routeList)
			System.out.println(route.tag + " " + route.title + " " + route.shortTitle);
	}
}
