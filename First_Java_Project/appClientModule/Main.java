import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		//appel à la méthode CreatePersonWithParams() pour instancier un objet de type Person avec firstname et lastname
		CreatePersonWithParams();
		
		//appel à ma méthode CreateDogWithParams() pour instancier un objet de type Dog avec firstname 
		CreateDogWithParams();
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
		
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
			
			//Set récupérer les différents champs de la date de naissance
			System.out.println("Enter your day of birth");
			User.birthday= myObj.nextInt();
			System.out.println("Enter your month of birth");
			User.birthmonth= myObj.nextInt();
			System.out.println("Enter your year of birth");
			User.birthyear= myObj.nextInt();	
			User.setDate(User.birthday, User.birthmonth, User.birthyear);
			
			//affichage avec les getters :
			System.out.println(" Your firstname is: "+User.getFirstName()
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