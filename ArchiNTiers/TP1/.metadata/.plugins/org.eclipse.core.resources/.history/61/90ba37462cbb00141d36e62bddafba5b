package animalv2;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
	
	public Server(){}
	
	public static void main(String args []){
		
		try{
			AnimalImpl obj = new AnimalImpl("médor", "dupont");
			Registry registry = LocateRegistry.getRegistry();
			if(registry == null){System.err.println("Registry Not Found");}
			else{
				registry.bind("animal", obj);
				System.out.println("Server ready");
			}
		}catch (Exception e){
			System.err.println("Server exception : " + e.toString());
			e.printStackTrace();
		}
	}
}
