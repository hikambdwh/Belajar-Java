package tutorial;

class Player {

    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;

    }

    void equipment(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    void display() {

        System.out.println("Nama: " + this.name);
        System.out.println("Darah: " + this.health);
        this.weapon.displayWeapon();
        this.armor.displayArmor();
    }

    void attack(Player musuh) {
        double attack = this.weapon.attackPower;
        System.out.println(this.name + " Menyerang " + musuh.name + " atk[" + attack + "]");
        
        musuh.defense(attack);
    }
    
    void defense(double attack){
        double dmg;
        
        if(this.armor.defensePower < attack){
            dmg = attack - this.armor.defensePower;
            this.health = this.health - dmg;
            System.out.println("ucup -> damage [" + dmg + "]" + " darah: [" + (this.health) + "]");
        } else {
            dmg = 0;
            System.out.println("ucup -> damage [" + dmg + "]" + " darah: [" + (this.health - dmg) + "]");
        }
    
    }
}

class Weapon {

    String name;
    int attackPower;

    Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;

    }

    void displayWeapon() {
        System.out.println("Senjata: " + this.name + ", Damage: " + this.attackPower);

    }
}

class Armor {

    String name;
    int defensePower;

    Armor(String name, int defensePower) {
        this.name = name;
        this.defensePower = defensePower;

    }

    void displayArmor() {
        System.out.println("Armor: " + this.name + ", Defense: " + this.defensePower);

    }
}

public class Latihan {

    public static void main(String[] args) {

        Player player1 = new Player("Ucup", 100);
        Player player2 = new Player("Samuel", 100);

        Weapon pedang = new Weapon("Pedang", 20);
        Weapon tombak = new Weapon("Tombak", 25);

        Armor bajuBesi = new Armor("baju Besi", 14);
        Armor bajuKulit = new Armor("baju kulit", 10);

        player1.equipment(pedang, bajuBesi);
        player1.display();

        System.out.println("");
        player2.equipment(tombak, bajuKulit);
        player2.display();

        System.out.println("\nPERTEMPURAN");
        player1.attack(player2);
        player1.display();
        player2.display();

    }

}
