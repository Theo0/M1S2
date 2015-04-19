package animal2;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animal extends Remote {
	String printAnimal() throws RemoteException;
	String getNom() throws RemoteException;
	public IDossier getDossier() throws RemoteException;
}
