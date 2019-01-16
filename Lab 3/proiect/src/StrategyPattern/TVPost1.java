package StrategyPattern;

public class TVPost1 implements Strategy {
    @Override
    public String TvShow(int buttonNumber) {
        return "\tJurnalTv";
    }
}
