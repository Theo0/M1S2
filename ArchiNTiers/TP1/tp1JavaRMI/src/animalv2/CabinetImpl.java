package animalv2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class CabinetImpl extends UnicastRemoteObject implements ICabinet{

	ArrayList<AnimalImpl> listeAnimaux;
	
	public CabinetImpl() throws RemoteException {
		this.listeAnimaux.add(new AnimalImpl("animal1", "maitre1"));
		this.listeAnimaux.add(new AnimalImpl("animal2", "maitre2"));
		this.listeAnimaux.add(new AnimalImpl("animal3", "maitre3"));
		this.listeAnimaux.add(new AnimalImpl("animal4", "maitre4"));
	}
	
	
}