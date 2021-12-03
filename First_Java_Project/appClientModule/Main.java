import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		//CreatePersonSimple();
		
//		CreatePersonWithParams();
		
		CreateDogWithParams();
		
//		//EXEMPLE USER4
//		System.out.println("USER3");
//		System.out.println("Enter Dog name");
//		String str = myObj.nextLine();
//		Dog Dog2 = new Dog(str);
		
		
		
		
//		//EXEMPLE USER3 
//		System.out.println("USER3");
//		Dog littleDog = new Dog("milou");
//		//System.out.println("Dogs name ?");
//		String tempStr = myObj.nextLine();
//		littleDog.setFirstName(tempStr);
				
//		//EXEMPLE USER1
//		System.out.println("USER1");
//		Person User1 = new Person();		
//		System.out.println("Enter username");
//		String tempor;
//		tempor = myObj.nextLine();
//		User1.setFirstName(tempor);
//		System.out.println("Enter your day of birth");
//		User1.birthday= myObj.nextInt();
//		System.out.println("Enter your month of birth");
//		User1.birthmonth= myObj.nextInt();
//		System.out.println("Enter your year of birth");
//		User1.birthyear= myObj.nextInt();	
//		User1.getdate(User1.birthday, User1.birthmonth, User1.birthyear);
//		System.out.println("Your name is: " + User1.getFirstName()+"" + "And your date of birth is: "+User1.res);
//				
		
//		//EXEMPLE USER2
//		System.out.println("USER2");
//		Person User2 = new Person("Jack","Sparrow");
//		//System.out.println("Your name is :\n ->"+User2.getFirstName());
//		Person UserChild = new Person();
//		UserChild.setFirstName("JackJunior");
//		//System.out.println(User2.getFirstName()+" has a child and his name is :\n ->"+User2.hasChild(UserChild.getFirstName()));		
//		User2.setemail("Jack.Sparrow@pirates.com");
//		System.out.println(User2.getFirstName()+"'s email is :\n ->"+User2.getemail());
//		
		//System.out.println("gf,b;");
		// TODO Auto-generated method stub
		//instanceof
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
		
	}
	
	public static Person CreatePersonSimple() {
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("USER1");
			Person User = new Person();		
			System.out.println("Enter username");
			String tempor;
			tempor = myObj.nextLine();
			User.setFirstName(tempor);
			System.out.println("Enter your day of birth");
			User.birthday= myObj.nextInt();
			System.out.println("Enter your month of birth");
			User.birthmonth= myObj.nextInt();
			System.out.println("Enter your year of birth");
			User.birthyear= myObj.nextInt();	
			User.setDate(User.birthday, User.birthmonth, User.birthyear);
			System.out.println("Your name is: " + User.getFirstName()+"" + "And your date of birth is: "+User.getDate());
			System.out.println("enter your email please ");
			String tempor2;
			tempor2 = myObj.nextLine();
			User.setemail(tempor2);
			System.out.println("END");

			return User;
		}
	}
	//une méthode pour crééer un object/instance de personne avec 2 paramètres 
	public static Person CreatePersonWithParams() {
		//on encapsule le Scanner pour limiter les ressources allouées à ce scope
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter user firstname");
			String tempor1;
			tempor1 = myObj.nextLine();
			System.out.println("Enter user lastname");
			String tempor2;
			tempor2 = myObj.nextLine();
			//on appelle le constructeur de la classe Creature qui prend en paramètres 2 éléments
			Person User = new Person(tempor1, tempor2);
			//Set récupérer les différents champs de la date de naissance
			System.out.println("Enter your day of birth");
			User.birthday= myObj.nextInt();
			System.out.println("Enter your month of birth");
			User.birthmonth= myObj.nextInt();
			System.out.println("Enter your year of birth");
			User.birthyear= myObj.nextInt();	
			//
			User.setDate(User.birthday, User.birthmonth, User.birthyear);
			System.out.println("Enter your email");
			String tempor3;
			tempor3 = myObj.nextLine();
			//prochaine ligne : setter de email
			User.setemail(tempor3);
			System.out.println("Enter your gender");
			String tempor4;
			tempor4 = myObj.nextLine();
			//prochaine ligne : setter de Gender
			User.setGender(tempor4);
			//affichage avec les getters :
			System.out.println("Your firstname is: "+User.getFirstName()
								+ "\n Your lastname is: "+User.getLastName()
								+ "\n Your date of birth is: "+User.getDate()
								+ "\n Your email is: "+User.getemail()
								+ "\n Your gender is: "+User.getGender()
								);
			System.out.println("END");
			return User;
		}
	}
	//une méthode pour crééer un object/instance de Dog avec 1 paramètre
	public static Dog CreateDogWithParams() {
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter your dogs firstname");
			String tempor1;	
			tempor1 = myObj.nextLine();
			Dog User = new Dog(tempor1);
			System.out.println("Enter your dogs specie");
			String tempor2;	
			tempor2 = myObj.nextLine();
			//Prochaine ligne : Set Specie de Dog
			User.setSpecie(tempor2);
			System.out.println("Enter your dogs gender");
			String tempor3;	
			tempor3 = myObj.nextLine();
			//Prochaine ligne : Set Gender de Dog
			User.setGender(tempor3);
			//Affichage des différents champs de l'instance User avec les getters 
			System.out.println("Your dogs firstname is: "+User.getFirstName()
								+ "\nYour dogs gender is: "+User.getGender()
								+ "\nYour dogs specie is: "+User.getSpecie()
								);
			System.out.println("END");
			return User;
		}
	}

	
}