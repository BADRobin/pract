package lec210;

public class Main {

    public static void main(String[] args) {
	  String st = "4.5";
        Double d = null;
        try {
            d = Double.valueOf(st);
            System.out.println(d);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
