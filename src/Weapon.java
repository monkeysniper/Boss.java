public class Weapon {
    private WeaponType type;
    private String name;

    public Weapon( WeaponType type,String name) {
        this.type = type;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }
}



//Создайте класс Weapon с приватными полями для хранения типа оружия и названия оружия, а также добавьте методы доступа (геттеры и сеттеры) к этим полям.