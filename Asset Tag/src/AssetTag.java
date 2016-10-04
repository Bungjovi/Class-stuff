import java.util.ArrayList;
import java.util.List;

/*
 * Asset Tags are made up of the following criteria:
 * 1.) Database ID: First 7 characters and is a 32 bit integer
 * 2.) Device Type: 3 characters long following the database id
 * 		* Valid Values Are:
 * 			- CMP - Computer
 * 			- LPT - Laptop
 * 			- PRN - Printer
 * 			- PRJ - Projector
 * 			- TBT - Tablet
 * 			- PHN - Phone
 * 			- OTH - Other
 * 3.) Building: 2 Characters following the device type
 * 		* Valid Values Are:
 * 			- MN - Main Campus
 * 			- SA - Sauder Extension Building
 * 			- DC - Downtown Campus
 * 			- WD - Welding Building
 * 			- TC - Technology Building
 * 			- JE - Jones Education Center
 * 4.) Room Number: 5 Characters following the building code
 * 		* This can contain numbers, characters and spaces
 * 5.) PO Number: The PO number is 6 characters following the room number.
 * 		* This is a 32 bit integer corresponding the Purchase Order in the database
 * 6.) Tag Date: 8 digits following PO number. 
 * 		* Format {yyyyMMdd} yyyy = 4 digit year, MM = 2 digit month, dd = 2 digit day
 * 7.) Checksum: 3 hexidecimal characters matching the start of a SHA1 hash function following
 * 	   the tag date.
 * 
 * --------------------
 * 
 * Using the criteria above complete the AssetTag class adding in each fields and it's
 * corresponding getters/setters
 * 
 * Create a constructor that takes an asset tag string. In this constructor using a 
 * regular expression of your design taking into account the criteria and validate the
 * asset tag. Also in the constructor populate the corresponding fields.
 * 
 * For every asset tag, validate and print out through a function the information 
 * in the following format:
 *
 * Example for 0000001CMPMNM102 00037220160113A3F:
 * 
 * ID: 1
 * Computer - Main Campus - M102
 * PO: 372
 * Tagged: 01/13/2016
 * Checksum: A3F
 * 
 */
public class AssetTag {

	
	public static void main(String[] args) {
		// TODO validate and use the following tags:
		//0000022CMPMNM121 00021720160113A3F
		
		
		List<String> tags = new ArrayList<String>();
		
		tags.add("0000022CMPMNM121 00021720160113A3F");
		tags.add("0000158CMPMNM121 00021720160113D66");
		tags.add("0000311PHNMNM102 00046820140416EEF");
		tags.add("0000444PRJSAS102 00092020150722FFF");
		tags.add("0002589PRNJEJ004 000A2220150801982");
		tags.add("0000011CMPMNM108J00031120140509460");
		tags.add("0001635LPTMNM115 00031120150807ABE");
		tags.add("0000387CMPDCDC10300142220130807CAB");
		tags.add("0002020OTHDCDC10500091820120202DEF");
		tags.add("0008511TBTMNM104 00022920150101BAD");
		tags.add("8675309OTHMNM113 00063620140611DAD");
		

		
		for (String t : tags){
			AssetTag tag = new AssetTag(t);
			tag.print();
		}
	}
	
	/*--- CLASS INSTANCE CODE ---*/
	private String IdNum;
	public String getIdNum(){return IdNum;}
	public void setIdNum(String id){IdNum = id;}
	
	private String deviceType;
	public String getDeviceType(){return deviceType;}
	public void setDeviceType(String dt){deviceType = dt;}
	
	private String buildingLoc;
	public String getBuildingLoc(){return buildingLoc;}
	public void setBuildingLoc(String bl){buildingLoc = bl;}
	
	private String roomNo;
	public String getRoomNo(){return roomNo;}
	public void setRoomNo(String rn){roomNo = rn;}
	
	private String purchOrder;
	public String getPurchOrder(){return purchOrder;}
	public void setPurchOrder(String po){purchOrder = po;}
		
	private String tagDate;
	public String getTagDate(){return tagDate;}
	public void setTagDate(String td){tagDate = td;}
	
	private String checkSum;
	public String getCheckSum(){return checkSum;}
	public void setCheckSum(String cs){checkSum = cs;}

	
	public AssetTag(String track) {
		
		 //String[] trk = track.split("\\^");
		  //%B300012552615478 - 0 - 
		 
		//String[] x = track.substring(7);
		 IdNum = x[0].substring(7); 
		   
		  
		  //DUCK/DONALD - 1   
		 String[] x = trk[1].split("/");
		 firstName = x[1].trim(); 
		 lastName = x[0];  
		             
		  //1806Z3011225*000378000XXX000142? - 2
		  expYear = trk[2].substring(0,2); 
		  expMonth = trk[2].substring(2,4);
		  
		 
	}
	
	
	}
	
}
