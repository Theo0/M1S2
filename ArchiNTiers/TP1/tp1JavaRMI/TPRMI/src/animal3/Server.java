package animal3;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
	
	public Server(){}
	
	public static void main(String args []){
		//CODEBASE A MODIFIER
		//System.setProperty("java.rmi.server.codebase", "file:///auto_home/tchambon/Documents/M1S2/ArchiNTiers/TP1/tp1JavaRMI/TPRMI/src/animal3Cli");
		try{
			CabinetImpl obj = new CabinetImpl();
			//Remplissage du cabinet
			AnimalImpl a1 = new AnimalImpl("médor", "Jean-Pierre");
			AnimalImpl a2 = new AnimalImpl("Rex", "Bernard");
			AnimalImpl a3 = new AnimalImpl("Miaou", "Giselle");
			AnimalImpl a4 = new AnimalImpl("Animal4", "Maitre4");
			AnimalImpl a5 = new AnimalImpl("Animal5", "Maitre5");
			AnimalImpl a6 = new AnimalImpl("Animal6", "Maitre6");
			AnimalImpl a7 = new AnimalImpl("Animal7", "Maitre7");
			AnimalImpl a8 = new AnimalImpl("Animal8", "Maitre8");
			AnimalImpl a9 = new AnimalImpl("Animal9", "Maitre9");
			
			obj.addAnimal(a1);
			obj.addAnimal(a2);
			obj.addAnimal(a3);
			obj.addAnimal(a4);
			obj.addAnimal(a5);
			obj.addAnimal(a6);
			obj.addAnimal(a7);
			obj.addAnimal(a8);
			obj.addAnimal(a9);
			
						
			
			Registry registry = LocateRegistry.getRegistry();
			if(registry == null){System.err.println("Registry Not Found");}
			else{
				registry.bind("cabinet", obj);

				System.out.println("Server ready");
			}
		}catch (Exception e){
			System.err.println("Server exception : " + e.toString());
			e.printStackTrace();
		}
	}
}
