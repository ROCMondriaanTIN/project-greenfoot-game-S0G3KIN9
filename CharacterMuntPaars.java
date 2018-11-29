import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterMuntPaars extends Mover
{
    public CharacterMuntPaars() {
        super();
        setImage("hud_p3Alt.png");

    }

    public void act() 
    {
       applyVelocity();
    }    
}
