package animal2;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IDossier extends Remote{	
	public String getDossier() throws RemoteException;
	public void setDossier(String s) throws RemoteException;
}
