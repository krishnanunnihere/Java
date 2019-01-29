class datatypes
{
    public static void main(String args[])
    {
        int var;    //This declares an int variable
        double x;   //This declares a floating-point variable
        var=10;
        x=10.0;
        System.out.println("Original value of var:"+var);
        System.out.println("Original value of x:"+x);
        System.out.println();
        //Now divide both by 4
        var=var/4;
        x=x/4;
        System.out.println("Var after division:"+var);
        System.out.println("x after division:"+x);
    }
}