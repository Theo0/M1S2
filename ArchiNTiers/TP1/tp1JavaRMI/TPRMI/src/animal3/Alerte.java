package animal3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Alerte extends Remote{
	
	void print(String message)throws RemoteException;
  
}