import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{

    /**
     * Instance variables (can be used anywhere below)
     */
    //primitive data type
    int frames;
    //Object data type... square brackets[] indicate an array (a list)
    String[] studentNames = {"Sarah", "Chelsea", "Jack", "Maxwell", "Gavin", 
            "Minah", "Brandon", "Jeewoo", "Peter", "Justy"};
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);

        //start tracking frames
        frames = 0;

        
    }
    /**
     * Act - called repeatedly to create animation
     */
    public void act()
    {
        //Every second say hello to the next person in the list
        if (frames % 60 == 0)
        {
            if (frames / 60 < 10)
            {
                showText("Hello " + studentNames[ frames / 60], 400, 170);
            }
        }
        //keep track of the frames
        frames += 1;

        //show current frame
        showText("" + frames, 100, 100);

    }
}