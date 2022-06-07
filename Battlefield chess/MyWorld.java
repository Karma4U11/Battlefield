import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bar bar = new Bar(50, 600);
        addObject(bar,575,300);
        Bar bar2 = new Bar(50, 600);
        addObject(bar2,25,300);
        Bar bar3 = new Bar(600, 50);
        addObject(bar3,300,25);
        Bar bar4 = new Bar(600, 50);
        addObject(bar4,300,575);
    }
}
