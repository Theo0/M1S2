#include "includes.h"
#include "Graphes.h"
class Noeuds;
class Liens;
using namespace std;

#ifndef _Reseaux
#define _Reseaux

class Reseaux: public Graphes{
public:

	Reseaux();
    string toString();
	void ajouterArete(Liens*,Noeuds*,Noeuds*);
	void ajouterSommet(Noeuds*);
    virtual ~Reseaux();
};

#endif
