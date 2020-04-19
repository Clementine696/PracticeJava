package primecount;
import java.util.Scanner;
public class PrimeCount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i,j,count;
        int x = scan.nextInt();
        for(i=2;i<=x;i++)
        {
            count=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==1)
                System.out.printf("%d ",i);
        }
    }
//ยะฮู้ๆๆๆๆ
}
