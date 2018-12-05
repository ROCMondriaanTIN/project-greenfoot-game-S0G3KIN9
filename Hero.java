
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

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();

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
        if(isTouching(Water.class)){
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(Lava.class)){
            getWorld().removeObject(this);
            return;
        }
    }

    public boolean onGround(){
        if(isTouching(Tile.class) == true){
            return true;
        }
        return false;
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("space") /*&& onGround() == true*/) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 5;
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
        }
        if (isTouching(CharacterMuntBlauw.class) == true){
        removeTouching(CharacterMuntBlauw.class);
        setImage("p2_front.png");
        getImage().scale(getWidth() - scaleDecrease, getHeight() - scaleDecrease);
    }
    }
}
