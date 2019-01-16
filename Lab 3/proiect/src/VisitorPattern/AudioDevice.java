package VisitorPattern;

public class AudioDevice implements TvAttachment {
    @Override
    public void accept(TvComponents tvComponents) {
        tvComponents.attache(this);
    }
}
