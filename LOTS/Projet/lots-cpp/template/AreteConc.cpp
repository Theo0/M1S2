using namespace std;

#include <iostream>
#include <string>
#include <sstream>
#include <set>

#include "sommet.h"
#include "graphe.h"
#include "arete.h"

class GrapheConc;
class SommetConc;

class AreteConc : public Arete<GrapheConc, SommetConc, AreteConc>
{
public:
	 AreteConc();
};