public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void printInfo(){
        System.out.println("info about Boss");
        System.out.println("Health:"+getHealth());
        System.out.println("Damage:"+getDamage());
        System.out.println("Weapon type:"+weapon.getType()+" Weapon name:"+weapon.getName());
    }
}
