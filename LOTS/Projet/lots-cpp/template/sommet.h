#ifndef __LOTSC__GenericSom__
#define __LOTSC__GenericSom__

#include <iostream>
#include <string>
#include <exception>
#include <sstream>
#include <set>

using namespace std;

template<class G, class S, class A>
class Sommet{

private:
	std::string nom_s;
	G* graphe;
	std::set<A*> listeAretes;
	static int numS;


public:
	Sommet();
	virtual void addArete(A*);
	virtual void emptyArete();
	virtual void setGraphe(G*);

};


	using namespace std;
	template <class G,class S,class A>
	Sommet<G, S, A>::Sommet(){
		Sommet::numS++;
		stringstream s;
		s << "Sommet" << numS;
		nom_s = s.str();
	}

	template <class G,class S,class A>
	void Sommet<G, S, A>::addArete(A* a){
		if(listeAretes.find(a) == listeAretes.end()){
			listeAretes.insert(a);
		}
		else{
			cout << "Cette arete est déjà présente dans le graphe" << endl;
		}
	}

	template <class G,class S,class A>
	void Sommet<G, S, A>::emptyArete(){
		listeAretes.clear();
	}

	template <class G,class S,class A>
	void Sommet<G, S, A>::setGraphe(G* g){
		graphe = g;
	}

	#endif