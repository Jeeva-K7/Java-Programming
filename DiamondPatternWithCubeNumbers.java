import java.util.*;
public class CosmicStar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int req = scan.nextInt();
        int a = req;

        int n = req + (req-1);
        int b = 1;
        
        //Invalid Input
        if(req<=0){
            System.out.println("Invalid input");
            return;
        }
        //First Half content
        for(int i=1; i<=req; i++){
            
            for(int s=b; s<req; s++){
                System.out.print(" ");
            }
            b++;
            
            for(int j=1; j<=i; j++){
                System.out.printf("%d ",(int)Math.pow(j,3));
            }
            System.out.println();
        }
        b=1;
        //Second half content
        for(int i=1; i<req; i++){
            
            for(int s=b; s<=i; s++){
                System.out.print(" ");
            }
        
            
            for(int j=1; j<a; j++){
                System.out.printf("%d ",(int)Math.pow(j,3));
            }
        
            
            System.out.println();
            a--;
        }
        
        
    }
}
