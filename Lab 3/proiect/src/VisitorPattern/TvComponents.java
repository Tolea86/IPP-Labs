package VisitorPattern;

public interface TvComponents {

    void attache(AudioDevice audioDevice);
    void attache(VideoDevice videoDevice);
    void attache(GameConsole gameConsole);
    void attache(TV tv);

}
