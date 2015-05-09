#include "Noeuds.h"
#include "Liens.h"

Noeuds::Noeuds():Sommets<Reseaux,Noeuds,Liens>(){}


void Noeuds::createArete(Noeuds * p_s2){
    Liens* a=new Liens();
	a->setSommets(this,p_s2);
	addArete(a);
	p_s2->addArete(a);
}

void Noeuds::addArete(Liens * p_aret){
    Sommets::addArete(p_aret);
}

Noeuds::~Noeuds(){}