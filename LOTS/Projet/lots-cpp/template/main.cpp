#include "includes.h"
#include "Graphes.h"
#include "Sommets.h"
#include "Aretes.h"
#include "Reseaux.h"
#include "Noeuds.h"
#include "Liens.h"
#include "Molecules.h"
#include "Atomes.h"
#include "Liaisons.h"
using namespace std;

int main( int argc, const char* argv[] )
{
    
    Reseaux* res=new Reseaux();
    Noeuds* n1=new Noeuds();
    Noeuds* n2=new Noeuds();
    Liens* l=new Liens();
    res->ajouterSommet(n1);
    res->ajouterSommet(n2);
    res->ajouterArete(l, n1, n2);
    cout << res->toString() << endl;

    Molecules* mol=new Molecules();
    Atomes* a1=new Atomes();
    Atomes* a2=new Atomes();
    Liaisons* ll=new Liaisons();
    mol->ajouterSommet(a1);
    mol->ajouterSommet(a2);
    mol->ajouterArete(ll, a1, a2);
    cout << mol->toString() << endl;


    /* CHIMERE
    Molecules* mol2=new Molecules();
    Noeuds* a3=new Noeuds();
    Atomes* a4=new Atomes();
    Liaisons* l2=new Liaisons();
    mol2->ajouterSommet(a3);
    mol2->ajouterSommet(a4);
    mol2->ajouterArete(l2, a3, a4);
    cout << mol2->toString() << endl;
    */




	return 0;
}
