package animal3;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Espece extends Remote {
	public String getEspece()throws RemoteException;
	public int getDureeVie()throws RemoteException;
	public String getSynthese()throws RemoteException;
}
