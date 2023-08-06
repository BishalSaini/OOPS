

public class StudentDriver { 
	public static void main(String[] args) {
		Student st =new Student(); 
		st.setId(105); 
		st.setName("Vishu"); 
		st.setEmail("vishu32@gmail.com"); 
		st.setCno(865503096);
		
		System.out.println(st.getId()); 
		System.out.println(st.getName());  
		System.out.println(st.getEmail());  
		System.out.println(st.getCno()); 
	}

}
