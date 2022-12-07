import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author (Terry G) 
 * @version (Dec 7/22)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("HUNGRY ELEPHANT", 70);
    Label pressToStart = new Label("press space to start", 50);
    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        //addObject(pressToStart, getWidth()/2, (getHeight()/8)*5);
    }
    
    /**
     * Act to start the game.
     */
    public void act()
    {
        //starts game if space is pressed
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld game = new MyWorld();
            Greenfoot.setWorld(game);
        }
    }
}
