class break4
{
    public static void main(String[] args) {
        int i;
        for(i=1;i<4;i++)
        {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is "+i);
                        if(i==1) break one;
                        if(i==2) break two;
                        if(i==3) break three;
                        //the following statement is never executed.
                        System.out.println("won't print.");
                    }
                    System.out.println("After block three");
                }
                System.out.println("after block two");
            }
            System.out.println("after block one");
        }
        //the following statement executeson termination of the for loop.
        System.out.println("After for.");
    }
}