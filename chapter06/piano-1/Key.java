import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variable
     */
    //tracks whether the piano key dwon image has already been set or not. 
    private boolean isDown;
    /**
     * Create a new key.
     * Constructor
     */
    public Key()
    {
        //Key begeins in the "up" position
        isDown = false;
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
        if (!isDown && Greenfoot.isKeyDown("g") )
        {
           setImage("white-key-down.png"); 
           isDown = true;
        }
        if (isDown == true && Greenfoot.isKeyDown("g") == false)
        {
            setImage("white-key.png");
            isDown = false;
        }
    }
}

