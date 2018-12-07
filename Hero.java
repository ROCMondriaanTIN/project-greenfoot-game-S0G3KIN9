
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private boolean onGround = true;
    private static int scaleDecrease = 1;
    public static int level;
    public static int speed = 5;
    public static int jumpPower = 15;
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        //System.out.println(level);
        handleInput();
        SleutelOppakken();
        door();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        CharacterSwitch();
       
        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
                return;
            }
        }
        
        for (Actor Vuurbal : getIntersectingObjects(Vuurbal.class)) {
            if (Vuurbal != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
                return;
            }
        }
        
        for (Actor enemy : getIntersectingObjects(Springveer.class)) {
            if (enemy != null) {
                velocityY = -30;
                setLocation(getX() + 10, getY());
                return;
            }
        }
        for (Actor enemy : getIntersectingObjects(Springveer2.class)) {
            if (enemy != null) {
                velocityY = -45 ;
                setLocation(getX() + 10, getY());
                return;
            }
        }
        if(isTouching(Water.class)){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new GameOver());
            return;
        }
        if(isTouching(Lava.class)){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new GameOver());
            return;
        }
    }

    public boolean onGround(){
        if(isTouching(Tile.class) == true){
            return true;
        }
        return false;
    }

    public void door(){
    if(isTouching(DoorG.class))
    {
         if(GeleSleutel.geleSleutel >= 1)   
        {
            Greenfoot.setWorld(new LevelSelector());
            LevelSelector.maxLevel ++;
        }
    }
}

    public void handleInput() {
        if (Greenfoot.isKeyDown("space") /*&& onGround() == true*/) {
            velocityY = -jumpPower;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -speed;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = speed;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }

    public void CharacterSwitch(){
        if (isTouching(CharacterMuntPaars.class) == true){
            removeTouching(CharacterMuntPaars.class);
            setImage("p3_front.png");
            getImage().scale(getWidth() - scaleDecrease, getHeight() - scaleDecrease);
            speed = 4;
            jumpPower = 10;
        }
        
        
        if (isTouching(CharacterMuntBlauw.class) == true){
            removeTouching(CharacterMuntBlauw.class);
            setImage("p2_front.png");
            getImage().scale(getWidth() - scaleDecrease, getHeight() - scaleDecrease);
            speed = 6;
            jumpPower = 20;
        }
    }
    GeleSleutel gs = new GeleSleutel();
    public void SleutelOppakken(){
        if (isTouching(GeleSleutel.class) == true){
            removeTouching(GeleSleutel.class);
            GeleSleutel.geleSleutel++;
        }
    }    
    
}
