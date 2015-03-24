using namespace std;

#include <iostream>
#include <string>
#include <sstream>
#include <set>

#include "sommet.h"
#include "graphe.h"
#include "arete.h"

class GrapheConc;
class AreteConc;

class SommetConc : public Sommet<GrapheConc, SommetConc, AreteConc>
{
public:
	 SommetConc();
};