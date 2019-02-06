//Demonstrate the while loop
class whileDemo
{
    public static void main(String args[])
    {
        char ch;
        //Print the alphabet using a while loop
        ch='a';
        while(ch<='z')
        {
            System.out.print(ch);
            System.out.print(" ");
            ch++;
        }
    }
}