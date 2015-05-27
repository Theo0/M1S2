#include "includes.h"
#include "Sommets.h"
#include "Aretes.h"

int Sommets::num;

//CONSTRUCTEUR
Sommets::Sommets() {
    Sommets::num++;
    stringstream s;
    s << "Sommet " << num;
	nom_sommet=s.str();
    sommet_dans=NULL;
	liste_aretes=set<Aretes*>();
}


string Sommets::toString(){
	return nom_sommet;
}

//Ajout d'une arrete 

void Sommets::ajouterArete(Aretes * p_arete){
	liste_aretes.insert(p_arete);
}

//Getters & Setters

void Sommets::setSommet_dans(Graphes * p_sommet_dans){
	sommet_dans=p_sommet_dans;
}


Graphes* Sommets::getSommet_dans() {
	return sommet_dans;
}

//Destructeur

Sommets::~Sommets() {
}