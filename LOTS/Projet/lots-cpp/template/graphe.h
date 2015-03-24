#ifndef __LOTSC__GenericGraphes__
#define __LOTSC__GenericGraphes__

#include <iostream>
#include <string>
#include <exception>
#include <sstream>
#include <set>

template<class G, class S, class A>
class Graphes{
private:
	std::string nom;
	std::set<S*> listeSommets;
	std::set<A*> listeAretes;
	static int numG;

public:
	Graphes();
	virtual void afficherGraphe();
	virtual void ajoutArete(A*, S*, S*);
	virtual void ajoutSommet(S*);
	virtual void supprimerSommet(S*);
	virtual void supprimerArete(A*);


};


using namespace std;
template<class G, class S, class A>
Graphes<G, S, A>::Graphes(){
	Graphes::numG++;
	stringstream s;
	s << "Graphe" << numG;
	nom = s.str();
}

template<class G, class S, class A>
void Graphes<G, S, A>::ajoutArete(A* a, S* s1, S* s2){
	if(listeSommets.find(s1) != listeSommets.end() && listeSommets.find(s2) != listeSommets.end()){
		listeSommets.insert(a);
		s1->addArete(a);
		s2->addArete(a);
		a->setSommet(s1, s2);
		a->setGraphe(this);
	}
}

template<class G, class S, class A>
void Graphes<G, S, A>::ajoutSommet(S* s){
	if(listeSommets.find(s) == listeSommets.end()){
		listeSommets.insert(s);
		s->setGraphe(this);
	}
	else{
		cout << "Sommet déjà présent dans le graphe" << endl;
	}
}

template<class G, class S, class A>
void Graphes<G, S, A>::afficherGraphe(){
	cout << "Graphe : " << nom << endl;

}


#endif