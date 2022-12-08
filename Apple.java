import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (Terry) 
 * @version (Nov 30/22)
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Apple falls
        setLocation(getX(), getY()+speed);
        
        // This removes the apple and prints game over if it touches the ground
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
