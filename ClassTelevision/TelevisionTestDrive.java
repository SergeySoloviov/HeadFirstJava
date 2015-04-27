package HeadFirstJava.ClassTelevision;

/**
 * Created by Сережка on 17.04.2015.
 */
public class TelevisionTestDrive {
    public static void main(String[] args) {
        Television tv = new Television(40, 45, "черного");
        tv.show();
        System.out.println(tv.size());
        System.out.println(tv.setColor());
    }
}
