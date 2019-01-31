class sqrtFunction
{
    public static void main(String args[])
    {
        double x,y,z;
        x=3;
        y=4;
        z=Math.sqrt(x*x +y*y);
        System.out.println("Hypotenuse is "+z);
    }
}
/*Please note that whenever a method is called, a particular nomenclature is used where we first
specify the class that the particular method belongs to, e.g. Math.round( ); where Math is the class
name and round is the method name. If a particular method accepts parameters, these are placed in
brackets, e.g. Math.max(2.8, 12.9) – in this case it would return 12.9 as being the larger number. A useful method is the Math.random( ) which would return a random number ranging between 0.0
and 1.0.*/