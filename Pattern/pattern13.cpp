#include<iostream>
using namespace std;

int main(){
	int n=5;
	
	for(int i=1;i<=n;i++){
		int x=i-1;
		for(int j=i;j<n;j++){
			cout<<"  ";
		}
		for(int k=1;k<=i;k++){
			x++;
			cout<<x<<" ";
		}
		for(int l=1;l<i;l++){
			x--;
			cout<<x<<" ";
		}
		cout<<endl;
	}
	return 0;
}
