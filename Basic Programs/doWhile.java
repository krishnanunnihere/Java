class doWhile
{
    public static void main(String args[])
    throws java.io.IOException
    {
        char ch;
        do
        {
            System.out.print("Press a key followed by enter:");
            ch=(char) System.in.read();
        }while(ch!='q');
    }
}