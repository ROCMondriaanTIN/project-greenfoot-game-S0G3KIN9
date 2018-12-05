import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterMuntBlauw extends Mover
{
    public CharacterMuntBlauw() {
        super();
        setImage("hud_p2Alt.png");

    }

    public void act() 
    {
       applyVelocity();
    }    
}
