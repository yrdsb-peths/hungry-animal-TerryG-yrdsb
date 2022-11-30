import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Terry) 
 * @version (Nov 30/22)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreTracker;
    /**
     * Constructor for objects of class MyWorld.
     * 
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
        Turtle turtle = new Turtle();
        addObject(turtle, 300, 300);
        //creates the label
        scoreTracker = new Label(0, 80);
        addObject(scoreTracker, 25, 25);
        
        createApple();
    }
    
    /**
     * This will end the game if the pple isn't collected
     */
    
    public void gameOver()
    {
        Label gameOver = new Label("game over", 100);
        addObject(gameOver, 300, 200);
    }
    
    /**
     * This will allow the scoreTracker to increase when an apple is collected
     */
    public void increaseScore()
    {
        score++;
        scoreTracker.setValue(score);
    }
    
    /***
     * makes new apples at random
     */
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
