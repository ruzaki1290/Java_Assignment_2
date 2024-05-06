package armour;

public class Chainmail extends Armour {
  private int armourAmount = 150;
  private int dexterityCost = 75;
  private int blockAttack = 50; // % of chance to block the attack

  public Chainmail() {
    super();
    super.setArmourAmount(armourAmount);
    super.setDexterityCost(dexterityCost);
  } // contructor

  public int getFinalDamage(int damage) {
    int roll = super.randNum.nextInt(100) + 1;
    System.out.printf("INITIAL ARMOUR " + armourAmount + "\n");
    if(roll <= blockAttack) {
    armourAmount = armourAmount * 2;
    System.out.printf("DAMAGE BLOCKED: " + armourAmount + "\n");
    }
    return damage - (this.armourAmount / 5);
  }
  
} // class
