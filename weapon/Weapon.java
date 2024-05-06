package weapon;

import java.util.Random;

public abstract class Weapon {
  private int damageAmount;
  private int dexterityCost;
  private int critChance; // Critical chance
  protected Random randNum = new Random();

  public Weapon() {
    // do nothing for now
  }

  //==============>>
  // GETTERS
  public int getDamageAmount() {
    return this.damageAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  public int getCritChance() {
    return this.critChance;
  }

  //==============>>
  // SETTERS
  public void setDamageAmount(int damageAmount) {
    this.damageAmount = damageAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
  // an abstract method is polymorphic
  // meaning the children determine how
  // this method will be implemented
  public abstract int strike(int attackType, int dexterity, int strength);
  

} // class
