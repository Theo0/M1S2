package animalv2;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {
	private Client(){}
	
	public static void main(String[] args){
		String host = (args.length < 1) ? null : args[0];
		try{
			Registry registry = LocateRegistry.getRegistry(host);
			ICabinet stub = (ICabinet)registry.lookup("cabinet");
			String reponse = stub.recherche("animal1");
			System.out.println(reponse);
		}catch(Exception e){
			System.err.println("Client exception : " + e.toString());
			e.printStackTrace();
		}
	}
}
