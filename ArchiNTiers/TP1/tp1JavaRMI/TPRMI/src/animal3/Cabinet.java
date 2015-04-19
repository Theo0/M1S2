package animal3;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Cabinet extends Remote {
	Animal rechercheAnimal(String nom)throws RemoteException;
	void addAnimal(Animal a)throws RemoteException;
	void deleteAnimal(String nom)throws RemoteException;
	String printListeAnimaux() throws RemoteException;
	String synthese(Espece esp)throws RemoteException;
	void addAlerte(Alerte a)throws RemoteException;
}