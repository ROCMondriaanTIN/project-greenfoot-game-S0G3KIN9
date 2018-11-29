import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeleSleutel extends Mover
{
    public GeleSleutel() {
        super();
        setImage("keyYellow.png");

    }

    public void act() 
    {
       applyVelocity();
    }    
}
