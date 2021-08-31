import javax.swing.JOptionPane;

public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */

    public static void main(String[] args) {

      //Setting base Stats
        int strength = Integer.parseInt(JOptionPane.showInputDialog(" What is your Character's strength stat? (Roll a d20) "));
        int dexterity = Integer.parseInt(JOptionPane.showInputDialog (" Whats your Charater's dexterity stat? (Roll a d20) "));
        int constitution = Integer.parseInt(JOptionPane.showInputDialog(" Whats your character's constitution? (Roll a d20) "));
        int wisdom = Integer.parseInt(JOptionPane.showInputDialog(" What is your Character's Wisdom stat? (Roll a d20) "));
        int charisma = Integer.parseInt(JOptionPane.showInputDialog(" What is your character's charisma stat? (Roll a d20) "));
        int intelligence = Integer.parseInt(JOptionPane.showInputDialog("what is your character's Intelligence stat? (Roll a d20) "));

     //Calculating  advance stats
        double damage = 3 * (strength + wisdom) * dexterity;
        double armor = (constitution + dexterity) * 2;
        double mana = ((wisdom + charisma) * constitution) + intelligence;
        double spellPower = ((wisdom + charisma) * strength * intelligence + dexterity);

     //returning information
JOptionPane.showMessageDialog(null, " Strength - " + strength + " Dexterity - " + dexterity + " Constitution - " + constitution + " Wisdom - " + wisdom + " Charisma - " + charisma + " Intelligence - " + intelligence );
JOptionPane.showMessageDialog(null, " Base damage - " + damage + " Armor rating - " + armor + " Mana capacity - " + mana + " Spell power - " + spellPower );









    }
}
