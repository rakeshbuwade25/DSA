#include<iostream>
using namespace std;

int main(){
	int n=5;
	
	for(int i=1;i<=n;i++){
		for(int j=i;j<n;j++){
			cout<<"  ";
		}
		for(int k=1;k<=i;k++){
			cout<<k<<" ";
		}
		for(int l=i-1;l>=1;l--){
			cout<<l<<" ";
		}
		cout<<endl;
	}
	return 0;
}
