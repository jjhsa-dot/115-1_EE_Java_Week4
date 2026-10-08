/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


public class Ex1_1 {
	public static void main(String[] args) {
		int i, sum = 0;
		i = 1;
		while(i <= 10){
		    sum = sum + i;
		    i = i+1;
		}
		
		System.out.println("1+2+…+10=" + sum);
	}
}
