import java.util.Scanner;

public class Camera {
    int gender;

    /** method */
    Camera() {
        gender = -1;
    }

    public void detectCustomer() {
        System.out.println("INPUT Man:0 Woman:1:");
        Scanner scanner = new Scanner(System.in);
        gender = scanner.nextInt();
        if (gender == 0) {
            System.out.println("recognized Man.");
        } else if (gender == 1) {
            System.out.println("recognized Woman");
        } else {
            System.out.println("Unknown Man");
            gender = 0;
        }
    }

    public int getGender() {
        return gender;
    }
}