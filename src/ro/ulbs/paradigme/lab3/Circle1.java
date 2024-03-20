package ro.ulbs.paradigme.lab3;

public class Circle1 extends Form{
    private float radius;

    public Circle1() {
        super();
    }

    public Circle1(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    public float getArea() {
        return (float)(Math.PI * radius * radius);
    }

    public String toString() {
        return "Circle: "+super.toString()+"; radius="+radius;
    }

}
