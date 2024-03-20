package ro.ulbs.paradigme.lab3;

public class Triangle extends Form{
    private float base, height;

    public Triangle() {
        super();
    }

    public Triangle (float base, float height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public float getArea() {
        return base * height;
    }

    public String toString() {
        return "Triangle: "+super.toString()+"; base="+base+"  height="+height; //reutilizare toString din clasa parinte
    }

    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle t = (Triangle) obj;
            if (super.equals(t)) { //reutilizare equals din clasa parinte
                return t.base == t.base && t.height == t.height;
            }
        }
        return false;
    }
}
