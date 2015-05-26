#include "Noeuds.h"
#include "Liens.h"

Noeuds::Noeuds():Sommets(){}


void Noeuds::addArete(Liens * p_aret){
    Sommets::addArete(p_aret);
}

Noeuds::~Noeuds(){}