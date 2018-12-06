
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
            tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 1:
            tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 2:
            tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 3:
            tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 4:
            tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 5:
            tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.getImage().mirrorVertically();
            tile.isSolid = true;
            break;
            case 6:
            tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 7:
            tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 8:
            tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 9:
            tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 10:
            tile = new Water("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 11:
            tile = new Water("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 12:
            tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 13:
            tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 14:
            tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 27:
            tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.getImage().mirrorVertically();
            tile.isSolid = true;
            break;
            case 29:
            tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;
            case 46:
            tile = new Tile("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;    
            case 48:
            tile = new Tile("dirt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;
            case 49:
            tile = new Tile("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            break;   
            case 51:
            tile = new Tile("dirtCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;  
            case 53:
            tile = new Tile("dirtCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;         
            case 68:
            tile = new DoorG("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 75:
            tile = new Tile("grassCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            break;
            case 82:
            tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;  
            case 85:
            tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;    
            case 86:
            tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;    
            case 87:
            tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;
            case 88:
            tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            tile.isSolid = true;
            break;
            case 198:
            tile = new Tile("cloud3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break; 
            case 100:
            tile = new Lava("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            break;    
            case 102:
            tile = new Tile("liquidLavaTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 103:
            tile = new Water("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            break;
            case 105:
            tile = new Water("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT); 
            break;
            case 112:
            tile = new Tile("ropeAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;    
            case 114:
            tile = new Tile("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 195:
            tile = new Tile("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;    
            case 215:
            tile = new Tile("gemBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;     
            case 223:
            tile = new Tile("keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break; 
            case 236:
            tile = new Springveer("springboardUp.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 211:
            tile = new Springveer2("springboardUp.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 237:
            tile = new Tile("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;  
            case 245:
            tile = new Tile("blockerSad.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 289:
            tile = new Tile("hud_p2Alt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;    
            case 291:
            tile = new Tile("hud_p3Alt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break; 
            case 24:
            tile = new DoorG("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break; 
            case 69:
            tile = new DoorG("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break; 
            case 690:
            tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;    
            default:
            tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
        }
        return tile;
    }
}
