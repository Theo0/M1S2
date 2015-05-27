#include "includes.h"
#include "Graphes.h"
#include "Sommets.h"
#include "Aretes.h"
using namespace std;

int Graphes::num;

//CONSTRUCTEUR

Graphes::Graphes(){
    Graphes::num++;
    stringstream s;
    s << "Graphe " << num;
	nom_graphe=s.str();
}


//Affiche le graphe

string Graphes::toString(){
	return "Nom du graphe :  "+nom_graphe+", liste des sommets: "
    +listeSommets()+"et des arêtes:"+listeAretes();
}


string Graphes::listeSommets(){
    string ret="";
	if (sommets.size()==0){
		return "aucun sommet";
	}else{
		for (itS=sommets.begin(); itS!=sommets.end();itS++){
			ret+=itS.operator*()->toString()+" ";
		}
		return ret;
	}
}


string Graphes::listeAretes(){
    string ret="";
    if (aretes.size()==0){
        return "aucune arêtes";
    }else{
        for (itA=aretes.begin(); itA!=aretes.end();itA++){
            ret+=itA.operator*()->toString()+"";
        }
        return ret;
    }
}




//Ajout arrête au graphe, on ajoute d'abord les sommets à l'arrête, puis les arrêtes au sommet, puis l'arete dans le graphe

void Graphes::ajouterArete(Aretes * p_arete,Sommets * p_s1,Sommets * p_s2){
	
    p_arete->setArete_graphe(this);
    p_s1->setSommet_dans(this);
	p_s2->setSommet_dans(this);
	p_s1->ajouterArete(p_arete);
	p_s2->ajouterArete(p_arete);
    p_arete->setSommets(p_s1, p_s2);
    aretes.insert(p_arete);
    
}


//Ajout d'un sommet au graphe

void Graphes::ajouterSommet(Sommets * p_sommets) {
	
    p_sommets->setSommet_dans(this);
    
    sommets.insert(p_sommets);
}


Graphes::~Graphes() {
}