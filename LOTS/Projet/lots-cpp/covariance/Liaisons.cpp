#include "Liaisons.h"

Liaisons::Liaisons():Aretes(){}

void Liaisons::setSommets(Atomes * p_s1, Atomes * p_s2){
    Aretes::setSommets(p_s1, p_s2);
}

Liaisons::~Liaisons(){}