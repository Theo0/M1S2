#include <iostream>

using namespace std;

static int ident = 0;

class T{
public:
	virtual void whoamI(){
		cout << "Je suis un paramètre T" << endl;
	}
};

class U{
public:
	virtual void whoamI(){
		cout << "Je suis un paramètre U" << endl;
	}
};

class V{
public:
	virtual void whoamI(){
		cout << "Je suis un paramètre V" << endl;
	}
};


class Racine {

protected:
	int id;
public:
	Racine(){
		id = ident;
		ident++;
	}
	virtual void whoamI() const{
		cout << "Je suis une racine : " << id << endl;
	}
};

class A : public Racine {
public:
	virtual void whoamI() const {
		cout << "Je suis un A : " << id << endl;
	}

	virtual void foo(T * t){
		cout << "A.foo(T)" << endl;
		whoamI();
		t->whoamI();
	}

};

class B : public A {
public:
	virtual void whoamI() const {
		cout << "Je suis un B : " << id << endl;
	}
	
};

class C : public B {
public:
	virtual void whoamI() const {
		cout << "Je suis un C : " << id << endl;
	}

	virtual void foo(U * u){
		cout << "C.foo(U)" << endl;
		whoamI();
		u->whoamI();
	}
};


int main(){

	B * bc = new C();
	T * t = new T();
	A * a = new A();
	U * u = new U();
	B * b = new B();
	cout << "APPEL ****************" << endl;
	bc->foo(t);
}