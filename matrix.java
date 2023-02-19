import java.util.*;
class Matrix{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[][],b[][],res[][];
    int r1,c1,r2,c2;
    System.out.println("enter order of mat1");
    r1=sc.nextInt();
    c1=sc.nextInt();
    System.out.println("enter order of mat2");
    r2=sc.nextInt();
    c2=sc.nextInt();
    if(c2==r2){
        System.out.println("enter mat1");
        a=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
    

    System.out.println("enter mat2");
    b=new int[r2][c2];
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            b[i][j]=sc.nextInt();
        }
    }

    System.out.println("resultant matrix is");
    res=new int[r1][c2];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            for(int k=0;k<c1;i++){
                res[i][j]=res[i][j]+(a[i][k]*b[k][j]);
            }
        }
    }

    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            System.out.println(res[i][j]);
            System.out.print("\t");
        }
        System.out.println("\n");
    }
    }
    else{
        System.out.println("multiplication not possible");
    }
}
}