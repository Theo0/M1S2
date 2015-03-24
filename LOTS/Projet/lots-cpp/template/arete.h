#ifndef __LOTSC__GenericArete__
#define __LOTSC__GenericArete__

#include <iostream>
#include <string>
#include <exception>
#include <sstream>
#include <set>
#include "graphe.h"

using namespace std;

template<class G, class S, class A>
class Arete{

private:
	std::string nom_a;
	G* graphe;
	S* sommet1;
	S* sommet2;
	static int numA;


public:
	Arete();
	virtual void setSommets(S*, S*);
	virtual void setGraphe(G*);

};


using namespace std;
template <class G,class S,class A>
Arete<G, S, A>::Arete(){
	Arete::numA++;
	stringstream s;
	s << "Arete" << numA;
	nom_a = s.str();
}

template <class G,class S,class A>
void Arete<G, S, A>::setSommets(S* s1, S* s2){
	sommet1 = s1;
	sommet2 = s2;
}

template <class G,class S,class A>
void Arete<G, S, A>::setGraphe(G* g){
	graphe = g;
}

#endif