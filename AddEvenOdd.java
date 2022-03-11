class AddEvenOdd{
public static void main(String[]args){
int n = 40;
System.out.println("Numbers between 20 to 40");
int sumeven =0;
int sumodd = 0;
for(int i=20;i<=n;i++){
	if(i%2==0){
		sumeven = sumeven + i;
	}
	else{
		sumodd = sumodd + i;
	}
} 
System.out.println("Addition of Even numbers="+sumeven);
System.out.println("Addition of Odd numbers="+sumodd);
}
}