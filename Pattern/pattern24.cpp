#include<iostream>
using namespace std;

int main(){
	
	int n=15;
	int num=n/2;
	int count=1;
	for(int i=1;i<num;i++){
		for(int j=1;j<=i;j++){
			if(count<=n){
			if(j==1){
				cout<<count;	
			}else{
				cout<<"*"<<count;
			}
			
			count++;
		}
	}
		cout<<endl;
	}
	
	int count1=n;
	for(int i=n/2-1;i>=1;i--){
		count1=count1-i;
		for(int j=1;j<=i;j++){
			cout<<count1+j;
		}
		cout<<endl;
	}
	return 0;
}
