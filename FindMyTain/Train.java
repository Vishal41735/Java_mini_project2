package FindMyTain;

public class Train {
    private  String trainId;
    private  String trainName;
    private  String type;

    public Train(String trainId, String trainNme, String type) {
        this.trainId = trainId;
       this.trainName = trainNme;
         this.type = type;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        trainId = trainId;
    }

    public String getTrainNme() {
        return trainName;
    }

    public void setTrainNme(String trainNme) {
        trainNme = trainNme;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "TrainId='" + trainId + '\'' +
                ", TrainNme='" + trainName + '\'' +
                ", Type='" + type + '\'' +
                '}';
    }
}
