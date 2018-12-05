import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelector extends World
{
    BLevel1 lvl1 = new BLevel1();
    BLevel2 lvl2 = new BLevel2();
    BLevel3 lvl3 = new BLevel3();
    BLevel4 lvl4 = new BLevel4();
    DiaLevel1 Dlvl1 = new DiaLevel1();

    public void act(){
        if(Greenfoot.mouseClicked(lvl1)){
        Greenfoot.setWorld(new Level1());    
        }
        if(Greenfoot.mouseClicked(lvl2)){
        Greenfoot.setWorld(new Level2());    
        }
        if(Greenfoot.mouseClicked(lvl3)){
        Greenfoot.setWorld(new Level3());    
        }
        if(Greenfoot.mouseClicked(lvl4)){
            
        }
        if(Greenfoot.mouseClicked(Dlvl1)){
            
        }
    }
    public LevelSelector()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        setBackground("LevelSelector.png");
        addObject(lvl1, 115, 600);
        addObject(lvl2, 315, 600);
        addObject(lvl3, 115, 700);
        addObject(lvl4, 315, 700);
        addObject(Dlvl1, 700, 600);
    }
}
