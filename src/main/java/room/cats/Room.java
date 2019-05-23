package room.cats;

public class Room {
    private Cat[] cats;

    public Cat[] getCats() {
        return cats;
    }

    public void AddCat(Cat cat) {
        if (this.cats == null) {
            this.cats = new Cat[1];
        } else {
            Cat[] tmpCats = cats;
            cats = new Cat[tmpCats.length + 1];
            for (int i = 0; i < tmpCats.length; i++) {
                cats[i] = tmpCats[i];
            }
        }
        cats[cats.length - 1] = cat;
    }

    public Cat RemoveCat() {
        if (cats == null) {
            return null;
        }
        Cat[] tmpCats = cats;
        cats = new Cat[tmpCats.length - 1];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = tmpCats[i];
        }
        return tmpCats[tmpCats.length - 1];
    }
}
