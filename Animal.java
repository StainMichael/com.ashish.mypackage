public class Animal {
    Animal() {
        System.out.println(1);
    }
    Animal(int x) {
        System.out.println(x);
    }
    Animal(int x, int y) {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.A();
    }
    
}
