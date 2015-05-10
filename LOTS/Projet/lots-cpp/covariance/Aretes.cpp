#include "includes.h"
#include "Aretes.h"
#include "Graphes.h"
#include "Sommets.h"

int Aretes::num;

//CONSTRUCTEUR

Aretes::Aretes(){
    Aretes::num++;
    stringstream s;
    s << "Arete " << num;
	nom_arete=s.str();
	arete_graphe=NULL;
    s1=NULL;
    s2=NULL;
}


//Ajout de 2 sommets à une arrete

void Aretes::setSommets(Sommets * p_s1,Sommets * p_s2){
    s1=p_s1;
    s2=p_s2;
}


//Getters et Setters

Graphes* Aretes::getArete_graphe() {
    return arete_graphe;
}


void Aretes::setArete_graphe(Graphes * a) {
	arete_graphe = a;
}

//Affichage du nom de l'arrête

string Aretes::toString(){
	return nom_arete;
}

//Destructeur

Aretes::~Aretes() {
}