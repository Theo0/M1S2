#include "Sommets.h"
#include "Reseaux.h"

#ifndef _Noeuds
#define _Noeuds


class Noeuds:public Sommets<Reseaux,Noeuds,Liens>{
public:
    Noeuds();
    void addArete(Liens*);
    virtual ~Noeuds();
};

#endif
