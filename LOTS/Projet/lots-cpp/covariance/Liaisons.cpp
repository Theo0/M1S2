#include "Liaisons.h"

<<<<<<< HEAD
Liaisons::Liaisons():Aretes<Molecules, Atomes, Liaisons>(){}
=======
Liaisons::Liaisons():Aretes(){}
>>>>>>> origin/master

void Liaisons::setSommets(Atomes * p_s1, Atomes * p_s2){
    Aretes::setSommets(p_s1, p_s2);
}

Liaisons::~Liaisons(){}