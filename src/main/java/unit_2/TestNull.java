package unit_2;

public class TestNull {
    public static void main(String[] args) {
        String ids="1,";
        String[] id =ids.split(",");
        for (String anId : id) {
            System.out.println(anId);
        }
    }
}
