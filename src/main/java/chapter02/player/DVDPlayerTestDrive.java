package chapter02.player;

class DVDPlayer {
    private boolean canRecord = false;

    public boolean isCanRecord() {
        return canRecord;
    }

    public void setCanRecord(boolean canRecord) {
        this.canRecord = canRecord;
    }

    public void playDVD (){
        System.out.println("DVD проигрывается");
    }

    public void recordDVD(){
        System.out.println("Идет запись DVD");
    }
}

public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.setCanRecord(true);
        d.playDVD();

        if (d.isCanRecord()){
            d.recordDVD();
        }
    }
}
