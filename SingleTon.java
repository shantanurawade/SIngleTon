public class SingleTon {
    //Created a static instance as we want only one object
    public static SingleTon instance;

    //Constructor is private as no one can access this from outside the class to create an object
    private SingleTon(){
        // Printing massage to ensure that only one instance is created
        System.out.println("Hello");
    }

    // Static method which is responsible for creating object as it can access private constructor from same class
    public static SingleTon getInstance (){

        // Checking for any existing object
        if (instance == null){

            // Synchronized to class as multiple tread can enter this block before creating the objects
            synchronized (SingleTon.class) {

                // Double-checking for any existing object
                if (instance == null)

                // Creating instance of class
                instance = new SingleTon();
            }
        }

        // Returns instance
        return instance;
    }
}
