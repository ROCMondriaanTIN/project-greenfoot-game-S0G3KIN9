import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(1000, 800, 1);
        setBackground("MainMenu.png");
        Greenfoot.start();
    }

   
    public void act()
    {
        if (Greenfoot.isKeyDown ("enter")) Greenfoot.setWorld(new LevelSelector());
    }
}
