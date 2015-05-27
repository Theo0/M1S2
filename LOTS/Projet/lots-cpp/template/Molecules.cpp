#include "Molecules.h"
#include "Liaisons.h"

Molecules::Molecules():Graphes<Molecules,Atomes,Liaisons>(){}

string Molecules::toString(){
    return "Nom de la molécule :  "+Graphes::nom_graphe+", liste des Atomes : "+
    Graphes::listeSommets()+",et des Liaisons : "+Graphes::listeAretes();
}

void Molecules::ajouterArete(Liaisons * p_arete, Atomes * p_s1, Atomes * p_s2){
    Graphes::ajouterArete(p_arete, p_s1, p_s2);
}

void Molecules::ajouterSommet(Atomes * p_somm){
    Graphes::ajouterSommet(p_somm);
}

Liaisons* Molecules::deleteArete(Liaisons * p_aret){
    return Graphes::deleteArete(p_aret);
}

Atomes* Molecules::deleteSommet(Atomes * p_somm){
    return Graphes::deleteSommet(p_somm);
}

Molecules::~Molecules(){}