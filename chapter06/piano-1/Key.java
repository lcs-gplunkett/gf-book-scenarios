import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variable
     */
    //tracks whether the piano key dwon image has already been set or not. 
    //(isDown is a primitive data type - shows in red, type is lowercase)
    private boolean isDown;
    
    // Track what key is being played and what sound file to play
    //(key and sound are obejct data types - shows in black, type is capitalized)
    private String key;
    private String sound;
    /**
     * Create a new key.
     * Constructor
     */
    public Key(String keyName, String soundFile)
    {
        //Key begeins in the "up" position
        isDown = false;
        
        //initialize the key and sound instance variables
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //When the key image is NOT already showing "down
        //AND
        //the "g" key on the keyboard has been pressed
        // !isDown can also be isDown == false
        if (!isDown && Greenfoot.isKeyDown(key) )
        {
           setImage("white-key-down.png"); 
           isDown = true;
           play();
        }
        if (isDown == true && Greenfoot.isKeyDown(key) == false)
        {
            setImage("white-key.png");
            isDown = false;
        }
    }
    /**
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound(sound + ".wav");
    }
}

