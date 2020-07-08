package academy.belhard.entity;

import java.util.Objects;

public class ColoredBox extends Box {
    private BoxColor color;

    public ColoredBox(int height, int width, int length, BoxColor color) {
        super(height, width, length);
        this.color = color;
    }

    public BoxColor getColor() {
        return color;
    }

    @Override
    public String getType() {
        return "Цветная коробка";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColoredBox)) return false;
        ColoredBox box = (ColoredBox) o;
        return height == box.height &&
                width == box.width &&
                length == box.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
