import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number elements: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("\nEnter interger numbers:");
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
