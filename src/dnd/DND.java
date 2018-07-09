/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd;

/**
 *
 * @author Joseph
 */
public class DND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rambo = "";
        if (rambo.equalsIgnoreCase("stength"))
            ;
    }
    public static String race()
    {
        String[] rightOn = {"yeet"};
        String[] races = {"Elf", "Human", "Gnome", "Half-Orc", "Dwarf"};
        int[] chance = {5, 50, 5, 25, 15};
        int rand = (int)(Math.random()*100);
        int[] calcChance = new int[chance.length];
        calcChance[0] = chance[0];
        for (int x = 1; x < chance.length; x++)
        {
            calcChance[x] = chance[x] + calcChance[x-1];
        }	
        return "yeet";
    }



    
}
