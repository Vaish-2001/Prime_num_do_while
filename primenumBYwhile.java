class primenumBYwhile
  {
   public static void main(String[]args)
    {
     int num=9;
     int i=2;
     int c=0;
     do
     {
      if(num%i==0)
       {
        c++;
       }
        i++;
     }while(i<num);
     
      if(c==0)
        {
          System.out.println("it is a primee num");
        }
      else 
        {
          System.out.println("it is not a prime num");
        }
    }
 }