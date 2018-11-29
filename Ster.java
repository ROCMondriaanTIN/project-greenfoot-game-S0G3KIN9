import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ster extends Mover
{
    public Ster() {
        super();
        setImage("star.png");

    }

    public void act() 
    {
       applyVelocity();
    }    
}
