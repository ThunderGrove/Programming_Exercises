package Chapter9.Exercise1;

public class Rectangle{
    private static double width=1,height=1;

    public void Rectangle(){
        this.width=1;
        this.height=1;
    }

    public void Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return (this.width*2)+(this.height*2);
    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.Rectangle();
        System.out.println("Area is "+r.getArea()+"and perimeter is "+r.getPerimeter());

        r.Rectangle(2.1,2.2);
        System.out.println("Area is "+r.getArea()+" and perimeter is "+r.getPerimeter());

        r.Rectangle(4,40);
        System.out.println("Area is "+r.getArea()+" and perimeter is "+r.getPerimeter());

        r.Rectangle(3.5,35.9);
        System.out.println("Area is "+r.getArea()+" and perimeter is "+r.getPerimeter());

        r.Rectangle(45,5.4);
        System.out.println("Area is "+r.getArea()+" and perimeter is "+r.getPerimeter());

        r.Rectangle(1.123456789,21.12);
        System.out.println("Area is "+r.getArea()+" and perimeter is "+r.getPerimeter());
    }
}
