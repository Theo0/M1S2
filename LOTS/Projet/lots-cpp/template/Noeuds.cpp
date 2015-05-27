#include "Noeuds.h"
#include "Liens.h"

Noeuds::Noeuds():Sommets<Reseaux,Noeuds,Liens>(){}

void Noeuds::ajouterArete(Liens * p_aret){
    Sommets::ajouterArete(p_aret);
}

Noeuds::~Noeuds(){}