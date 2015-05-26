#include "Molecules.h"
#include "Liaisons.h"

<<<<<<< HEAD
Molecules::Molecules():Graphes<Molecules,Atomes,Liaisons>(){}
=======
Molecules::Molecules():Graphes(){}
>>>>>>> origin/master

string Molecules::toString(){
    return "Nom de la molécule :  "+Graphes::nom_graphe+", liste des Atomes : "+
    Graphes::listeSommets()+",et des Liaisons : "+Graphes::listeAretes();
}

void Molecules::addArete(Liaisons * p_arete, Atomes * p_s1, Atomes * p_s2){
    Graphes::addArete(p_arete, p_s1, p_s2);
}

void Molecules::addSommet(Atomes * p_somm){
    Graphes::addSommet(p_somm);
}

<<<<<<< HEAD
Liaisons* Molecules::deleteArete(Liaisons * p_aret){
    return Graphes::deleteArete(p_aret);
}

Atomes* Molecules::deleteSommet(Atomes * p_somm){
    return Graphes::deleteSommet(p_somm);
}

=======
>>>>>>> origin/master
Molecules::~Molecules(){}