
/**
 * Demo class
 * 
 * @author keriezhang
 * @date 2016/10/31
 */
public class Test01 {
    public static void main(String[] args) {
        Week weekOne = Week.MON;
        Week weekTue = Week.TUE;

        System.out.println(weekOne.compareTo(weekTue));
        System.out.println(weekOne.compareTo(weekOne));
        System.out.println(weekTue.compareTo(weekTue));
    }
}
