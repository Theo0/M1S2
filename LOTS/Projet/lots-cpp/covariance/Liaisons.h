#include "Aretes.h"
#include "Molecules.h"
#include "Atomes.h"

#ifndef _Liaisons
#define _Liaisons

<<<<<<< HEAD
class Liaisons:public Aretes<Molecules,Atomes,Liaisons>{
=======
class Liaisons:public Aretes{
>>>>>>> origin/master
public:
    Liaisons();
    void setSommets(Atomes*,Atomes*);
    virtual ~Liaisons();
};

#endif /* defined(_Liaisons) */
