package animal3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class CabinetImpl extends UnicastRemoteObject implements Cabinet {
	
	private ArrayList<Animal> listeAnimaux;
	private int placeAnimal = -1;
	Alerte alerte;

	public CabinetImpl() throws RemoteException {
		this.listeAnimaux = new ArrayList<Animal>();
	}


	public Animal rechercheAnimal(String nom) throws RemoteException {
		for(int i=0; i<listeAnimaux.size(); i++){
			if(this.listeAnimaux.get(i).getNom().equals(nom)){
				placeAnimal = i;
				return this.listeAnimaux.get(i);
			}
		}
		placeAnimal = -1;
		return null;
	}


	public void addAnimal(Animal a) throws RemoteException {
		if(rechercheAnimal(a.getNom()) == null){
			listeAnimaux.add(a);
			switch(listeAnimaux.size()){
			case 10 : this.alerte.print("ALERTE : Vous avez atteints le seuil de 10 patients.");
			break;
			case 50 : this.alerte.print("ALERTE : Vous avez atteints le seuil de 50 patients.");
			break;
			case 100 : this.alerte.print("ALERTE : Vous avez atteints le seuil de 100 patients.");
			break;
			default:
			}
		}
		else{
			System.out.println("ERREUR : Un animal portant ce nom existe déjà.");
		}
		
	}

	public void deleteAnimal(String nom) throws RemoteException {
		Animal a = rechercheAnimal(nom);
		if(a!= null && placeAnimal != -1){
			listeAnimaux.remove(placeAnimal);
			switch(listeAnimaux.size()){
			case 9 : 
			this.alerte.print("ALERTE : Vous êtes passés en dessous des 10 patients.");
			break;
			case 49 : this.alerte.print("ALERTE : Vous êtes passés en dessous des 50 patients.");
			break;
			case 99 : this.alerte.print("ALERTE : Vous êtes passés en dessous des 100 patients.");
			break;
			default:
			}
		}
		else{
			System.out.println("ERREUR : Aucun animal portant ce nom.");
		}
		
	}
	
	public String printListeAnimaux() throws RemoteException{
		String s ="";
		for(int i=0; i<listeAnimaux.size(); i++){
			s+=this.listeAnimaux.get(i).printAnimal();
		}
		
		return s;
	}


	@Override
	public String synthese(Espece esp) throws RemoteException {
		return esp.getSynthese();
	}


	@Override
	public void addAlerte(Alerte a) throws RemoteException {
		this.alerte = a;
		
	}

}
