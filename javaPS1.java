import java.util.Scanner;
public class javaPS1
{
    public static void main(String[] args) {
        

    
    int c = 0,f=0;
    char mk;
    char tmp='a';
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String vow="aeiouAEIOU";

    if (s.contains ("a"))        c++;
    if (s.contains ("e")) c++;
    if (s.contains ("i")) c++;
    if (s.contains ("o")) c++;
    if (s.contains ("u")) c++;

    if (s.contains ("A"))c++;
    if (s.contains ("E"))c++;
    if (s.contains ("I")) c++;
    if (s.contains ("O"))  c++;
    if (s.contains ("U"))    c++;
    if (c > 1)
      {
          char[] dup=s.toCharArray();
        for (int i = 0; i < s.length (); i++)
        {
       char a1= s.charAt(i);
        if(vow.contains(String.valueOf(a1)))
        {
            if(f==0)
            {
           tmp=s.charAt(i);
            f=1;
            }
       
            for(int j=i+1;j<(s.length()+i);j++)           //TATETOL
            {                                             //0123456
                char a2=s.charAt(j%s.length());
            if(vow.contains(String.valueOf(a2)))
            {
                mk=s.charAt(j%s.length());
               dup[j%s.length()]=tmp;
                tmp=mk;
               
                
                s=String.valueOf(dup);
                break;
            }
            }
            
        }
        }
        System.out.println(dup);
      }
      else
      System.out.println(s);
  }
}

