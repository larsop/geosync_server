package no.geonorge.skjema.standard.geosynkronisering._1_0.produkt;

import java.math.BigInteger;

import opengis.net.wfs_2_0.wfs.ResolveValueType;
import opengis.net.wfs_2_0.wfs.ResultTypeType;

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

	
		GetLastIndexResponse newInstance = new GetLastIndexResponse();
		newInstance.setReturn(new BigInteger("1"));
		if (logger.isDebugEnabled()) {
			logger.debug("leave");
		}

		return newInstance;

	}
	
	@PayloadRoot(namespace = "http://skjema.geonorge.no/standard/geosynkronisering/1.0/produkt", localPart = "CancelChangelog")
	public CancelChangelogResponse getCancelChangelog(CancelChangelog query) {
		if (logger.isDebugEnabled()) {
			logger.debug("enter");
		}

	
		CancelChangelogResponse newInstance = new CancelChangelogResponse();

		if (logger.isDebugEnabled()) {
			logger.debug("leave");
		}

		return newInstance;

	}


	@PayloadRoot(namespace = "http://skjema.geonorge.no/standard/geosynkronisering/1.0/produkt", localPart = "CancelChangelog")
	public GetChangelogResponse getGetChangelog(GetChangelog query) {
		if (logger.isDebugEnabled()) {
			logger.debug("enter");
		}
	
		GetChangelogResponse newInstance = new GetChangelogResponse();
		ChangelogType changelogType = new ChangelogType();
		changelogType.setDownloadUri("http://kart8.skogoglandskap.no/uttak/mprod/4c9869.zip.");
		changelogType.setEndIndex(new BigInteger("1"));
		newInstance.setReturn(changelogType );

		if (logger.isDebugEnabled()) {
			logger.debug("leave");
		}

		return newInstance;

	}
	
	@PayloadRoot(namespace = "http://skjema.geonorge.no/standard/geosynkronisering/1.0/produkt", localPart = "GetChangelogStatus")
	public GetChangelogStatusResponse getGetChangelogStatus(GetChangelogStatus query) {
		if (logger.isDebugEnabled()) {
			logger.debug("enter");
		}
	
		GetChangelogStatusResponse newInstance = new GetChangelogStatusResponse();
		newInstance.setReturn(ChangelogStatusType.CANCELLED);

		if (logger.isDebugEnabled()) {
			logger.debug("leave");
		}

		return newInstance;

	}

	
	@PayloadRoot(namespace = "http://skjema.geonorge.no/standard/geosynkronisering/1.0/produkt", localPart = "ListStoredChangelogs")
	public ListStoredChangelogsResponse getListStoredChangelogs(ListStoredChangelogs query) {
		if (logger.isDebugEnabled()) {
			logger.debug("enter");
		}
	
		ListStoredChangelogsResponse newInstance = new ListStoredChangelogsResponse();
		StoredChangelogListe listStoredChangelogsResponse = new StoredChangelogListe();
		StoredChangelog e = new StoredChangelog();
		e.setStartIndex(new BigInteger("0"));
		e.setDownloadUri("http://kart8.skogoglandskap.no/uttak/mprod/4c9869.zip.");
		ChangelogIdentification value = new ChangelogIdentification();
		value.setChangelogId(new BigInteger("0"));
		e.setId(value);
		e.setName("name");
		ChangelogOrder value2 = new ChangelogOrder();
		value2.setCount(new BigInteger("1"));
		value2.setDatasetId("id");
		value2.setHandle("handle");
		value2.setOutputFormat("output");
		value2.setResolve(ResolveValueType.NONE);
		value2.setResolveDepth("1");
		value2.setResolveTimeout(new BigInteger("0"));
		value2.setResultType(ResultTypeType.HITS);
		value2.setService("service");
		value2.setStartIndex(new BigInteger("0"));
		value2.setVersion("v");
		
		
		e.setOrder(value2);
		
		
		listStoredChangelogsResponse.getStoredchangelogs().add(e );
		newInstance.setReturn(listStoredChangelogsResponse );

		if (logger.isDebugEnabled()) {
			logger.debug("leave");
		}

		return newInstance;

	}


	@PayloadRoot(namespace = "http://skjema.geonorge.no/standard/geosynkronisering/1.0/produkt", localPart = "OrderChangelog")
	public OrderChangelogResponse getOrderChangelog(OrderChangelog query) {
		if (logger.isDebugEnabled()) {
			logger.debug("enter");
		}
	
		OrderChangelogResponse newInstance = new OrderChangelogResponse();
		ChangelogIdentification changelogIdentification = new ChangelogIdentification();
		changelogIdentification.setChangelogId(new BigInteger("0"));
		newInstance.setReturn(changelogIdentification );

		if (logger.isDebugEnabled()) {
			logger.debug("leave");
		}

		return newInstance;

	}

	

}
