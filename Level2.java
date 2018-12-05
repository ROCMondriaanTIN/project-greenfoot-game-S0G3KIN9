import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private CollisionEngine ce;
    public void act(){
        super.act();
        ce.update();
    }
    public Level2()
    {    
        super(1000, 800, 1, false);
        this.setBackground("rock_4.png");

        int[][] map = {
                {29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,198,-1,-1,-1,-1,198,-1,-1,-1,-1,198,-1,-1,-1,-1,198,-1,-1,-1,-1,198,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,68,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,236,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,29,29,29,-1,-1,-1,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,29,29,-1,-1,-1,29,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,112,112,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,195,-1,-1,195,195,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,114,114,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,195,-1,-1,195,195,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,114,114,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,195,-1,-1,195,195,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,114,114,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,195,-1,-1,195,195,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,-1,-1,-1,-1,114,114,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,195,-1,-1,195,195,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,-1,-1,14,-1,-1,-1,114,114,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,195,-1,-1,195,195,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,29},
{29,46,46,46,-1,-1,-1,1,1,-1,-1,-1,46,46,46,46,-1,-1,-1,195,-1,-1,29,29,-1,-1,-1,46,46,46,46,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,29,-1,-1,195,195,-1,-1,-1,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,195,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,236,-1,-1,29},
{29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,29},
{29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,29},
{29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,236,-1,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,29,29,29,49,49,49,49,49,49,49,49,29,29,29,29,29,29,29,29,-1,-1,-1,29,29,29,29,29,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,29},
{29,29,29,29,102,102,102,102,102,102,102,102,29,29,29,29,102,102,102,102,-1,-1,-1,102,102,102,102,29,29,-1,-1,-1,-1,236,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29},
{29,29,29,29,100,100,100,100,100,100,100,100,29,29,29,29,100,100,100,100,-1,236,-1,100,100,100,100,29,29,29,29,29,29,29,100,100,100,100,100,100,100,100,100,100,29,-1,236,29},
{29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29},


            };

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 150, 1300);
        addObject(new Enemy("flyFly2.png"), 1550, 1200);
        addObject(new Enemy("blockerSad.png"), 850, 1235);
        addObject(new Enemy("blockerSad.png"), 1200, 1650);
        addObject(new CharacterMuntBlauw(), 1400, 1650);
        addObject(new GeleSleutel(), 1850, 1750);
        addObject(new Ster(), 1000, 1650);
        

        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
}
