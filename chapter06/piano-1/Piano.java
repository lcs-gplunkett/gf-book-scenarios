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
            
    //Track the white keys and notes
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", 
                           "l", ";", "'", "\\"};  
    String[] whiteNotes = {"3c", "3d", "3e", "3f", "3a", "3b", "4c", 
                            "4d", "4e", "4f", "4g",};
    
    
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
        // Bolean AND
        //statements in the conditional run ONLY when BOTH conditions are true
        //Boolean AND = &&
        //this block of code runs once per seconf until the end of the 
        //whiteKeys array
        if ((frames % 60 == 0) && (frames / 60 < 12))
        {
            //{
              //  showText("Hello " + studentNames[ frames / 60], 400, 170);
            //}
        }
        //keep track of the frames
        frames += 1;

        //show current frame
        showText("" + frames, 100, 100);

    }
}