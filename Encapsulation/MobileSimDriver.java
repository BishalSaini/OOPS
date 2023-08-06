

public class MobileSimDriver {  
	public static void main(String[] args) {
		
	Mobile m=new Mobile("Realme","6GB","Blue",17000); 
		m.printMobileDetails();  
		
		m.setS1(new Sim("VI","5G"));   
		m.setS2(new Sim("JIO","4G")); 
		m.printMobileDetails();	
	}
}
