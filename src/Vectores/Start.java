package Vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
	
char frase[]= new char[10];

frase[5]= 'h';
frase[6]= 'o';
frase[7]= 'l';
frase[8]= 'a';
frase[9]= '!';


for(int i=0;i<frase.length;i++) {
	//System.out.println("pos"+i+"="+frase[1]);
	System.out.print(frase[1]);
}
System.out.println("");

for(int i=frase.length-1;i>=0;i--) {
System.out.println(frase[i]);
}

for(char letra:frase) {
	System.out.println("bucle avanzado-"+letra);
}
	
	
	}

}
