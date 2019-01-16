package StrategyPattern;

public class TVPost2 implements Strategy {
    @Override
    public String TvShow(int buttonNumber) {
        return "\tPROTv";
    }
}
