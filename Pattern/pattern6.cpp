#include<iostream>
using namespace std;

int main(){
	int n=6;
	
	for(int i=1;i<=n;i++){
		for(int j=i;j<n;j++){
			cout<<" ";
		}
		for(int k=1;k<=i;k++){
			if(i==1||i==n){
				cout<<"* ";
			}else if(k==1||k==i){
				cout<<"* ";
			}else{
				cout<<"  ";
			}
		}
		cout<<endl;
	}
	return 0;
}
