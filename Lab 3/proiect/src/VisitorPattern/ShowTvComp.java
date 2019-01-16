package VisitorPattern;

public class ShowTvComp implements TvComponents {
    @Override
    public void attache(TV tv) {
        System.out.print(" is attached to TV.");
    }

    @Override
    public void attache(AudioDevice audioDevice) {
        System.out.print("an audio device, ");
    }

    @Override
    public void attache(VideoDevice videoDevice) {
        System.out.print("A video device, ");
    }

    @Override
    public void attache(GameConsole gameConsole) {
        System.out.print("a game console,");
    }
}
