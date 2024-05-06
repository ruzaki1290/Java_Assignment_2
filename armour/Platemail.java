package armour;

public class Platemail extends Armour {
  private int armourAmount = 250;
  private int dexterityCost = 250;
  private int blockAttack = 30; // % of chance to block the attack

  public Platemail() {
    super();
    super.setArmourAmount(armourAmount);
    super.setDexterityCost(dexterityCost);
  } // contructor

  public int getFinalDamage(int damage) {
    int roll = super.randNum.nextInt(100) + 1;
    System.out.printf("INITIAL ARMOUR: " + armourAmount + "\n");
  if (roll <= blockAttack) {
    armourAmount = armourAmount * 2;
    System.out.printf("DAMAGE BLOCKED: " + armourAmount + "\n");

  }
  return damage - (this.armourAmount / 2);
}
} // class
