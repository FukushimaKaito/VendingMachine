public class Server {
    /* variable */

    /* method */
    public void showItemList(int id) {
        System.out.println("Short delivery item id:" + id);
    }

    public void showBank(int bank) {
        System.out.println("Short delivery bank:" + bank);
    }

    public String getWeather() {
        String weather = "sunny";
        // String weather = "clowdy";
        // String weather = "rainy;
        // String weather = "windy";
        // String weather = "stormy";
        // String weather = "snowy";
        return weather;
    }

}