package armour;

public class Leather extends Armour {
  private int armourAmount = 50;
  private int dexterityCost = 50;
  private int blockAttack = 70; // % of chance to block the attack

  public Leather() {
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
    return damage - (this.armourAmount / 10);
  }
  
} // class
