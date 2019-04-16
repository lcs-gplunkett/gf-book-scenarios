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
    String[] whiteNotes = {"3c", "3d", "3e", "3f","3g", "3a", "3b", "4c", 
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
        //whiteKeys.length automatically returns the correct number of values
        //in the array (so that we won't run past the end)
        int position = frames / 60;
        if ((frames % 60 == 0) && (position < whiteKeys.length))
        {
            //Assemble the piano by creating each key one by one
            Key anotherKey = new Key(whiteKeys[position], whiteNotes[position]);                
            
            //This line actually adds the object to the Piano world
            addObject(anotherKey, 54 + position * 63 , 140);
            
            //Only show a messahe when we are in the bounds of the array
            //showText("Array index is: " + position, 400, 250);
            
            
            
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