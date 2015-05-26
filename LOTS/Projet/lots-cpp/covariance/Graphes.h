#include "includes.h"

using namespace std;

#ifndef _Graphes
#define _Graphes

template <class G,class S,class A>
class Graphes {
public:
    string nom_graphe;
    static int num;
    set<S*> sommets;
    set<A*> aretes;
    Graphes();
    string toString();
	void addArete(A*,S*,S*);
	void addSommet(S*);
	A* deleteArete(A*);
	S* deleteSommet(S*);
	virtual ~Graphes();
protected:
	string listeSommets();
	string listeAretes();
private:
    typename set<S*>::iterator itS;
    typename set<A*>::iterator itA;

};



template <class G,class S,class A>
int Graphes<G, S, A>::num;

//CONSTRUCTEUR
template <class G,class S,class A>
Graphes<G, S, A>::Graphes(){
    Graphes::num++;
    stringstream s;
    s << "Graphe " << num;
	nom_graphe=s.str();
}


//Affiche le graphe
template <class G,class S,class A>
string Graphes<G, S, A>::toString(){
	return "Nom du graphe :  "+nom_graphe+", liste des sommets: "
    +listeSommets()+"et des arêtes:"+listeAretes();
}

template <class G,class S,class A>
string Graphes<G, S, A>::listeSommets(){
    string ret="";
	if (sommets.size()==0){
		return "aucun sommet";
	}else{
		for (itS=sommets.begin(); itS!=sommets.end();itS++){
			ret+=itS.operator*()->toString()+" ";
		}
		return ret;
	}
}

template <class G,class S,class A>
string Graphes<G, S, A>::listeAretes(){
    string ret="";
    if (aretes.size()==0){
        return "aucune arêtes";
    }else{
        for (itA=aretes.begin(); itA!=aretes.end();itA++){
            ret+=itA.operator*()->toString()+"";
        }
        return ret;
    }
}




//Ajout arrête au graphe, on ajoute d'abord les sommets à l'arrête, puis les arrêtes au sommet, puis l'arete dans le graphe
template <class G,class S,class A>
void Graphes<G, S, A>::addArete(A* p_arete,S* p_s1,S* p_s2){
	if (p_arete->getArete_graphe()==NULL){
        p_arete->setArete_graphe(dynamic_cast<G*>(this));
    }
    p_s1->setSommet_dans(dynamic_cast<G*>(this));
	p_s2->setSommet_dans(dynamic_cast<G*>(this));
	p_s1->addArete(p_arete);
	p_s2->addArete(p_arete);
    p_arete->setSommets(p_s1, p_s2);
    aretes.insert(p_arete);
    
}


//Ajout d'un sommet au graphe
template <class G,class S,class A>
void Graphes<G, S, A>::addSommet(S* p_sommets) {
	if (p_sommets->getSommet_dans()==NULL){
        p_sommets->setSommet_dans(dynamic_cast<G*>(this));
    }
    sommets.insert(p_sommets);
}

//Suppression d'une arete
template <class G,class S,class A>
A* Graphes<G, S, A>::deleteArete(A* p_arete){
	if (aretes.erase(p_arete)==1){
		p_arete->setArete_graphe(NULL);
		p_arete->setSommets(NULL, NULL);
		return p_arete;
	}else{
		return NULL;
	}
}

template <class G,class S,class A>
S* Graphes<G, S, A>::deleteSommet(S* p_sommet){
	if (sommets.erase(p_sommet)==1){
		p_sommet->setSommet_dans(NULL);
		while (p_sommet->itAS!=p_sommet->liste_aretes.end()){
			deleteArete(*p_sommet->itAS);
            p_sommet->itAS++;
		}
		return p_sommet;
	}else{
		return NULL;
	}
}

template <class G,class S,class A>
Graphes<G, S, A>::~Graphes() {
}
#endif
