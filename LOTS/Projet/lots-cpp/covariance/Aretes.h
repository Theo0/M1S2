#include "includes.h"
class Sommets;
class Graphes;

using namespace std;

#ifndef _Aretes
#define _Aretes


class Aretes {
public:
    string nom_arete;
	Graphes* arete_graphe;
	Sommets* s1;
	Sommets* s2;
	static int num;

    Aretes();
    Aretes(Graphes*,Sommets*,Sommets*);
    void setSommets(Sommets*,Sommets*);
	void setSommets(Sommets*);
    Graphes* getArete_graphe();
	void setArete_graphe(Graphes*);
	string toString();
	virtual ~Aretes();
};

#endif
