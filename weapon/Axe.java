package weapon;

public class Axe extends Weapon {
  private int damageAmount = 200;
  private int dexterityCost = 150;
  private int baseHitChance = 50; // out of 100 the odds of hitting
  private int critChance = 30; // % of critical chance

  public Axe() {
    super();
    super.setDamageAmount(damageAmount);
    super.setDexterityCost(dexterityCost);
  } // constructor

  public int strike(int attackType, int dexterity, int strength) {
    int damage = 0;
    int roll = super.randNum.nextInt(100) + 1;
    
    if((roll - attackType * 5) + (dexterity / 10 - this.dexterityCost) // Displays regual atack inflicted;
        <= baseHitChance) { // hit!
      damage = this.damageAmount + (strength / 10) + (attackType * 5); // Displays bonus attack inflicted;
    }
    else { // miss
      damage = 0;
    }

    // Critical chance
    System.out.printf("INITIAL DAMAGE: " + damage + "\n");
    if (roll <= critChance) {
      damage = damage * 2;
      System.out.printf("CRITICAL STRIKE: " + damage + "\n");
    }

    return damage;
  } // strike
} // class
