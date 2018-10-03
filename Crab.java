import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private Counter vidas;
    
    public Crab()
    {
        vidas=new Counter("Vidas: ");
        vidas.setValue(3);
    }
    
    protected void addedToWorld(World world)
    {
        world.addObject(vidas,500,20);
    }
    
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.move(4);
        if(Greenfoot.isKeyDown("right")){
            turn(3);
        }
        if(Greenfoot.isKeyDown("left")){
            turn(-3);
        }
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
            //todos los sonidos los busca en la carpeta sound
            Greenfoot.playSound("eating.wav");
        }
        if(isTouching(Langosta.class)){
            vidas.setValue(vidas.getValue() -1);
            setLocation(250,250);
            //getWorld().showText("Perdiste una vida",200,200);
            Label perdiste=new Label("Perdiste una vida",30);
            getWorld().addObject(perdiste,250,250);
            Greenfoot.delay(50);
            getWorld().removeObject(perdiste);
            getWorldOfType(CrabWorld.class).accede().setLocation(250,500);
        }
    }    
}
