    import java.util.*;
public class reverse3{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        int n=sc.nextInt();
        int temp=0;
        int rev=0;
        while(n>0)
        {
            int dig=n%10;
            rev=rev*10+dig;
            n/=10;
        }
    System.out.println(rev);
    if(temp==rev) System.out.println("Palindraome");
    else System.out.println("not palindrome");
    }
}
    

}
