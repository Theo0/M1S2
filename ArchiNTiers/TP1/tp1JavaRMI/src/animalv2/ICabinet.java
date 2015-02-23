package animalv2;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICabinet extends Remote {
	public String recherche(String s) throws RemoteException;
}
