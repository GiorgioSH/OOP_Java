
public class Dog extends Creature implements Gender{
	public String Specie;
	public String whatthedogsay;
	
	Dog(){} 
	
	Dog(String dogName, String dogSpecie){}
	
	Dog(String dogName){
		super(dogName);
		//afficher le message de la méthode sayhi() après le constructeur du parent
		System.out.println(dogName+" says : \n ->"+this.sayhi()+" Waf waf");
	}
	
	String getSpecie() {
		return this.Specie;
	}
	
	String setSpecie(String newDogSpecie) {
		return this.Specie = newDogSpecie;
	}
	
//	String bark() {
//		return this.whatthedogsay = "Waf Waf";
//	}
}
