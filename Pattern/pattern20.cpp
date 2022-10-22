#include<iostream>
using namespace std;

int main(){
	
	int n=5;
	
	for(int i=1;i<=n;i++){
		for(int a=i;a<=n;a++){
			cout<<"*";
		}
		for(int b=1;b<i;b++){
			cout<<" ";
		}
		for(int c=1;c<i;c++){
			cout<<" ";
		}
		for(int d=i;d<=n;d++){
			cout<<"*";
		}
		cout<<endl;
	}
	
	for(int j=1;j<=n;j++){
		for(int w=1;w<=j;w++){
			cout<<"*";
		}
		for(int x=j;x<n;x++){
			cout<<" ";
		}
		for(int y=j;y<n;y++){
			cout<<" ";
		}
		for(int z=1;z<=j;z++){
			cout<<"*";
		}
		cout<<endl;
	}
	return 0;
}
