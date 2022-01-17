import java.util.*;
public class suyashanagram 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String x=a.replace(" ","").toLowerCase();
        String y=b.replace(" ","").toLowerCase();
        char name[]=x.toCharArray();
        char name1[]=y.toCharArray();
        Arrays.sort(name);
        Arrays.sort(name1);
        if(Arrays.equals(name,name1))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }

    
}
