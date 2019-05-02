import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{ /**
     * Instance variables / objects
     * (can be used by any method in this class)
     */
    // Keys that will activate the white piano keys
    private String[] whiteKeys =
        { "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\" };

    // Sounds that correspond to the white keys
    private  String[] whiteNotes =
        { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };

    // Keys that will activate to the black keys
    private String[] blackKeys =
        { "w", "e", "", "t", "y", "u", "", "o", "p", "", "]", ""}; 

    // Sounds that correspond to the black keys
    private String[] blackNotes =
        { "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#", "" }; 

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);

        // Make the white keys
        for (int index = 0; index < whiteKeys.length; index += 1)
        {
            // Create a new Key object
            Key newKey = new Key(whiteKeys[index], whiteNotes[index], true);

            // Add the key object to the scenario
            addObject(newKey, 54 + 63 * index, 140);
        }

        // Draw black piano keys (this is done now so it is on top of the white ones.
        for (int index = 0; index < blackKeys.length; index += 1)
        {
            // Only add a black key if there is a keyboard key for it set in the blackKeys array
            if (blackKeys[index] != "")
            {
                // Create a new black Key
                Key newKey = new Key(blackKeys[index], blackNotes[index], false);

                // Add the key object to the scenario
                addObject(newKey, 85 + 63 * index, 86);
            }
        }
    }

}