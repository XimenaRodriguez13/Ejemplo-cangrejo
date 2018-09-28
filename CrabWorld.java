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
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,99,75);
        Worm worm = new Worm();
        addObject(worm,24,258);
        Worm worm2 = new Worm();
        addObject(worm2,375,145);
        Worm worm3 = new Worm();
        addObject(worm3,488,377);
        Worm worm4 = new Worm();
        addObject(worm4,192,288);
        Worm worm5 = new Worm();
        addObject(worm5,453,257);
        Langosta langosta = new Langosta();
        addObject(langosta,308,347);
        Worm worm6 = new Worm();
        addObject(worm6,110,437);
        Worm worm7 = new Worm();
        addObject(worm7,376,473);
        Worm worm8 = new Worm();
        addObject(worm8,195,185);
        Worm worm9 = new Worm();
        addObject(worm9,351,276);
        Worm worm10 = new Worm();
        addObject(worm10,278,416);
        Worm worm11 = new Worm();
        addObject(worm11,49,378);
        Worm worm12 = new Worm();
        addObject(worm12,197,498);
        Worm worm13 = new Worm();
        addObject(worm13,499,484);
        Worm worm14 = new Worm();
        addObject(worm14,471,77);
        Worm worm15 = new Worm();
        addObject(worm15,228,46);
        Worm worm16 = new Worm();
        addObject(worm16,493,185);
        Worm worm17 = new Worm();
        addObject(worm17,51,159);
        Worm worm18 = new Worm();
        addObject(worm18,357,46);
        Worm worm19 = new Worm();
        addObject(worm19,46,520);
    }
}
