package beerPackage.data;

public class Beers {


        private int id;
        private String Name;
        private int BrewerId;
        private int CategoryId;

        public Beers(){}

    public Beers(int id, String name, int brewerId, int categoryId) {
        this.id = id;
        Name = name;
        BrewerId = brewerId;
        CategoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBrewerId() {
        return BrewerId;
    }

    public void setBrewerId(int brewerId) {
        BrewerId = brewerId;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", BrewerId=" + BrewerId +
                ", CategoryId=" + CategoryId +
                '}';
    }
}
