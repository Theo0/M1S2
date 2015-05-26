#include "includes.h"
#include "Graphes.h"
class Noeuds;
class Liens;
using namespace std;

#ifndef _Reseaux
#define _Reseaux

class Reseaux: public Graphes<Reseaux,Noeuds,Liens>{
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
