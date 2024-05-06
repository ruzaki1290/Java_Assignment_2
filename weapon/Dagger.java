package weapon;

public class Dagger extends Weapon {
  private int damageAmount = 50;
  private int dexterityCost = 10;
  private int baseHitChance = 90; // out of 100 the odds of hitting
  private int critChance = 70;

  public Dagger() {
    super();
    super.setDamageAmount(damageAmount);
    super.setDexterityCost(dexterityCost);
  } // constructor

  public int strike(int attackType, int dexterity, int strength) {
    int damage = 0;
    int roll = super.randNum.nextInt(100) + 1; // 1 - 100
    
    if((roll - attackType * 5) + (dexterity / 10 - this.dexterityCost) 
        <= baseHitChance) { // hit!
      damage = this.damageAmount + (strength / 10) + (attackType * 5);
    }
    else { // miss
      damage = 0;
    }

     // Critical chance
     System.out.printf("INITIAL DAMAGE: " + damage + "\n"); // Displays regual atack inflicted;
     if (roll <= critChance) {
       damage = damage * 2;
       System.out.printf("CRITICAL STRIKE: " + damage + "\n"); // Displays bonus attack inflicted;
     }

    return damage;
  } // strike
} // class
