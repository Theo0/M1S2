#include "Atomes.h"
#include "Liaisons.h"

Atomes::Atomes():Sommets(){}


void Atomes::addArete(Liaisons * p_aret){
    Sommets::addArete(p_aret);
}

Atomes::~Atomes(){}