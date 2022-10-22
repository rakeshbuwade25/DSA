#include<iostream>
using namespace std;

int main(){
	
	int n=4;
	int count=n-2;
	
	for(int i=1;i<=n;i++){
		count++;
		for(int j=1;j<=i;j++){
			cout<<count<<" ";
		}
		cout<<endl;
	}
	
	for(int x=1;x<n;x++){
		count--;
		for(int y=x;y<n;y++){
			cout<<count<<" ";
		}
		cout<<endl;
	}
	return 0;
}
