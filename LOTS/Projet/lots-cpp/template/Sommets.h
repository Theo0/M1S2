#include "includes.h"
#include "Aretes.h"
using namespace std;

#ifndef _Sommets
#define _Sommets

template <class G,class S,class A>
class Sommets {
public:
    string nom_sommet;
	G* sommet_dans;
	set<A*> liste_aretes;
    typename set<A*>::iterator itAS;
	static int num;
    Sommets();
    void ajouterArete(A*);
    G* getSommet_dans();
    void setSommet_dans(G*);
	string toString();
	virtual ~Sommets();
};

template <class G,class S,class A>
int Sommets<G, S, A>::num;

//CONSTRUCTEUR
template <class G,class S,class A>
Sommets<G,S,A>::Sommets() {
    Sommets::num++;
    stringstream s;
    s << "Sommet " << num;
	nom_sommet=s.str();
    sommet_dans=NULL;
	liste_aretes=set<A*>();
}

template <class G,class S,class A>
string Sommets<G,S,A>::toString(){
	return nom_sommet;
}

//Ajout d'une arrete 
template <class G,class S,class A>
void Sommets<G,S,A>::ajouterArete(A* p_arete){
	liste_aretes.insert(p_arete);
}

//Getters & Setters
template <class G,class S,class A>
void Sommets<G,S,A>::setSommet_dans(G* p_sommet_dans){
	sommet_dans=p_sommet_dans;
}

template <class G,class S,class A>
G* Sommets<G,S,A>::getSommet_dans() {
	return sommet_dans;
}

//Destructeur
template <class G,class S,class A>
Sommets<G,S,A>::~Sommets() {
}

#endif
