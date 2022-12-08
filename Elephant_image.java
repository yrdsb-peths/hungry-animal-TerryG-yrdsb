import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant image + idle
 * 
 * @author (Terry) 
 * @version (Dec 7/22)
 */
public class Elephant_image extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[8];
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - this code only gets run once when the object is made.
     */
    public Elephant_image()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i +".png");
            idle[i].scale(100, 100);
        }
        animationTimer.mark();
        //Initial elephant image
        setImage(idle[0]);
    }
    
    /**
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed()<125)
        {
            return;
        }
        animationTimer.mark();
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
        
    }
    
    public void act()
    {
        //Elephant idle animation
        animateElephant();
    }
}
