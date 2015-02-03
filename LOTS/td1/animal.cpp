#include <iostream>

using namespace std;

class Aliment{
public:
	virtual void whoAmI(){
		cout << "Je suis un aliment" << endl;
	}
};

class Herbe : public Aliment{
public:
	virtual void whoAmI(){
		cout << "Je suis une herbe" << endl;
	}
};

class Animal{
public:
	virtual void manger(Aliment * a){
		cout << "Animal -> manger (aliment)" << endl;
	}
};

class Herbivore : public Animal{
public:
	virtual void manger(Aliment * a){
		cout << "Herbivore => manger(aliment)" << endl;
		Herbe* h_ = dynamic_cast<Herbe*>(a);
		if(h_ != 0){
			Animal::manger(h_);
		}
		else{
			cout << "Herbivore => Impossible de manger : Pas herbe" << endl;
		}
	}

	virtual void mangerHerbe(Herbe * h){
		cout << "Herbivore => mangerHerbe(Herbe)" << endl;
		Animal::manger(h);
	}
};

int main(){
	Animal * vache = new Herbivore();
	Aliment * feuille = new Herbe();
	Aliment * viande = new Aliment();
	vache->manger(feuille);
}