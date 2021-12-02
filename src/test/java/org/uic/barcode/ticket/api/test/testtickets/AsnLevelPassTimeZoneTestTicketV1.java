package org.uic.barcode.ticket.api.test.testtickets;

import org.uic.barcode.asn1.datatypesimpl.SequenceOfStringUTF8;
import org.uic.barcode.ticket.api.asn.omv1.CardReferenceType;
import org.uic.barcode.ticket.api.asn.omv1.ControlData;
import org.uic.barcode.ticket.api.asn.omv1.CustomerStatusType;
import org.uic.barcode.ticket.api.asn.omv1.DocumentData;
import org.uic.barcode.ticket.api.asn.omv1.ExtensionData;
import org.uic.barcode.ticket.api.asn.omv1.IssuingData;
import org.uic.barcode.ticket.api.asn.omv1.LinkMode;
import org.uic.barcode.ticket.api.asn.omv1.OpenTicketData;
import org.uic.barcode.ticket.api.asn.omv1.SequenceOfCardReferenceType;
import org.uic.barcode.ticket.api.asn.omv1.SequenceOfCustomerStatusType;
import org.uic.barcode.ticket.api.asn.omv1.SequenceOfDocumentData;
import org.uic.barcode.ticket.api.asn.omv1.SequenceOfExtensionData;
import org.uic.barcode.ticket.api.asn.omv1.SequenceOfTicketLinkType;
import org.uic.barcode.ticket.api.asn.omv1.SequenceOfTravelerType;
import org.uic.barcode.ticket.api.asn.omv1.StationPassageData;
import org.uic.barcode.ticket.api.asn.omv1.TicketDetailData;
import org.uic.barcode.ticket.api.asn.omv1.TicketLinkType;
import org.uic.barcode.ticket.api.asn.omv1.TicketType;
import org.uic.barcode.ticket.api.asn.omv1.TokenType;
import org.uic.barcode.ticket.api.asn.omv1.TravelClassType;
import org.uic.barcode.ticket.api.asn.omv1.TravelerData;
import org.uic.barcode.ticket.api.asn.omv1.TravelerType;
import org.uic.barcode.ticket.api.asn.omv1.UicRailTicketData;


	public class AsnLevelPassTimeZoneTestTicketV1 {
		
		public static UicRailTicketData getUicTestTicket() {
			UicRailTicketData ticket = new UicRailTicketData();
	    	populateTicket(ticket);
			return ticket;
		}
		
		/*
	     value UicRailTicketData ::=  {     
	    	       issuingDetail {
	    	            issuingYear       2018
	    	            issuingDay        1
	    	       	    specimen          TRUE,
	    	            securePaperTicket FALSE,
	    	            activated         TRUE,
	    	            issuerPNR         "issuerTestPNR",
	    	       	    issuedOnLine      12
	    	       }
	    	       ,travelerDetail{
	    	            traveler {
	    	               {
	    	                	firstName      "John"
	    	          	     	,secondName    "Dow"
	    	                	,idCard        "12345"
	    	                	,ticketHolder  TRUE
	    	          			,status        {{customerStatusDescr "senior" }}
	    	               }
	    	            }
	    	           ,groupName "myGroup"
	    	       }
	    	       ,transportDocument {
	    	          	{
	    		         	 token {tokenProviderIA5 "VDV", token '82DA'H }
	    		        	,ticket openTicket : {
	    		        			returnIncluded    FALSE
	    	        			   ,infoText          "openTicketInfo"
	    	        			   ,classCode         "second"
	    		        	 }
	    		       	}
	    		      	,{
	    		        	 ticket stationPassage : {
	    	       					 productName       "passage"
	    	       					,stationNameUTF8   { "Amsterdam" }       
	    	       					,validFromDay      0
	    	       					,numberOfDaysValid 123
	    	 	        	}
	    		       	}		
	    	       } 
	    	       ,controlDetail {
	    	          identificationByCardReference {
	    	            { trailingCardIdNum 100 }
	    	          }
	    	   	      ,identificationByIdCard	    FALSE
	    	    	  ,identificationByPassportId   FALSE
	    	          ,passportValidationRequired  	FALSE
	    	      	  ,onlineValidationRequired    	FALSE
	    	          ,ageCheckRequired            	FALSE   	
	    	    	  ,reductionCardCheckRequired  	FALSE          
	    	          ,infoText                     "cd"
	    	          ,includedTickets {
	    	          	{  referenceIA5 "UED12435867"
	    	              ,issuerName "OEBB" 
	    	              ,issuerPNR "PNR" 
	    	          	  ,productOwnerIA5 "test" 
			              ,ticketType pass
			              ,linkMode onlyValidInCombination
			              
	    	          	}
	    	          }
	    	       } 
	    	       ,extension {
	    	            { extensionId "1", extensionData '82DA'H }
	    	           ,{ extensionId "2", extensionData '83DA'H }
	    	        }			
	    	     }
		*/
		
		/*

Encoded successfully in 155 bytes:
78022020 050DD3CF 9F5CBCAA 65E7D284 EA40218A 02D00041 129BDA1B 80D11BDD
C158B266 D1AC0441 B9E5DDA7 7F2076D7 947726F7 57002501 D689580A 0B684000
00000200 737B832B 72A34B1B 5B2BA24B 73337890 110081DC 185CDCD8 59D94042
505B5CDD 195C9918 5B401017 B4C02008 05900026 364015B8 5D58B118 B268CDAB
86CDC113 D1509080 E84EA409 D32F3E85 02016205 05B402C8 0A0F68
		 * 
		 * 
		 * 
		 */
		
		public static String getEncodingV1Hex() {
			return  "78022020050DD3CF9F5CBCAA65E7D284EA40218A02D000822537B43701A237BB" + 
					"82B164CDA358088373CBBB4EFE40EDAF28EE4DEEAE004A03AD12B01416D08000" + 
					"000004039BDC195B951A58DAD95D125B999BC48088040EE0C2E6E6C2CECA0212" + 
					"82DAE6E8CAE4C8C2DA0080BDA60100402C800131B200ADC2EAC588C593466D5C" + 
					"366E089E8A8484074275204E9979F428100B10282DA01640507B40";
		}
		
		public static String getEncodingV2Hex() {
			return  "78022020050DD3CF9F5CBCAA65E7D284EA40218A02D00041129BDA1B80D11BDD" + 
					"C158B266D1AC0441B9E5DDA77F2076D7947726F757002501D689580A0B684000" + 
					"00000200737B832B72A34B1B5B2BA24B73337890110081DC185CDCD859D94042" + 
					"505B5CDD195C99185B401017B4C0200805900026364015B85D58B118B268CDAB" + 
					"86CDC113D1509080E84EA409D32F3E850201620505B402C80A0F68";
		}
		
		
	    private static void populateTicket(UicRailTicketData ticket) {
	    	
	    	ticket.setControlDetail(new ControlData());
	    	populate(ticket.getControlDetail());
	    	
	     	
	    	ticket.setIssuingDetail(new IssuingData());
	    	populateIssuingData(ticket.getIssuingDetail());
	    	
	    	TravelerData td = new TravelerData();
	    	populateTravelerData(td);
	    	ticket.setTravelerDetail(td);    	
	    	
	    	SequenceOfDocumentData ds = new SequenceOfDocumentData();

	    	
	    	//OpenTicket
	    	DocumentData do1 = new DocumentData();
	    	addOpenTicketData(do1);
	    	ds.add(do1);   	    	
	    	
	    	//StationPassage
	    	DocumentData do2 = new DocumentData();    	
	    	addStationPassage(do2);
	    	ds.add(do2);   	    	
	    	
	    	ticket.setTransportDocument(ds);
	    	
	       	SequenceOfExtensionData ed = new SequenceOfExtensionData();
	    	populateExtensionSequence(ed);
	    	ticket.setExtension(ed);
	    	
		}
	    
	    /*
		 ticket stationPassage : {
	       	productName "passage"
	       	,stationNameUTF8 { "Amsterdam" }       
	       	,validFromDay 0
	       	,numberOfDaysValid 123
	 	 }
	     */
	    private static void addStationPassage(DocumentData dd) {
	    	TicketDetailData tdd = new TicketDetailData();
	    	StationPassageData sp = new StationPassageData();  
	    	sp.setProductName("passage");
	    	sp.setValidFromDay(0L);
	    	sp.setNumberOfDaysValid(123L);
	    	SequenceOfStringUTF8 ss = new SequenceOfStringUTF8();
	    	ss.add("Amsterdam");
	    	sp.setStationNameUTF8(ss);   	
	     	tdd.setStationPassage(sp);    	
	    	dd.setTicket(tdd);
		}
	    
	    /*
	     	{
		        token {tokenProviderIA5 "VDV", token '82DA'H }
		        ,ticket openTicket : {
		        	returnIncluded FALSE
	        		infoText "openTicketInfo"
		        }
		    }
	     */
	    
	    
	    
		private static void addOpenTicketData(DocumentData dd) {
	    	TokenType to = new TokenType();
	    	to.setTokenProviderIA5("VDV");
	    	byte[] ba = { (byte) 0x82, (byte) 0xDA };
	    	to.setToken(ba);
	    	dd.setToken(to);   		
			
	    	TicketDetailData tdd = new TicketDetailData();
	    	OpenTicketData otd = new OpenTicketData();  
	    	otd.setInfoText("openTicketInfo");
	    	otd.setClassCode(TravelClassType.first);
	    	otd.setReturnIncluded(false);
	    	tdd.setOpenTicket(otd);
	    	dd.setTicket(tdd);
		}


		/*
	       ,travelerDetail{
	            traveler {
	               {
	                	firstName "John"
	          	     	,secondName "Dow"
	                	,idCard "12345"
	                	,ticketHolder TRUE
	          			,status {{customerStatusDescr "senior"  }}
	               }
	            }
	           ,groupName "myGroup"
	       }
	     */
	    
	    private static void populateTravelerData(TravelerData td) {
	    	td.setGroupName("myGroup");
	    	SequenceOfTravelerType trs = new SequenceOfTravelerType();
	    	TravelerType tr = new TravelerType();
	    	tr.setIdCard("12345");
	    	tr.setFirstName("John");
	    	tr.setSecondName("Dow");
	    	tr.setTicketHolder(true);
	    	SequenceOfCustomerStatusType ts = new SequenceOfCustomerStatusType();  	
	    	CustomerStatusType cst = new CustomerStatusType();
	    	cst.setCustomerStatusDescr("senior");
	    	ts.add(cst);
	    	tr.setStatus(ts);
	    	trs.add(tr);
	    	td.setTraveler(trs);
		}

		/*
	       ,issuingDetail {
	            issuingYear       2018
	            issuingDay        1
	       	    specimen  TRUE,
	            securePaperTicket FALSE,
	            activated TRUE,
	            issuerPNR  "issuerTestPNR",
	       	    issuedOnLine  12
	       }
	     */
	    private static void populateIssuingData(IssuingData issuingDetail) {
	    	issuingDetail.setIssuingYear(2018L);
	    	issuingDetail.setIssuingDay(1L);
	    	issuingDetail.setIssuerPNR("issuerTestPNR");
	    	issuingDetail.setSpecimen(true);
	    	issuingDetail.setSecurePaperTicket(false);
	    	issuingDetail.setActivated(true);
	    	issuingDetail.setIssuedOnLine(12L);	
		}

		/*
	       ,extension {
	            { extensionId "1", extensionData '82DA'H }
	           ,{ extensionId "2", extensionData '83DA'H }
	        }
	     */
	    private static void populateExtensionSequence(SequenceOfExtensionData ed) {
	       	ExtensionData ed1 = new ExtensionData();
	    	ed1.setExtensionId("1");
	    	byte[] ba1 = { (byte) 0x82, (byte) 0xDA };
	    	ed1.setExtensionData(ba1); 	
	    	ExtensionData ed2 = new ExtensionData();    	
	    	ed2.setExtensionId("2");
	    	byte[] ba2 = { (byte) 0x83, (byte) 0xDA };
	    	ed2.setExtensionData(ba2);     	
	    	ed.add(ed1);
	    	ed.add(ed2);
		}

	    /*
	       ,controlDetail {
	          identificationByCardReference {
	            { trailingCardIdNum 100 }
	          }
	   	      ,identificationByIdCard	    FALSE
	    	  ,identificationByPassportId   FALSE
	          ,passportValidationRequired  	FALSE
	      	  ,onlineValidationRequired    	FALSE
	          ,ageCheckRequired            	FALSE   	
	    	  ,reductionCardCheckRequired  	FALSE          
	          ,infoText "cd"
	          ,includedTickets {
	          	{ productOwnerIA5 "test" 
	          	 ,
	          	
	          	
	          	}
	          }
	       } 
	     */
		private static void populate(ControlData controlDetail) {
			controlDetail.infoText = "cd";
			controlDetail.setAgeCheckRequired(false);
			controlDetail.setIdentificationByIdCard(false);
			controlDetail.setIdentificationByPassportId(false);
			controlDetail.setOnlineValidationRequired(false);
			controlDetail.setPassportValidationRequired(false);
			controlDetail.setReductionCardCheckRequired(false);
			controlDetail.setIdentificationByCardReference(new SequenceOfCardReferenceType());
			controlDetail.getIdentificationByCardReference().add(populateCardRefrence());
			SequenceOfTicketLinkType sit = new SequenceOfTicketLinkType();
			populateLinkedTickets(sit);
			controlDetail.setIncludedTickets(sit);
		}

		
		/*
		 * 
		 */
		private static void populateLinkedTickets(SequenceOfTicketLinkType sequenceOfTicketLinkType) {
			TicketLinkType tlt = new TicketLinkType();
			tlt.productOwnerIA5="test";
			tlt.setTicketType(TicketType.pass);
			tlt.setIssuerPNR("PNR");
			tlt.setReferenceIA5("UED12435867");
			tlt.setLinkMode(LinkMode.onlyValidInCombination);
			tlt.setIssuerName("OEBB");
			sequenceOfTicketLinkType.add(tlt);
		}

		/*
		 {
		   trailingCardIdNum 100
		 }
		 */
		private static CardReferenceType populateCardRefrence() {
			CardReferenceType cr = new CardReferenceType();
			cr.setTrailingCardIdNum(100L);
			return cr;
		}



	}
