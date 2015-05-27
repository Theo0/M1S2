#include "includes.h"
#include "Graphes.h"
class Atomes;
class Liaisons;
using namespace std;

#ifndef _Molecules
#define _Molecules

class Molecules: public Graphes{
public:

	Molecules();
    string toString();
	void ajouterArete(Liaisons*,Atomes*,Atomes*);
	void ajouterSommet(Atomes*);
    virtual ~Molecules();
};

#endif
