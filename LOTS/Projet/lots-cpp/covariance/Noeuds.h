#include "Sommets.h"
#include "Reseaux.h"

#ifndef _Noeuds
#define _Noeuds


class Noeuds:public Sommets{
public:
    Noeuds();
    void createArete(Noeuds*);
    void addArete(Liens*);
    virtual ~Noeuds();
};

#endif
