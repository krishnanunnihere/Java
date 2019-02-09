class breakErr
{
    public static void main(String args[])
    {
        one: for(int i=0;i<3;i++)
        {
            System.out.print("pass "+i+": ");
        }
        for(int j=0;j<100;j++)
        {
            if(j==10) break one; //This break cannotcontinue from the assigned label since it is not part of the same block
            System.out.print(j+" ");
        }
    }
}