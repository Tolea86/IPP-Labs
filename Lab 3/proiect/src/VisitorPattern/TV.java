package VisitorPattern;

public class TV implements TvAttachment {
    TvAttachment[] tvAttachment;

    public TV() {
        tvAttachment = new TvAttachment[] {
                new VideoDevice(), new AudioDevice(), new GameConsole()
        };
    }

    @Override
    public void accept(TvComponents tvComponents) {
        for(int i = 0; i < tvAttachment.length; i++) {
            tvAttachment[i].accept(tvComponents);
        }
        tvComponents.attache(this);
    }
}
