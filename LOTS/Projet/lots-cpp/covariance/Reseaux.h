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
	void ajouterArete(Liens*,Noeuds*,Noeuds*);
	void ajouterSommet(Noeuds*);
    virtual ~Reseaux();
};

#endif
