class typeCast{ //long to double automatic conversion
    public static void main(String args[])
    {
        long L;
        double D;
        L=100123285L;
        D=L;    //L=D is impossible
        System.out.println("L and D: "+ L+" "+D);
    }
}