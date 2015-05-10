#include "includes.h"
class Graphes;
class Aretes;

using namespace std;

#ifndef _Sommets
#define _Sommets


class Sommets {
public:
    string nom_sommet;
	Graphes* sommet_dans;
	set<Aretes*> liste_aretes;
    typename set<Aretes*>::iterator itAS;
	static int num;
    Sommets();
    void addArete(Aretes*);
    Graphes* getSommet_dans();
    void setSommet_dans(Graphes*);
	string toString();
	virtual ~Sommets();
};

#endif
