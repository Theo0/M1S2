package animal;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EspeceImpl extends UnicastRemoteObject implements Espece{
	
	int dureeVie;
	String espece;
	
	public EspeceImpl(String espece,int duree) throws RemoteException{
		this.espece = espece;
		this.dureeVie = duree;
	}
	
	public String getEspece() throws RemoteException {
		return this.espece;
	}

	
	public int getDureeVie() throws RemoteException {
		return this.dureeVie;
	}
	
}
