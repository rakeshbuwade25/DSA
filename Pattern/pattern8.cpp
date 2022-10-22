#include<iostream>
using namespace std;

int main(){
	int n=5;
	
	for(int i=1;i<=n;i++){
		for(int j=i;j<n;j++){
			cout<<" ";
		}
		for(int k=1;k<=i;k++){
			if(k==1||k==i){
				cout<<"* ";
			}else{
				cout<<"  ";
			}
			
		}
		cout<<endl;
	}
	
	for(int p=1;p<=n;p++){
		for(int q=1;q<p;q++){
			cout<<" ";
		}
		for(int r=p;r<=n;r++){
			if(r==p||r==n){
				cout<<"* ";
			}else{
				cout<<"  ";
			}
		}
		cout<<endl;
	}
	return 0;
}
