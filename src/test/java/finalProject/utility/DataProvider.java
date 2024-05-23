package finalProject.utility;

public class DataProvider {


    public String getRandomEmail() {
        String name = "Edris";
        String email = "@gmail.com";
        String num = "";
        for (int i = 0; i <= 4; i++) {
            num += (int) (Math.random() * 10);
        }
        return name + num + email;
    }

}
