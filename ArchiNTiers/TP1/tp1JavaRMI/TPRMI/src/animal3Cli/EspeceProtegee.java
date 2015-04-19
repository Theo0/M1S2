package animal3Cli;

import java.rmi.RemoteException;

import animal3.EspeceImpl;

public class EspeceProtegee extends EspeceImpl{

	public EspeceProtegee(String espece, int duree) throws RemoteException {
		super(espece, duree);
	}
	
	public String getSynthese() throws RemoteException{
		return super.getSynthese()+". Espece Protégée !";
	}
}
