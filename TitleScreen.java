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
    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject(titleLabel, getWidth()/2, getHeight()/8);
        prepare();
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("move using \u2190 and \u2192", 40);
        addObject(label,297,233);

        Label label2 = new Label("move to catch the apples", 40);
        addObject(label2,312,246);

        Label label3 = new Label("PRESS <SPACE> TO START", 45);
        addObject(label3,274,326);

        label.setLocation(getWidth()/2, 100);
        label2.setLocation(getWidth()/2,140);
        label3.setLocation(getWidth()/2,320);
        
        Elephant_image elephant_image = new Elephant_image();
        addObject(elephant_image,0,0);
        Apple_image apple_image = new Apple_image();
        addObject(apple_image,0,0);
        
        elephant_image.setLocation(216,227);
        apple_image.setLocation(349,243);
    }
}
