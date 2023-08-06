

public class Sim { 
	private String name; 
	private String networkType; 
	
	public Sim(String name,String nT) { 
		this.name=name; 
		this.networkType=nT;
		
	}   
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNetworkType() {
		return networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public void printSim() { 
		System.out.println("====SIM====="); 
		System.out.println(name); 
		System.out.println(networkType); 
		
		
	}
}
