package academy.belhard.entity;

public class Bag extends Container {
    protected int volume;

    public Bag(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String getType() {
        return "Сумка";
    }
}
