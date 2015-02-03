package animal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {
	private Client(){}
	
	public static void main(String[] args){
		String host = (args.length < 1) ? null : args[0];
		try{
			Registry registry = LocateRegistry.getRegistry(host);
			Animal stub = (Animal)registry.lookup("animal");
			String reponse = stub.printAnimal();
			System.out.println(reponse);
			IDossier d = stub.getDossier();
			d.setDossier("Ceci est le dossier modifié");
			IDossier d2 = stub.getDossier();
			System.out.println(d2.getDossier());
		}catch(Exception e){
			System.err.println("Client exception : " + e.toString());
			e.printStackTrace();
		}
	}

}