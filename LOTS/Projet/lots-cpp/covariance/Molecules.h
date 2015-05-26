#include "includes.h"
#include "Graphes.h"
class Atomes;
class Liaisons;
using namespace std;

#ifndef _Molecules
#define _Molecules

<<<<<<< HEAD
class Molecules: public Graphes<Molecules,Atomes,Liaisons>{
=======
class Molecules: public Graphes{
>>>>>>> origin/master
public:

	Molecules();
    string toString();
	void addArete(Liaisons*,Atomes*,Atomes*);
	void addSommet(Atomes*);
<<<<<<< HEAD
    Liaisons* deleteArete(Liaisons*);
    Atomes* deleteSommet(Atomes*);
=======
>>>>>>> origin/master
    virtual ~Molecules();
};

#endif
