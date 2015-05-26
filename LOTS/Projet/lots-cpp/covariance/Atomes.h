#include "Sommets.h"
#include "Molecules.h"

#ifndef _Atomes
#define _Atomes


<<<<<<< HEAD
class Atomes:public Sommets<Molecules,Atomes,Liaisons>{
public:
    Atomes();
    void createArete(Atomes*);
=======
class Atomes:public Sommets{
public:
    Atomes();
>>>>>>> origin/master
    void addArete(Liaisons*);
    virtual ~Atomes();
};

#endif
