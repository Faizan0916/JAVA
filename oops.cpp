#include <iostream>
#include <string>
using namespace std;

class Address {
private:
    string street;
    string city;
    string zipCode;

public:
    
    Address() : street(""), city(""), zipCode("") {}

    
    Address(string s, string c, string z) : street(s), city(c), zipCode(z) {}

    
    void setAddress(string s, string c, string z) {
        street = s;
        city = c;
        zipCode = z;
    }


    void display() const {
        cout << "Street  : " << street << endl;
        cout << "City    : " << city << endl;
        cout << "ZipCode : " << zipCode << endl;
    }
};


class Person {
private:
    string name;
    int age;
    Address address;  

public:
    Person() : name(""), age(0) {}

    Person(string n, int a, Address addr) : name(n), age(a), address(addr) {}

    
    void setPerson(string n, int a, Address addr) {
        name = n;
        age = a;
        address = addr;
    }

   
    void display() const {
        cout << "Name    : " << name << endl;
        cout << "Age     : " << age << endl;
        address.display();
    }
};

int main() {
    cout << "Name : Faizan Ahmad Ansari" << endl;
    cout << "Roll Number : 24BCD020" << endl;
   

    
    Address a1("jamia Nagar", "Delhi", "110025");
    Person p1("Alex", 20, a1);

    // Object 2: data set using setter functions
    Address a2;
    a2.setAddress("45 Noida", "Kolkata", "110028");
    Person p2;
    p2.setPerson("Harry", 19, a2);

    cout << "\nPerson 1 Details:" << endl;
    p1.display();

    cout << "\nPerson 2 Details:" << endl;
    p2.display();

    return 0;
}
