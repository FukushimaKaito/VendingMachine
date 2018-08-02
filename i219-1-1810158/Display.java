
public class Display {
    /** variable */

    /** method */
    public void showItem(int[] list) {
        System.out.println("Active items");
        for (int i = 0; i < 3; i++) {
            System.out.println(list[i]);
            // image
            // if (list[i] == 0)
            // show(pic1.jpg);
        }
    }

    public void showWeather(String weather) {
        System.out.println(weather);
    }

    public void showRecommend(int[] arg) {
        for (int i = 0; i < 3; i++) {
            if (arg[i] != -1)
                System.out.println("recommend is ItemNo" + arg[i]);
        }
    }
}