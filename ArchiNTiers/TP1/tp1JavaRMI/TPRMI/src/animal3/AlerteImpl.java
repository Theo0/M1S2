package animal3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AlerteImpl extends UnicastRemoteObject implements Alerte{

	public AlerteImpl() throws RemoteException {
		super();

	}

	@Override
	public void print(String message) throws RemoteException {
		System.out.println(message);
		
	}

}