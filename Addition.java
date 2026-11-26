import.java.util.Scanner;
class Addition{
public static void main(string args[]){
Scanner sc = new Scanner(System.in);
keyboard
System.out.println("enter the size of arrays:");
int n = sc.nextInt();
int[][]A = new int[n][n];
int[][]B = new int[n][n];
int[][]C = new int[n][n];
System.out.println("enter the elements of matrix A:");
for(int i=0;i<n;i++){
for(int j=o;j<n;j++){
A[i][j] = sc.nextInt();
}
}
System.out.println("enter the elemnts of matrix B:");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
B[i][j] = sc.nextInt();
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
C[i][j] = A[i][j]+B[i][j];
}
}
System.out.println("matrix C(A+B):");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(C[i][j]+" ");
}
System.out.println();
}
}
}