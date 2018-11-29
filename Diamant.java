import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamant extends Mover
{
    public Diamant() {
        super();
        setImage("gemBlue.png");

    }

    public void act() 
    {
       applyVelocity();
    }    
}
