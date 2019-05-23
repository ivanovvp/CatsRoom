package room.cats;

public class Main {

    public static void main(String[] args) {

        Room room = new Room();

        room.AddCat(new Cat("Vasya"));
        room.AddCat(new Cat("Barsik"));

        System.out.println("Two cats were added:");
        for (Cat cat : room.getCats()){
            System.out.println(cat.toString());
        }
        System.out.println();

        Cat removedCat = room.RemoveCat();
        System.out.println( removedCat.toString() + " was removed from the room");
        System.out.println();


        System.out.println("The cats left in the room:");
        for (Cat cat : room.getCats()){
            System.out.println(cat.toString());
        }
    }
}
