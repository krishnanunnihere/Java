class logicalOperators{
    public static void main(String args[])
    {
        int n,d;
        n=10;
        d=2;
        if(d!=0 && (n%d)==0)
        System.out.println (d+" is a factor of "+n);
        d=0; //Now set d to zero
        //Since d is zero,the second operand is not evaluated.
        if(d != 0 && (n%d)==0)
        System.out.println(d+" is a factor of "+n);
        /*Now try the same without  short-circuit operator.
        This will cause a divide-by-zero error.
        */
        if(d!=0 & (n%d)==0)
        System.out.println(d+"is a factor of "+n);

    }
}
/*Note if you try to execute the above program you will get an error (division by zero). To be able to
execute it, first comment the last two statements, compile and then execute.*/