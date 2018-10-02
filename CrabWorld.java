import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld(int gusanos)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        Tiempo tiempo=new Tiempo();
        this.addObject(tiempo,60,20);
        crab = new Crab();
        addObject(crab,99,75);
        langosta = new Langosta();
        addObject(langosta,213,324);
        prepare(gusanos);
    }
    
    public Langosta accede()
    {
        return langosta;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        for(int i=0;i<gusanos;i++)
        {
            Worm gusano=new Worm();
            addObject(gusano,Greenfoot.getRandomNumber(520)+20,Greenfoot.getRandomNumber(520)+20);
        }
    }
}
