package cookiePackaging;

public class customerInfo implements cookiePacking {

	   private String cookieType;

	   public customerInfo(String cookieType){
	      this.cookieType = cookieType;
	      decoratingCookie(cookieType);
	      packagingCookie(cookieType);
	   }

	   public void shipped() {
	      System.out.println("The  " + cookieType + " cookies are being shipped.");
	   }

	   private void decoratingCookie(String cookieType){
	      System.out.println("The  " + cookieType + " cookies are cooling.");
	   }
	   
	   private void packagingCookie(String cookieType){
		      System.out.println("The  " + cookieType + " cookies are being packaged.");
		   }
	}