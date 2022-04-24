package day51_inheritance.lyft;

public class LyftXL extends Lyft{

    public LyftXL(String driver){
        super(driver);
    }

    @Override
    public double calculateRate(int miles) {
        return super.calculateRate(miles) * 1.1;
    }
}
