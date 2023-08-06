
public class Student { 
	private int id; 
	private String name; 
	private String email; 
	private long cno; 
	
	//setter---id  
	public void setId(int id) {
	if(id>0) {  
		this.id=id;  
		}else { 
			System.out.println("set valid id");
		}  
	}
	//getter--id 
	public int getId() { 
		return id; 
	} 
	//setter for name 
	public void setName(String name) { 
		this.name=name;
	}  
	//getter 
	public String getName() { 
		return name;
	} 
	//setter for email 
		public void setEmail(String email) { 
			this.email=email;
		}  
		//getter 
		public String getEmail() { 
			return email;
		}  
		//setter for name 
		public void setCno(long cno) { 
			this.cno=cno;
		}  
		//getter 
		public long getCno() { 
			return cno;
		}  
}
