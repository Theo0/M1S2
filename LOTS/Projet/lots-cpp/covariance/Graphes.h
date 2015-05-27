#include "includes.h"
class Sommets;
class Aretes;
using namespace std;

#ifndef _Graphes
#define _Graphes


class Graphes {
public:
    string nom_graphe;
    static int num;
    set<Sommets*> sommets;
    set<Aretes*> aretes;
    Graphes();
    string toString();
	void ajouterArete(Aretes*,Sommets*,Sommets*);
	void ajouterSommet(Sommets*);
	virtual ~Graphes();
protected:
	string listeSommets();
	string listeAretes();
private:
    typename set<Sommets*>::iterator itS;
    typename set<Aretes*>::iterator itA;

};

#endif
