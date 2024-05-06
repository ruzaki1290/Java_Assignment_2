package warrior;

public class Human extends Warrior {

  private int minHealth = 75;
  private int maxHealth = 150;
  private int minStrength = 100;
  private int maxStrength = 100;
  private int minDexterity = 75;
  private int maxDexterity = 50;
  
  public Human() {
    super(); // must be called first!
    super.setHealth(super.randNum.nextInt(maxHealth) + minHealth); 
    /* calling a warrior from the super class and using randNum and then 
    we are setting the max health(150) and then passing the bonus of random number up to 75 */
    super.setStrength(super.randNum.nextInt(maxStrength) + minStrength);
    super.setDexterity(super.randNum.nextInt(maxDexterity) + minDexterity);
  } // contructor
} // class
