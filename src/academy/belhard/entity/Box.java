package academy.belhard.entity;

import academy.belhard.util.BoxCounterUtil;

import java.util.Objects;

public class Box extends Container {
    protected int height;
    protected int width;
    protected int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;

        BoxCounterUtil.plusBox();
    }

    @Override
    public int getVolume() {
        return height * width * length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return height == box.height &&
                width == box.width &&
                length == box.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, length);
    }

    @Override
    public String toString() {
        return "Box{" +
                "height: " + height +
                ", width: " + width +
                ", length: " + length +
                '}';
    }
}
