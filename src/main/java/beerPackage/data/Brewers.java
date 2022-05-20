package beerPackage.data;

public class Brewers {

    private int Id;
    private String Name;

    public Brewers() {}

    public Brewers(int id, String name) {
        Id = id;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Brewers{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
