class scopeOfVariable
{
    public static void main(String args[])
    {
        int x;  //known to all code within main
        x=10;
        if(x==10)
        {
            //start new scope
            int y=20; //known only to this block
            //both x and y  known here
            System.out.println("x and y: "+x+" "+y);
            x=y*2;

        }
        //y=100; //error!! not known here
        //x is still known here.
        System.out.println("x is "+x);
    }
}
/*If we had to remove the comment marks from the line, y = 100; we would get an error during
compilation as y is not known since it only exists within the block of code following the ‘if’
statement.*/