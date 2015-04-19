package animal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Espece extends Remote {
	public String getEspece()throws RemoteException;
	public int getDureeVie()throws RemoteException;

}
