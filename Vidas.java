import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas extends Actor
{
    private Counter contador;
    
    public Vidas()
    {
        contador=new Counter("Vidas: ");
        contador.setValue(3);
    }
    
    protected void addedToWorld(World world)
    {
        world.addObject(contador,80,20);
    }
    
    /**
     * Act - do whatever the Vidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(contador.getValue()==0)
        {
            Greenfoot.stop(); //para el juego
        }
    }    
}
