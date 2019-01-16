package VisitorPattern;

public class GameConsole implements TvAttachment {
    @Override
    public void accept(TvComponents tvComponents) {
        tvComponents.attache(this);
    }
}
