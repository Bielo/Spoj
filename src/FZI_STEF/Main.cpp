#include <iostream>
using namespace std;

int main() {
	
	long long numberOfCities=0;
	long long concert=0;
	long long sum=0;
	long long profit=0;
	
	cin>>numberOfCities;
	
	for(int i =0; i<numberOfCities; i++){
		
		cin>>concert;
		sum +=concert;
		if(sum <0){
			sum=0;
		}
		if(sum > profit){
			profit=sum;
		}
	}
	cout<< profit;
	return 0;
}