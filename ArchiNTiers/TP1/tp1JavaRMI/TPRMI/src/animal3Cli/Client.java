package animal3Cli;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import animal3.Alerte;
import animal3.AlerteImpl;
import animal3.AnimalImpl;
import animal3.Animal;
import animal3.Cabinet;


public class Client {
	private Client(){}
	
	public static void main(String[] args){
		String host = (args.length < 1) ? null : args[0];
		
		
		try{
			Registry registry = LocateRegistry.getRegistry(host);
			//Récupération du cabinet
			Cabinet stub = (Cabinet)registry.lookup("cabinet");
			Alerte alert = new AlerteImpl();
			stub.addAlerte(alert);
			
			//Affichage espece protégée
			EspeceProtegee espP = new EspeceProtegee("rhinocéros", 50);
			String synt = stub.synthese(espP);
			System.out.println(synt);
			
			
			//Déclenchement alertes
			Animal a = new AnimalImpl("Chat", "Henri");
			System.out.println(" *****  Ajout d'un animal");
			stub.addAnimal(a);
			System.out.println("****** Suppression d'un animal");
			stub.deleteAnimal("Chat");
			
			
			//Affichage des infos du cabinet
			System.out.println("Liste des animaux du cabinet : ");
			System.out.println(stub.printListeAnimaux());
			
			Scanner sc = new Scanner(System.in);
			//Recherche d'un animal
			System.out.print("Taper le nom de l'animal à chercher : ");
			String n = sc.nextLine();
			Animal res = stub.rechercheAnimal(n);
			System.out.println("Résultat : " + res.printAnimal());
			
			//Suppression d'un animal
			System.out.print("Taper le nom de l'animal à supprimer : ");
			String n2 = sc.nextLine();
			sc.close();
			stub.deleteAnimal(n2);
			

			//Affichage du cabinet à nouveau
			System.out.println("Liste des animaux du cabinet : ");
			System.out.println(stub.printListeAnimaux());
			
		}catch(Exception e){
			System.err.println("Client exception : " + e.toString());
			e.printStackTrace();
		}
	}

}
