class guess4
{
    public static void main(String args[])
    
        throws java.io.IOException
        {
            char ch,answer='k';
            do
            {
                System.out.println("I'm thinking of a letter between a and z.");
                System.out.print("Can you guess it:");
                do{
                    ch=(char) System.in.read();

                }while(ch=='\n' | ch=='\r');
                if(ch==answer)
                {
                    System.out.println("**Right**");
                }
                else
                {
                    System.out.print("...Sorry you are ");
                    if(ch<answer) System.out.println("too low.");
                    else System.out.println(" too high.");
                    System.out.println("Try again!!!\n");
                }
            }while(answer!=ch);
        }
    
}