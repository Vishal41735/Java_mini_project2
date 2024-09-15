package FindMyTain;

import Modifiers.Private_Modifier;

public class Platform {
  private int platformsNumber;
  private Train train;

    public Platform(int platformsNumber) {
        this.platformsNumber = platformsNumber;

    }

    public int getPlatformsNumber() {
        return platformsNumber;
    }

    public void setPlatformsNumber(int platformsNumber) {
        this.platformsNumber = platformsNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformsNumber=" + platformsNumber +
                ", train=" + train +
                '}';
    }
}
