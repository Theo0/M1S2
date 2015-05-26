#include "Sommets.h"
#include "Reseaux.h"

#ifndef _Noeuds
#define _Noeuds


<<<<<<< HEAD
class Noeuds:public Sommets<Reseaux,Noeuds,Liens>{
public:
    Noeuds();
    void createArete(Noeuds*);
=======
class Noeuds:public Sommets{
public:
    Noeuds();
>>>>>>> origin/master
    void addArete(Liens*);
    virtual ~Noeuds();
};

#endif
