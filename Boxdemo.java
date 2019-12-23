class Box {
    double h,w,d;

     Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { 
        double v;
        v=h*w*d;
        return v;
    }
}

class Boxdemo{
    public static void main(String[] args) {
    Box b = new Box(4,3,8);
    System.out.println(b.volume());
    }
}
