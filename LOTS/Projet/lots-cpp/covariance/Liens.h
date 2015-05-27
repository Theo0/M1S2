#include "Aretes.h"
#include "Reseaux.h"
#include "Noeuds.h"

#ifndef _Liens
#define _Liens

<<<<<<< HEAD
class Liens:public Aretes<Reseaux,Noeuds,Liens>{
=======
class Liens:public Aretes{
>>>>>>> origin/master
public:
    Liens();
    void setSommets(Noeuds*,Noeuds*);
    virtual ~Liens();
};

#endif /* defined(_Liens) */
