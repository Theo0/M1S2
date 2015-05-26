#include "Reseaux.h"
#include "Liens.h"

<<<<<<< HEAD
Reseaux::Reseaux():Graphes<Reseaux,Noeuds,Liens>(){}
=======
Reseaux::Reseaux():Graphes(){}
>>>>>>> origin/master

string Reseaux::toString(){
    return "Nom du réseau :  "+Graphes::nom_graphe+", liste des noeuds : "+
    Graphes::listeSommets()+",et des liens : "+Graphes::listeAretes();
}

void Reseaux::addArete(Liens * p_arete, Noeuds * p_s1, Noeuds * p_s2){
    Graphes::addArete(p_arete, p_s1, p_s2);
}

void Reseaux::addSommet(Noeuds * p_somm){
    Graphes::addSommet(p_somm);
}

Liens* Reseaux::deleteArete(Liens * p_aret){
<<<<<<< HEAD
    return Graphes::deleteArete(p_aret);
}

Noeuds* Reseaux::deleteSommet(Noeuds * p_somm){
    return Graphes::deleteSommet(p_somm);
=======
    //return Graphes::deleteArete(p_aret);
}

Noeuds* Reseaux::deleteSommet(Noeuds * p_somm){
    //return Graphes::deleteSommet(p_somm);
>>>>>>> origin/master
}

Reseaux::~Reseaux(){}