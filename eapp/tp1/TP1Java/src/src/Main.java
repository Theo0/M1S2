package src;


import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;

public class Main {
	public static void main(String[] args){
		String ns = "http://www.films.fr#";
		String nsfilm = "http://www.films.fr/film#";
		String nspersonne = "http://www.films.fr/personne#";
		String nsnaissance = "http://www.films.fr/naissance#";
		
		Model m = ModelFactory.createDefaultModel();
		
		
		Resource ressourceFrancis = m.createResource(ns + "francis");
		Resource ressourceStanley = m.createResource(ns + "stanley");
		Resource ressourceVivian = m.createResource(ns + "vivian");
		Resource ressourceMarlon = m.createResource(ns + "marlon");
		Resource ressourceNaissance = m.createResource(ns +"RessourceNaissance");
		Resource ressourceDetroit = m.createResource(ns +"ressourceDetroit");
		Resource film = m.createResource(ns + "film", RDFS.Class);
		Resource personne = m.createResource(ns+"personne", RDFS.Class);
		Resource producteur = m.createResource(ns+"producteur", RDFS.Class);
		Resource realisateur = m.createResource(ns+"realisateur", RDFS.Class);
		Resource scenariste = m.createResource(ns+"scenariste", RDFS.Class);
		Resource acteur = m.createResource(ns+"acteur", RDFS.Class);
		Resource compositeur = m.createResource(ns+"compositeur", RDFS.Class);
		Resource leParain = m.createResource(ns + "Le Parrain");
		Resource apocalypse = m.createResource(ns + "Apocalypse Now");
		Resource full = m.createResource(ns + "Full Metal Jacket");
		Resource dracula = m.createResource(ns + "Dracula");
		
		
		Property ne = m.createProperty(nsnaissance +"est_ne");
		Property nea = m.createProperty(nsnaissance +"ne_a");
		Property ville = m.createProperty(nsnaissance+"ville");
		Property etat = m.createProperty(nsnaissance+"etat");
		Property dateNP = m.createProperty(nsnaissance+"date");
		Property nom = m.createProperty(nspersonne+"nom");
		Property fille = m.createProperty(nspersonne + "fille");
		Property pere = m.createProperty(nspersonne + "pere");
		Property acteur_de = m.createProperty(nspersonne + "acteur_de");
		Property realise = m.createProperty(nspersonne + "realise");
		Property compositrice_de = m.createProperty(nspersonne + "compositrice_de");
		Property sorti_en = m.createProperty(nsfilm + "sorti_en");
		Property theme = m.createProperty(nsfilm + "theme");
		
		Literal villeDetroit = m.createLiteral(ns+"detroit");
		Literal etatL = m.createLiteral("mitchigan");
		Literal dateN = m.createLiteral("07/04/1939");
		
		//Branche RessourceNaissance
		m.add(ressourceFrancis, ne, ressourceNaissance);
		m.add(ressourceNaissance,nea, ressourceDetroit);
		m.addLiteral(ressourceNaissance, dateNP, dateN);
		m.addLiteral(ressourceDetroit, ville, villeDetroit);
		m.addLiteral(ressourceDetroit, etat, etatL);
	
		//Francis est un producteur, un scenariste et un realisateur
		m.addLiteral(ressourceFrancis, nom, m.createLiteral("Francis"));
		m.add(ressourceFrancis, RDF.type, producteur);
		m.add(ressourceFrancis, RDF.type, scenariste);
		m.add(ressourceFrancis, RDF.type, realisateur);

		//un producteur, un scenariste et un realisateur, un compositeur et un acteur sont des personnes
		m.add(producteur, RDFS.subClassOf, personne);
		m.add(acteur, RDFS.subClassOf, personne);
		m.add(scenariste, RDFS.subClassOf, personne);
		m.add(realisateur, RDFS.subClassOf, personne);
		m.add(compositeur, RDFS.subClassOf, personne);
		
		//Stanley Kubrick est un producteur, un scenariste et un realisateur
		m.addLiteral(ressourceStanley, nom, m.createLiteral("Stanley Kubrick"));
		m.add(ressourceStanley, RDF.type, producteur);
		m.add(ressourceStanley, RDF.type, scenariste);
		m.add(ressourceStanley, RDF.type, realisateur);
		
		
		//Vivian Kubrick est compositeur
		m.addLiteral(ressourceVivian, nom, m.createLiteral("Vivian Kubrick"));
		m.add(ressourceVivian, RDF.type,compositeur);
		
		//Vivian Kubrick est la fille de Stanley Kubrick
		m.add(ressourceVivian, fille, ressourceStanley);
		m.add(ressourceStanley, pere, ressourceVivian);
		
		//Marlon brando est une actrice
		m.addLiteral(ressourceMarlon, nom, m.createLiteral("Marlon Brando"));
		m.add(ressourceMarlon, RDF.type, acteur);
		
		//Films
		m.add(dracula, RDF.type, film);
		m.add(leParain, RDF.type, film);
		m.add(full, RDF.type, film);
		m.add(apocalypse, RDF.type, film);
		m.addLiteral(apocalypse, sorti_en, m.createLiteral("1979"));
		m.addLiteral(apocalypse, theme, m.createLiteral("La guerre du Vietnam"));
		m.addLiteral(full, theme, m.createLiteral("La guerre du Vietnam"));
		
		//Marlon brando a joué dans Apocalypse now
		m.add(ressourceMarlon, acteur_de, apocalypse);
		
		//Francis a réalisé 3 films
		m.add(ressourceFrancis, realise, dracula);
		m.add(ressourceFrancis, realise, leParain);
		m.add(ressourceFrancis, realise, apocalypse);
		
		//Stanley a réalisé Full Metal Jacket
		m.add(ressourceStanley, realise, full);
		
		//Vivian est la compositrice de Full Metal Jacket
		m.add(ressourceVivian, compositrice_de , full);
		
		m.write(System.out);
	}
}
