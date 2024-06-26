package shapes;

public class Rectangle extends Shape
{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width)
    {
        this.setHeight(height);
        this.setWidth(width);
        this.calculatePerimeter();
        this.calculateArea();
    }

    @Override
    protected void calculatePerimeter()
    {
        setPerimeter(this.height * 2 + this.width * 2);
    }

    @Override
    protected void calculateArea()
    {
        setArea(this.height * this.width);
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
