package academy.belhard.entity;

public class ColoredBox extends Box {
    private BoxColor color;

    public ColoredBox(int height, int width, int length, BoxColor color) {
        super(height, width, length);
        this.color = color;
    }

    public BoxColor getColor() {
        return color;
    }
}
