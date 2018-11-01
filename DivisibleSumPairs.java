import java.util.Scanner;

public class DivisibleSumPairs {

    
    static int divisibleSumPairs(int n, int k, int[] ar) {

        int count=0;
        for(int i=0; i<ar.length ;i++){
            for(int j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j])%k==0){
                    count++;
                }
            }
        }
        return count;

    }
    
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    
    int n=s.nextInt();
    int k=s.nextInt();
    int[] ar = new int[n];
    
    for(int i=0;i<a.length;i++){
      ar[i]=s.nextInt();
    }
    
    int y = divisibleSumPairs(n,k,ar);
    
    
    
  }
}
