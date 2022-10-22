#include<iostream>
using namespace std;

int main(){
	
	int n=5;
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			cout<<"*";
		}
		for(int k=i;k<n;k++){
			cout<<" ";
		}
		for(int l=i;l<n;l++){
			cout<<" ";
		}
		for(int m=1;m<=i;m++){
			cout<<"*";
		}
		cout<<endl;
	}
	
	for(int a=1;a<=n;a++){
		for(int b=a;b<=n;b++){
			cout<<"*";
		}
		for(int c=1;c<a;c++){
			cout<<" ";
		}
		for(int d=1;d<a;d++){
			cout<<" ";
		}
		for(int e=a;e<=n;e++){
			cout<<"*";
		}
		cout<<endl;
	}
	
	return 0;
}
