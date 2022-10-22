#include<iostream>
using namespace std;

int main(){
	int n=5;
	
	for(int i=1;i<=n;i++){
		for(int j=i;j<n;j++){
			cout<<" ";
		}
		for(int k=1;k<=i;k++){
			if(i==1||i==n||k==1||k==i){
				cout<<k<<" ";
			}else{
				cout<<"  ";
			}
		}
		cout<<endl;
	}
	return 0;
}
