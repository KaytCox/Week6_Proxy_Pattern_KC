package cookiePackaging;

public class orderReview implements cookiePacking{

	   private customerInfo orderInfo;
	   private String cookieType;

	   public orderReview(String cookieType){
	      this.cookieType = cookieType;
	   }

	   public void shipped() {
	      if(orderInfo == null){
	    	  orderInfo = new customerInfo(cookieType);
	      }
	      orderInfo.shipped();
	   }
	}