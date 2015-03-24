using namespace std;

#include <iostream>
#include <string>
#include <sstream>
#include <set>

#include "sommet.h"
#include "graphe.h"
#include "arete.h"

class SommetConc;
class AreteConc;

class GrapheConc : public Graphes<GrapheConc, SommetConc, AreteConc>
{
public:
	 GrapheConc();
};