package VisitorPattern;

public class VideoDevice implements TvAttachment {
    @Override
    public void accept(TvComponents tvComponents) {
        tvComponents.attache(this);
    }
}
