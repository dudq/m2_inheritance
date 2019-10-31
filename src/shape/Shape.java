package shape;

public class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
        this.color = "blue";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Boolean isFilled() {
        return filled;
    }


    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape with color of "
                + color
                + " and "
                + (this.isFilled() ? "filled" : " not filled");
    }
}
