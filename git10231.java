import java.util.Scanner;
public class git10231{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int n = scn.nextInt();
        for(int i=3; i<=n ;i+=3){
        
        sum=sum+i;
        System.out.println(sum);
        }
    }
}