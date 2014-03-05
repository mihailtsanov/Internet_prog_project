package auctions;

public class Item {

    private Integer id;
    private String name;

    public Item(String name) {
        this.id = system.World.getNextItemId();
        this.name = name;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}
