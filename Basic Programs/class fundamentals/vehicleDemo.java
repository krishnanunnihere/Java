class vehicleDemo
{
    public static void main(String args[])
    {
        vehicle minivan=new vehicle();
        int range;
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;
        range=minivan.fuelcap*minivan.mpg;
        System.out.println("Minivan can carry "+minivan.passengers+" with a range of "+range);
    }
}
class vehicle
{
    int passengers;
    int fuelcap;
    int mpg;
    
}