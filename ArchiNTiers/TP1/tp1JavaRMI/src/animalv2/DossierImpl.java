package animalv2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierImpl extends UnicastRemoteObject implements IDossier{
	String dossier;
	
	public DossierImpl()  throws RemoteException{
		this.dossier = "Ceci est mon dossier";
	}
	
	public String getDossier() throws RemoteException{
		return this.dossier;
	}
	
	public void setDossier(String s) throws RemoteException{
		this.dossier = s;
	}
}
