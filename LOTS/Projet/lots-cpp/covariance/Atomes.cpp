#include "Atomes.h"
#include "Liaisons.h"

<<<<<<< HEAD
Atomes::Atomes():Sommets<Molecules,Atomes,Liaisons>(){}


void Atomes::createArete(Atomes * p_s2){
    Liaisons* a=new Liaisons();
	a->setSommets(this,p_s2);
	addArete(a);
	p_s2->addArete(a);
}

=======
Atomes::Atomes():Sommets(){}


>>>>>>> origin/master
void Atomes::addArete(Liaisons * p_aret){
    Sommets::addArete(p_aret);
}

Atomes::~Atomes(){}