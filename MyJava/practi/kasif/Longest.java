import java.util.*;
class Longest
{
  //method to display longest word
  public void word()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String s=sc.nextLine();
      s=s+" ";
      int l=s.length();
      
      int begin=0;
      int end;
      int max=0;
      String lw="";
      String word="";
      while(begin<l)
      {
          end=s.indexOf(' ',begin);
          word=s.substring(begin,end);
          int k=word.length();
          if(k>max)
          {
              max=k;
              lw=word;
            }
            
            begin=end+1;
        }
        System.out.println("the longest word="+lw);
    }
}

            
              
      