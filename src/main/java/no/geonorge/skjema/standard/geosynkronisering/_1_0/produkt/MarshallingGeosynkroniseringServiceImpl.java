package no.geonorge.skjema.standard.geosynkronisering._1_0.produkt;

import java.math.BigInteger;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

@Component
@Endpoint
public class MarshallingGeosynkroniseringServiceImpl {
	static Logger logger = Logger.getLogger(MarshallingGeosynkroniseringServiceImpl.class);

	@PayloadRoot(namespace = "http://skjema.geonorge.no/standard/geosynkronisering/1.0/produkt", localPart = "GetLastIndex")
	public GetLastIndexResponse getLastIndex(GetLastIndex query) {
		if (logger.isDebugEnabled()) {
			logger.debug("enter");
		}

		System.out.println("GOT YOU");

		GetLastIndexResponse newInstance = new GetLastIndexResponse();
		newInstance.setReturn(new BigInteger("1"));
		if (logger.isDebugEnabled()) {
			logger.debug("leave");
		}

		return newInstance;

	}

}
