package designpatterns;

public class SingletonDsnp2 {
    // Eager way to instance created
    private static SingletonDsnp2 singletonDsnp2 = new SingletonDsnp2();

    public static SingletonDsnp2 getSingletonDsnp2(){

        return singletonDsnp2;
    }
}
