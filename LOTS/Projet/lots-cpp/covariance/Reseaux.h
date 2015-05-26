#include "includes.h"
#include "Graphes.h"
class Noeuds;
class Liens;
using namespace std;

#ifndef _Reseaux
#define _Reseaux

<<<<<<< HEAD
class Reseaux: public Graphes<Reseaux,Noeuds,Liens>{
=======
class Reseaux: public Graphes{
>>>>>>> origin/master
public:

	Reseaux();
    string toString();
	void addArete(Liens*,Noeuds*,Noeuds*);
	void addSommet(Noeuds*);
    Liens* deleteArete(Liens*);
    Noeuds* deleteSommet(Noeuds*);
    virtual ~Reseaux();
};

#endif
