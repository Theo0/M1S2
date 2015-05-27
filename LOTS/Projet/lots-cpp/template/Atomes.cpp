#include "Atomes.h"
#include "Liaisons.h"

Atomes::Atomes():Sommets<Molecules,Atomes,Liaisons>(){}

void Atomes::ajouterArete(Liaisons * p_aret){
    Sommets::ajouterArete(p_aret);
}

Atomes::~Atomes(){}