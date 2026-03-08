package javacity;

/*
 * Q20: Speaker component for the SmartRoom
 * Part of the COMPOSITION pattern — SmartRoom HAS-A Speaker
 */
public class Speaker {

    private boolean isPlaying;

    public Speaker() {
        this.isPlaying = false;
    }

    public void playMusic() {
        isPlaying = true;
        System.out.println("🔊 Speaker: Playing music! ♫♪");
    }

    public void stopMusic() {
        isPlaying = false;
        System.out.println("🔇 Speaker: Music stopped.");
    }

    public boolean isPlaying() { return isPlaying; }
}
