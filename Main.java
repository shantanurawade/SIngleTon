public class Main{
    public static void main(String[] args) {
        // Created to thread to check thread safe behaviour of single ton class
        Thread t1 = new Thread(){
            @Override
            public void run() {
                SingleTon instance = SingleTon.getInstance();
                super.run();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                SingleTon instance1 = SingleTon.getInstance();
                super.run();
            }
        };


        t1.start();
        t2.start();
        /* After running this code only one object will get created
           You can ensure that by get hello output only once. */

        //We can also create single ton pattern by using Enum as enum is by default having private constructor
        SingleTonByEnum abc = SingleTonByEnum.INSTANCE;
        SingleTonByEnum abc1 = SingleTonByEnum.INSTANCE;
        // Assigning value to ABC
        abc.getValue(5);
        // Printing value to ABC
        System.out.println("For abc "+abc.a);
        // Printing value to ABC1
        System.out.println("For abc1 "+abc1.a);

        // If both values in output are same then we can say that only one instance is created

    }
}