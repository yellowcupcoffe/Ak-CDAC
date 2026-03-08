package javacity;

/*
 * ========== PHASE 5: SMART ROOM (Q18, Q19, Q20) ==========
 * 
 * This is the COMPOSITION class. It doesn't EXTEND LightBulb or Speaker.
 * Instead, it CONTAINS them as private fields.
 * 
 * Q18: Declare private LightBulb roomLight
 * Q19: Initialize in constructor, create pressWallSwitch()
 * Q20: Add Speaker, create partyMode()
 * 
 * REAL WORLD ANALOGY:
 *   Your room has a switch on the wall. You press it → the light toggles.
 *   You don't BECOME the light. You CONTROL the light.
 *   That's composition: SmartRoom CONTROLS its components.
 */
public class SmartRoom {

    // Q18: The Room CONTAINS (HAS-A) these components
    private LightBulb roomLight;
    private Speaker roomSpeaker;
    private String roomName;

    // Q19: Initialize components in the constructor
    public SmartRoom(String roomName) {
        this.roomName = roomName;
        this.roomLight = new LightBulb();   // Room creates its own light
        this.roomSpeaker = new Speaker();   // Room creates its own speaker
        System.out.println("🏠 SmartRoom '" + roomName + "' is ready!");
    }

    // Q19: Pressing the wall switch delegates to the LightBulb
    // SmartRoom doesn't know HOW the light works internally.
    // It just tells the light: "toggle yourself"
    public void pressWallSwitch() {
        System.out.println("[" + roomName + "] Wall switch pressed!");
        roomLight.toggle();
    }

    // Q20: Party mode — turns on light AND plays music
    public void partyMode() {
        System.out.println("🎉 [" + roomName + "] PARTY MODE ACTIVATED!");
        if (!roomLight.isOn()) {
            roomLight.toggle(); // Turn on if not already on
        }
        roomSpeaker.playMusic();
    }
}
