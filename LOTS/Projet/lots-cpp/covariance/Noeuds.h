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
<<<<<<< HEAD
    void ajouterArete(Liens*);
=======
>>>>>>> origin/master
    void addArete(Liens*);
>>>>>>> 8a0c71c7df3f954bf19ddbc6dc19a4edec88b429
    virtual ~Noeuds();
};

#endif
