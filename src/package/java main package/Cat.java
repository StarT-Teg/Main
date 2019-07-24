import java.io.IOException;

public class Cat {

    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int fight1 = this.age > anotherCat.age ? 1 : 0;
        int fight2 = this.weight > anotherCat.weight ? 1 : 0;
        int fight3 = this.strength > anotherCat.strength ? 1 : 0;
        int conclusion = fight1+fight2+fight3;
        return conclusion > 0;
    }

    public static void main(String[] args) {

    }
}
