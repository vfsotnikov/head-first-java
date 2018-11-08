package main.java.chapter4;

class XCopy{
    private int orig;

    public int getOrig() {
        return orig;
    }

    public void setOrig(int orig) {
        this.orig = orig;
    }

    public int go (int arg){
        return arg=arg*2;
    }
}

public class XCopyTestDrive {


    public static void main(String[] args) {
        XCopy x = new XCopy();
        x.setOrig(42);

        System.out.println(x.getOrig() +" "+ x.go(x.getOrig()));
    }
}
