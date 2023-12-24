package designpatterns;

public class SingletonDsnP {

    private SingletonDsnP(){


    }

    private static SingletonDsnP singletonDsnP;

   public static SingletonDsnP getSingletonDsnP(){

        if (singletonDsnP == null){

           singletonDsnP = new SingletonDsnP();
        }
        return singletonDsnP;
    }
}
