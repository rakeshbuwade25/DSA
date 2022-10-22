#include<iostream>
using namespace std;

int main(){
	
	int n=5;
	
	for(int i=1;i<=n;i++){
		for(int j=i;j<n+3;j++){
			cout<<"* ";
		}
		for(int k=1;k<=i;k++){
			cout<<"* "<<i<<" ";
		}
		for(int j=i;j<=n+3;j++){
			cout<<"* ";
		}
		cout<<endl;
	}
	return 0;
}
