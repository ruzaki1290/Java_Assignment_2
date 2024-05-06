package armour;

import java.util.Random;

public abstract class Armour {
  private int armourAmount;
  private int dexterityCost;
  private int blockAttack;
  protected Random randNum = new Random();

  public Armour() {
    // do nothing
  }

  //================>>
  // GETTERS
  public int getArmourAmount() {
    return this.armourAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  public int getBlockAttack() {
    return this.blockAttack;
  }
  // takes the armour protection into account
  // reduces the overall damage based on armour typ
  public abstract int getFinalDamage(int damage);

  //================>>
  // SETTERS
  public void setArmourAmount(int armourAmount) {
    this.armourAmount = armourAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
  public void setblockAttack(int blockAttack) {
    this.blockAttack = blockAttack;
  }
} // class
