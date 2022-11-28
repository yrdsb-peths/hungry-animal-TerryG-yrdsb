import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The turtle. He is cool.
 * 
 * @author (Terry) 
 * @version (Nov 25/22)
 */
public class Turtle extends Actor
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        //removes apple if eaten
        removeTouching(Apple.class);
    }
}
