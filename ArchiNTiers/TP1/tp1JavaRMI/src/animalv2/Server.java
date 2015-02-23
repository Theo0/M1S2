package animalv2;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;

public class Server {
	
	public Server(){}
	
	public static void main(String args []){
		
		try{
			AnimalImpl an1 = new AnimalImpl("animal1", "maitre1");
			AnimalImpl an2 = new AnimalImpl("animal2", "maitre2");
			AnimalImpl an3 = new AnimalImpl("animal3", "maitre3");
			AnimalImpl an4 = new AnimalImpl("animal4", "maitre4");
			ArrayList<AnimalImpl> listeAn = new ArrayList<AnimalImpl> ();
			listeAn.add(an1);
			listeAn.add(an2);
			listeAn.add(an3);
			listeAn.add(an4);
			
			CabinetImpl obj = new CabinetImpl(listeAn);
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
