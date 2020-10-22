import java.util.Scanner;

class Function
{         
            void nrcf(int first ,int preceding, int c,int giveNum)
            {
                        for(int i=1;i<=giveNum-2;i++)
                        {
                                    c=first+preceding ;
                                    first=preceding ;
                                    preceding =c;
                        }
                        first=preceding =1;
                        System.out.println("nth value in the series using non recursive function is : "+c);
                       
            }
            void  rcf(int first,int preceding ,int c,int giveNum)
            {
                                   
                        if(giveNum-2>0)
                        {
                                    c=first+preceding ;
                                    first=preceding ;
                                    preceding =c;
                                    rcf(first,preceding ,c,giveNum-1);
                                    return;
                        }
                       
                        System.out.println("\nnth value in the series using recursive function is : "+c);
            }
}
           
public class FibonacciNUmber
{
            public static void main(String args[])
            {
                        Function f=new Function();
                        int giveNum,first=1,preceding=1,c=0;
                        Scanner scr=new Scanner(System.in);
                        System.out.println("\nEnter n value:  ");
                        giveNum=scr.nextInt();
                        f.nrcf(first,preceding ,c,giveNum);
                        f.rcf(first,preceding ,c,giveNum);
                       

            }
}
