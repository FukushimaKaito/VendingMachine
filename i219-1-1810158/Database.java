public class Database {
    int itemlist[][];// 
    int coinlist[];// 
    Item coke1 = new Item(1, "coke", 100, 0);
    Item coke2 = new Item(1, "coke", 100, 0);
    Item coke3 = new Item(1, "coke", 100, 0);
    Item coffe1 = new Item(2, "cooffe", 100, 1);
    Item coffe2 = new Item(2, "cooffe", 100, 1);
    Item coffe3 = new Item(2, "cooffe", 100, 1);
    Item water1 = new Item(3, "water", 150, 0);
    Item water2 = new Item(3, "water", 150, 0);
    Item water3 = new Item(3, "water", 150, 0);

    Database(int inum) {
        itemlist = new int[inum][3];// id,stack,recommend,price
        itemlist[0][0] = 3; // 
        itemlist[0][1] = 0; // 
        itemlist[0][2] = 100; //

        itemlist[1][0] = 3; // 
        itemlist[1][1] = 1; // 
        itemlist[1][2] = 100; // 

        itemlist[2][0] = 3; // 
        itemlist[2][1] = 0; // 
        itemlist[2][2] = 150; // 

        coinlist = new int[4];
        coinlist[0] = 50;// 10
        coinlist[1] = 50;// 50
        coinlist[2] = 50;// 100
        coinlist[3] = 50;// 150
    }

    // public int getItem() {
    // return Item;
    // }

    public void addItem(int itemNumber, int n) {

    }

    public int[] getItemList() {
        int[] tmp;// init
        tmp = new int[3];
        for (int i = 0; i < 3; i++) {
            if (itemlist[i][0] > 0) {
                tmp[i] = i;// id
            }
        }
        return tmp;
    }

    public int[] getRecommendList(int gender) {
        int[] tmp;// init
        tmp = new int[3];
        for (int i = 0; i < 3; i++) {
            if (itemlist[i][1] == gender) {
                tmp[i] = i;// id
            } else {
                tmp[i] = -1;
            }
        }
        return tmp;
    }

    public void setRecommendList(Item it) {

        int id = it.getID();
        if (it.target == 0)
            itemlist[id][2] = 0;
        if (it.target == 1)
            itemlist[id][2] = 1;
    }

    public void getCoin(int yen) {
        if (yen == 10)
            coinlist[0] += 1;
        if (yen == 50)
            coinlist[1] += 1;
        if (yen == 100)
            coinlist[2] += 1;
        if (yen == 500)
            coinlist[3] += 1;
    }

    // public Coin[] getCoinList() {
    // return coinList;
    // }

    public boolean checkCoin() {
        if (coinlist[1] < 1)// 50
            return false;
        if (coinlist[2] < 4)// 10
            return false;
        return true;
    }
}