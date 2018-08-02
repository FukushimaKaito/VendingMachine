import java.util.Scanner;

public class SessionController {
    /** relationship */
    Pay pay = new Pay();
    Touch tc = new Touch();
    Camera cam = new Camera();
    Display disp = new Display();
    Calculator calc = new Calculator();
    Server srv = new Server();

    // Upate atabase
    Database db = new Database(3);
    /* varialbe */
    int price;

    /* method */
    public void pullTotal() {
        int tmp = calc.getTotal();
        price = db.itemlist[tc.itemNumber - 1][4];
        if (price < tmp) {
            popItem();
        }
    }

     
    public void returnCash(int remainder) {
        System.out.println("charge" + remainder);
    }

    public int getMoney() {
        return pay.money;
    }

    public void pullMoney() {
        int tmp = pay.getMoney();
        if (tmp == 10) {
            db.coinlist[0] += 1;
        } else if (tmp == 50) {
            db.coinlist[1] += 1;
        } else if (tmp == 100) {
            db.coinlist[2] += 1;
        } else if (tmp == 500) {
            db.coinlist[3] += 1;
        }
        calc.addCoinTotal(tmp);

        if (tc.itemNumber >= 0 && price <= calc.getTotal()) {
            if (calc.getRemainder(price) > 0)
                returnCash(calc.getRemainder(price));
            popItem();
        }
    }

    public int pullItemNumber() {
        price = db.itemlist[tc.getItemNumber()][2];
        if (price > 0 && calc.getTotal() > 0 && price <= calc.getTotal()) {
            if (calc.getRemainder(price) > 0)
                returnCash(calc.getRemainder(price));
            popItem();
        }
        return tc.getItemNumber();
    }

    public void popItem() {
        int id = tc.getItemNumber();
        System.out.println("Output" + id);
        db.itemlist[id][1] -= 1;
        outputVoice();
        System.exit(0);
    }

    public void pushItem(Item it) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add count:");// for test
        int n = scanner.nextInt();
        db.addItem(it.itemid, n);
    }

    // get
    public void getItem(int itemNumber) {

    }

    // Item list ->Dispshow
    public void pullItemList() {
        int list[] = db.getItemList();
        disp.showItem(list);
    }

    // Cam -> display Item hilight
    public void getRecommend() {
        int gnd = cam.getGender();
        int piclist[] = db.getRecommendList(gnd);
        disp.showRecommend(piclist);
    }

    // get Weather from server and Display show
    public void pullWeather() {
        String weather = srv.getWeather();
        disp.showWeather(weather);
    }

    public void outputVoice() {
        System.out.println("Please pay attention to forget to take your item and charge.");
        System.out.println("Thank you very much.");
    }

    public void pullRecommend() {

    }

    public void pullCoinList() {

    }
}