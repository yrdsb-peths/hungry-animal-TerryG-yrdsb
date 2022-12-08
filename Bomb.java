import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Bomb here.
 * 
 * @author (Terry) 
 * @version (Dec 8/22)
 */
public class Bomb extends Actor
{
    int speed = 1;
    public void act()
    {   
        // Bomb falls
        setLocation(getX(), getY()+speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Elephant.class))
        {   
                world.gameOver();
                world.removeObject(this);
        }
            
        else if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.createBomb();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
