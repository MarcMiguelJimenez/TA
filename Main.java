public class Main {
    public static void main(String[] args) {
      Gold goldBar = new Gold(10);
      Weapon weapon1 = new Weapon("Super weapon", "Super 2 weapon", 10, 50);
      Sword magicSword = new Sword();
      Pillow softPillow = new Pillow();
      Mace bigMace = new Mace();
      Arrow sharpArrow = new Arrow();
      World world = new World();
      world.load_tiles();  
    }
}
