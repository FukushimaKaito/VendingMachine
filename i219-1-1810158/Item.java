public class Item {
    /* varialbe */
    int itemid;
    String name;
    int price;
    int target;

    Item(int argid, String argname, int argprice, int argtarget) {
        itemid = argid;
        name = argname;
        price = argprice;
        target = argtarget;
    }

    /* methond */
    // id
    public int getID() {
        return itemid;
    }

    // id
    public void setID(int arg) {
        itemid = arg;
    }

    public String getName() {
        return name;
    }

    public void setName(String arg) {
        name = arg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int arg) {
        price = arg;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int arg) {
        target = arg;
    }
}