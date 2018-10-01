import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Langosta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Langosta extends Actor
{
   private int pasos;
   
   public Langosta()
   {
       pasos=0;
   }
   /**
   * Act - do whatever the Langosta wants to do. This method is called whenever
    the 'Act' or 'Run' button gets pressed in the environment.
   */
   public void act() 
   {
        // Add your action code here.
        move(5);
        pasos++;
        if(pasos==5){
            turn(Greenfoot.getRandomNumber(180)-90);
            pasos=0;
        }
        if(isTouching(Crab.class)){
            removeTouching(Crab.class);
        }
        Actor Crab=getOneObjectAtOffset(0,0,Crab.class);
        if(Crab!=null){
            CrabWorld mundo=(CrabWorld)getWorld();
            getWorld().removeObject(Crab);
            mundo.objLife.disminuir();
            getWorld().addObject(new Crab(),99,75);
        }
   }    
}
