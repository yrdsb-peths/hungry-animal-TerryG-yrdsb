import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * world with elephant
 * 
 * 
 * @author (Terry) 
 * @version (Nov 30/22)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreTracker;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        /**
         * having false here means the objects 
         * are able to pass through the boarders.
         */
        
        //Creates turtle object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        //creates the label
        scoreTracker = new Label(0, 80);
        addObject(scoreTracker, 25, 25);
        
        createApple();
        createBomb();
    }
    
    /**
     * This will end the game if the apple touches the bottom
     * prints GAME OVER on screen
     */
    
    public void gameOver()
    {
        List object = getObjects(null);
        removeObjects(object);
        Label gameOver = new Label("game over", 100);
        addObject(gameOver, 300, 200);
    }
    
    /**
     * This will allow the scoreTracker to increase when an apple is collected
     * this will also create another bomb every 10 points
     */
    public void increaseScore()
    {
        score++;
        scoreTracker.setValue(score);
        
        if(score % 10 == 0)
        {
            level += 1;
            createBomb();
        }
    }
    
    /***
     * makes new apples at random
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    public void createBomb()
    {
        Bomb bomb = new Bomb();
        bomb.setSpeed(level + 1);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bomb, x, y);
    }
}
