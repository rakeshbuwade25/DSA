#include<iostream>
using namespace std;

int main(){
	
	int n=4;
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			if(j==1){
				cout<<i;
			}else{
				cout<<"*"<<i;
			}
		}
		cout<<endl;
	}
	
	for(int a=n;a>=1;a--){
		for(int b=a;b>=1;b--){
			if(b==a)
				cout<<a;
			else
				cout<<"*"<<a;
		}
		cout<<endl;
	}
	
	return 0;
}
