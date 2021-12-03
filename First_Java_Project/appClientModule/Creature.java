

class Creature implements Specie, Gender {
	
	private String firstName;
	private String lastName;
	private String sentance;
	
	public String nameOfChild;
	public String thegender;
	public boolean isparent;
	
	public float Height;
	public float Weight;
	public String SayHi = "HELLO";
	
	public int birthday;
	public int birthmonth;
	public int birthyear;
	
	
	//Gender gender;
	
	private String date;
	public String usergender;
	
	Creature() {}
	
	Creature(String userFname, String userLname) {
		this.firstName = userFname;
		this.lastName = userLname;
		//System.out.println("Your firstname is :\n ->"+this.getFirstName());
		//System.out.println("Your lastname is :\n ->"+this.getLastName());
	}

	Creature(String userFname) {
		this.firstName = userFname;
		//afficher la valeur de FirstName quand on instancie la classe
		System.out.println("Firstname is :\n ->"+this.getFirstName());
	}
	
//	Creature(String userFname, String specie, ) {
//		this.firstName = userFname;
//		System.out.println("Firstname is :\n ->"+this.getFirstName());
//	}
//	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String setFirstName(String newFirstName) {
		System.out.println("your new firstname is :\n ->"+newFirstName);
		return this.firstName = newFirstName;	
	}
	public String setLastName(String newLastName) {
			
		return this.lastName = newLastName;	
	}
	
	@Override
	public String sayhi() {
		return this.SayHi;
	}
	
	@Override
	public String getGender() {
		return this.thegender;
	}
	
	@Override
	public void setGender(String strGender) {
		//System.out.println("the gender is : \n ->"+strGender);
		 this.thegender = strGender;
	}
	
	@Override
	public void saySomething(String stringArg) {
		 this.sentance = stringArg;
	}
	
	public String getSentance() {
		return this.sentance;
	}
	
	public String hasChild(String anotherPersonName) {
		System.out.println(this.firstName+"has a child :\n ->"+anotherPersonName);
		return this.nameOfChild = anotherPersonName;
	}
	
	float getHeight() {
		return this.Height;
	}
	
	float setHeight(float newHeight) {
		return this.Height = newHeight;
	}
	
	String getDate() {
		return this.date;
	}
	
	String setDate(int bday, int bmonth, int year) {
		this.date = Integer.toString(bday)+"/"+Integer.toString(bmonth)+"/"+Integer.toString(year);
	    return date;
	}

	



	
	
}
