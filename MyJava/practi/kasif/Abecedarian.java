class Abecedarian
{
    public void display(String s)
    {
        int l=s.length();
        boolean b=true;
        for(int i=0;i<l-1;i++)
        {
            int k=(int)s.charAt(i);
            int m=(int)s.charAt(i+1);
            if(m<k)
            {
                b=false;
                break;
            }
        }
            if(b==true)
            {
                System.out.println("word is abecedarian");
            }
        }
    
}
              