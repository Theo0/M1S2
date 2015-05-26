#include "Aretes.h"
#include "Reseaux.h"
#include "Noeuds.h"

#ifndef _Liens
#define _Liens

class Liens:public Aretes<Reseaux,Noeuds,Liens>{
public:
    Liens();
    void setSommets(Noeuds*,Noeuds*);
    virtual ~Liens();
};

#endif /* defined(_Liens) */
