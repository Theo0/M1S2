#include "includes.h"
#include "Graphes.h"
class Atomes;
class Liaisons;
using namespace std;

#ifndef _Molecules
#define _Molecules

class Molecules: public Graphes<Molecules,Atomes,Liaisons>{
public:

	Molecules();
    string toString();
	void ajouterArete(Liaisons*,Atomes*,Atomes*);
	void ajouterSommet(Atomes*);
    Liaisons* deleteArete(Liaisons*);
    Atomes* deleteSommet(Atomes*);
    virtual ~Molecules();
};

#endif
