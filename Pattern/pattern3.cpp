#include<iostream>
using namespace std;

int main(){
	int n=6;
	
	for(int i=1;i<=n;i++){
		for(int j=i;j<=n;j++){
			if(i==1||i==n){
				cout<<"*";
			}else if(j==i||j==n){
				cout<<"*";
			}else{
				cout<<" ";
			}
			
		}
		cout<<endl;
	}
	return 0;
}
