public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        Weapon weapon=new Weapon(WeaponType.FIREARMS,"AK-47");
        boss.setWeapon(weapon);
        boss.printInfo();
        System.out.println("-----------------");
        Skeleton skeleton=new Skeleton();
        skeleton.setArrows(25);
        skeleton.setHealth(400);
        skeleton.setDamage(70);
        Weapon weapon1=new Weapon(WeaponType.RANGED,"Longbow");
        skeleton.setWeapon(weapon1);
        skeleton.printInfo();
        System.out.println("-----------------");
        Skeleton skeleton1=new Skeleton();
        skeleton.setArrows(100);
        skeleton.setHealth(900);
        skeleton.setDamage(70);
        Weapon weapon2=new Weapon(WeaponType.MELEE,"Knife");
        skeleton.setWeapon(weapon2);
        skeleton.printInfo();
    }

}


//Создайте перечисление WeaponType, в котором перечислите три типа оружия.
//Создайте класс Weapon с приватными полями для хранения типа оружия и названия оружия, а также добавьте методы доступа (геттеры и сеттеры) к этим полям.
//Создайте класс GameEntity для представления игровых сущностей, выделив общие поля, присущие как боссам, так и героям, и добавьте методы доступа к этим полям.
//Создайте класс Boss, который наследуется от GameEntity, и добавьте в него поле сложного типа Weapon (для назначения оружия боссу), а также методы доступа к этому полю.
//В классе Main (класс в котором есть запускаемый метод main) создайте экземпляр босса и установите ему все необходимые свойства.
//Реализуйте метод printInfo() в классе Boss для печати информации о боссе.
//Создайте класс Skeleton, который также наследуется от класса Boss.
//Добавьте в класс Skeleton поле для хранения количества стрел и методы доступа к этому полю.
//Переопределите метод printInfo() в классе Skeleton.
//В методе main создайте и заполните данными два экземпляра Skeleton, а затем выведите всю информацию о скелетах.