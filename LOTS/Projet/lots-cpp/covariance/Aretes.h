//Header et implémentation dans le même fichier

#include "includes.h"
using namespace std;

#ifndef _Aretes
#define _Aretes

template <class G,class S,class A>
class Aretes {
public:
    string nom_arete;
	G* arete_graphe;
	S* s1;
	S* s2;
	static int num;

    Aretes();
    Aretes(G*,S*,S*);
    void setSommets(S*,S*);
	void setSommets(S*);
    G* getArete_graphe();
	void setArete_graphe(G*);
	string toString();
	virtual ~Aretes();
};


template <class G,class S,class A>
int Aretes<G, S, A>::num;

//CONSTRUCTEUR
template <class G,class S,class A>
Aretes<G,S,A>::Aretes(){
    Aretes::num++;
    stringstream s;
    s << "Arete " << num;
	nom_arete=s.str();
	arete_graphe=NULL;
    s1=NULL;
    s2=NULL;
}


//Ajout de 2 sommets à une arrete
template <class G,class S,class A>
void Aretes<G,S,A>::setSommets(S* p_s1,S* p_s2){
    s1=p_s1;
    s2=p_s2;
}


//Getters et Setters
template <class G,class S,class A>
G* Aretes<G,S,A>::getArete_graphe() {
    return arete_graphe;
}

template <class G,class S,class A>
void Aretes<G,S,A>::setArete_graphe(G* arete_graphe) {
	arete_graphe = arete_graphe;
}

//Affichage du nom de l'arrête
template <class G,class S,class A>
string Aretes<G,S,A>::toString(){
	return nom_arete;
}

//Destructeur
template <class G,class S,class A>
Aretes<G,S,A>::~Aretes<G, S, A>() {
}


#endif
