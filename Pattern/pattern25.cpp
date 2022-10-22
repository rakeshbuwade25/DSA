#include<iostream>
using namespace std;

int main(){
	
	int n=4;
	
	for(int i=1;i<=n;i++){
		for(int j=0;j<i;j++){
			if(j==0&&j>0)
				cout<<"*";
			else
				cout<<j;
		}
		for(int k=i-2;k>=1;k--){
			
			cout<<k;
		}
		cout<<"*";
		cout<<endl;
	}
	return 0;
}
