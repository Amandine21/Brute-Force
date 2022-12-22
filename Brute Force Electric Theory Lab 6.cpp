#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
#include <sstream>

using namespace std;
//-------------------------------------------------------------------------------------------
float find_frequency(float Resistor, float Capacitor){
	float argument = (1 - .5) / (1 + .5); 
	float frequency = -1 / (2 * Capacitor * Resistor) * log(argument);
	return frequency;
}

int main(){
	float Capacitor = 0;
	float frequency = 0;
	float Resistor = 0;
	string line;

	ifstream ifs;
	ifs.open("DataC.txt");

	while(getline(ifs, line)){
		stringstream iss(line);
		iss >> Resistor;
		iss >> Capacitor;
		frequency = find_frequency(Resistor, Capacitor);
		if((frequency > .4) && (frequency < .6))
			cout << "Frequency = " << frequency <<"		" <<" Resistor = " << Resistor << "		" << "Capacitor = " << Capacitor << endl;
	}
	return 0;
}