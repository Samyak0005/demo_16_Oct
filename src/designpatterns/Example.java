package designpatterns;

public class Example {
    public static void main(String[] args) {

      SingletonDsnP singletonDsnP1 = SingletonDsnP.getSingletonDsnP();

        System.out.println(singletonDsnP1.hashCode());

        SingletonDsnP singletonDsnP2 = SingletonDsnP.getSingletonDsnP();

        System.out.println(singletonDsnP2.hashCode());

        SingletonDsnp2 singletonDsnp2 = SingletonDsnp2.getSingletonDsnp2();
        System.out.println(singletonDsnp2.hashCode());
        SingletonDsnp2 singletonDsnp21 = SingletonDsnp2.getSingletonDsnp2();
        System.out.println(singletonDsnp21.hashCode());
    }
}
