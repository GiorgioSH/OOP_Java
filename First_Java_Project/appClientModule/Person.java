
public class Person extends Creature {
	private String email;
	private String adress;
	
	
	Person(){};
	
	Person(String userfirstname, String userlastname){
		super(userfirstname, userlastname);
		
	}
	
//	Person(String userfirstname, String userlastname, String userGender){
//		this.setFirstName(userfirstname);
//		this.setLastName(userlastname);
//		//Gender::thegender = userGender;
//	}
//	
	public String getemail() {
		return this.email;
	}
	
	public void setemail(String newemail) {
		//System.out.println("your new email is :\n ->"+newemail);
		this.email = newemail;
	}
	
	public String getadress() {
		return this.adress;
	}
	
	//public override 
    //public String getgender();
	
}
