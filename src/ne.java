import java.util.Scanner;
public class ne {





        public static void main(String[]args) {
            Scanner input=new Scanner(System.in);
            int[] a=new int[5];
            System.out.print("Enter the orders of number");
            for(int y=0;y<a.length;y++){
                a[y]=input.nextInt();}
            for (int j=1;j<a.length;j++){
                int key=a[j];
                int i=j-1;
                while (i>=0&&a[i]>key){
                    a[i+1]=a[i];
                    i=i-1;
                }
                a[i+1]=key;}
            System.out.print("sorted is:");
            for(int x=1;x<a.length;x++){
                System.out.print(a[x]+" ");
                System.out.println();
            }}}



