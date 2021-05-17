public class WaterBottle {

    // A water bottle has a volume property - Done
    // Volume should start at 100 - Will not declare in class as we may want to change properties
    // Add a drink function that takes 10 from the volume each time it is called
    // Create an empty function that brings the volume down to 0
    // Create a fill function that fills the volume back to 100

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        return volume - 10;
    }

    public int empty() {
        volume = 0;
        return volume;
    }

    public int fill() {
        volume = 100;
        return volume;
    }
}
