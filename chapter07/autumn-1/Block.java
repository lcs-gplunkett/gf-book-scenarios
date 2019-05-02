import greenfoot.*;
//get access to the list type from the java API
import java.util.List;
/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    // When Null is passed as an arguement to mouseCLicked, this method, mouseCLicked
    //returns true ANY TIME the mouse is clicked
    //if you pass a specific object reference, this method returns true ONLY when
    //that object is clicked
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            // 1. get an object reference
            World myWorld = getWorld();
            
            //2. get a list of object references to all the leaf objects in the world
            //TYPE, NAME,               CLASS
            List<Leaf> leaves = myWorld.getObjects(Leaf.class);
            
            // 3. automatically iterate (loop) through the list the correct
            //number of times.
            //with each iteration, get an object reference to the next Leaf
            //in the list
            //"for each leaf in the leaves list..."
            
            for (Leaf leaf : leaves)
            {
             //change the image on this particular leaf
             leaf.changeImage();
            }
        }
    }
    
}
