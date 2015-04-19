package animal;
import java.rmi.RMISecurityManager;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
	
	public Server(){}
	
	public static void main(String args []){
		
		try{
			
			if(System.getSecurityManager()==null){
	            System.setProperty("java.security.policy","file:///Users/theo/Documents/M1S2/ArchiNTiers/TP1/tp1JavaRMI/TPRMI/server.policy");
	            System.setSecurityManager(new RMISecurityManager());
	        }
			
			AnimalImpl obj = new AnimalImpl("médor", "dupont");
			EspeceImpl esp = new EspeceImpl("chiens", 10);
			Registry registry = LocateRegistry.getRegistry();
			if(registry == null){System.err.println("Registry Not Found");}
			else{
				registry.bind("animal", obj);
				registry.bind("especeChien", esp);
				System.out.println("Server ready");
			}
		}catch (Exception e){
			System.err.println("Server exception : " + e.toString());
			e.printStackTrace();
		}
	}
}
