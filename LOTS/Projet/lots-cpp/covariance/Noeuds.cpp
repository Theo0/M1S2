#include "Noeuds.h"
#include "Liens.h"

Noeuds::Noeuds():Sommets(){}


void Noeuds::ajouterArete(Liens * p_aret){
    Sommets::ajouterArete(p_aret);
}

Noeuds::~Noeuds(){}