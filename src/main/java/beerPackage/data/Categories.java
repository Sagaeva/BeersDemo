package beerPackage.data;

public class Categories {

    private int Id;
    private String Category;

    public Categories() {}

    public Categories(int id, String category) {
        Id = id;
        Category = category;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "Id=" + Id +
                ", Category='" + Category + '\'' +
                '}';
    }
}
