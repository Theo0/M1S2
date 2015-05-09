#include "Liens.h"

Liens::Liens():Aretes<Reseaux, Noeuds, Liens>(){}

void Liens::setSommets(Noeuds * p_s1, Noeuds * p_s2){
    Aretes::setSommets(p_s1, p_s2);
}

Liens::~Liens(){}