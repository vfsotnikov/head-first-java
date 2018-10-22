package chapter02.Tape;

class TapeDeck {
    private boolean canRecord = false;

    public boolean isCanRecord() {
        return canRecord;
    }

    public void setCanRecord(boolean canRecord) {
        this.canRecord = canRecord;
    }

    void playTape() {
        System.out.println("Пленка проигрывается");
    }

    void recordType() {
        System.out.println("Пленка записывается");
    }
}

public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.setCanRecord(true);
        t.playTape();

        if (t.isCanRecord()){
            t.recordType();
        }
    }
}
