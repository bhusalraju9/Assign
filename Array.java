

import java.util.Scanner;

public class Array {




public static void main(String[] args) {

System.out.println("Please Enter Name (6 Name only)");

Scanner scan = new Scanner(System.in);

String a[]= new String [5];	
String b[]= new String [5];
String c[]= new String [5];


for(int i=0; i<a.length;i++){

a[i]=scan.next();

if(a[i].length()%2==0){

b[i]=a[i];

}
else{
c[i]=a[i];
}

}

for(int j=0; j<a.length;j++){	
System.out.println("Input Names ="+ a[j]);
}

System.out.println("-------------------------------------------");	
for(int j=0; j<b.length;j++){

System.out.println("Even names "+  b[j]);

}

System.out.println("-------------------------------------------");	
for(int j=0; j<c.length;j++){


System.out.println("Odd  names "+  c[j]);

}


}

}


