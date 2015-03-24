using namespace std;

#include <iostream>
#include <string>
#include <sstream>
#include <set>

#include "sommet.h"
#include "arete.h"
#include "graphe.h"
#include "grapheConc.cpp"
#include "AreteConc.cpp"
#include "sommetConc.cpp"


int main(){
	GrapheConc* g = new GrapheConc();
	SommetConc* s = new SommetConc();

	g->ajoutSommet(s);
}