#include "Atomes.h"
#include "Liaisons.h"

Atomes::Atomes():Sommets(){}


void Atomes::createArete(Atomes * p_s2){
    Liaisons* a=new Liaisons();
	a->setSommets(this,p_s2);
	addArete(a);
	p_s2->addArete(a);
}

void Atomes::addArete(Liaisons * p_aret){
    Sommets::addArete(p_aret);
}

Atomes::~Atomes(){}