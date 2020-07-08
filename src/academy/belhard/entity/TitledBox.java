package academy.belhard.entity;

public class TitledBox extends Box {
    private String title;

    public TitledBox(int height, int width, int length, String title) {
        super(height, width, length);
        this.title = title;
    }

    @Override
    public int getVolume() {
        int volume = super.getVolume();

        System.out.println("Calculated volume = " + volume);

        return volume;
    }

    public String getTitle() {
        return title;
    }
}
