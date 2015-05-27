#include "Atomes.h"
#include "Liaisons.h"

Atomes::Atomes():Sommets(){}


void Atomes::ajouterArete(Liaisons * p_aret){
    Sommets::ajouterArete(p_aret);
}

Atomes::~Atomes(){}