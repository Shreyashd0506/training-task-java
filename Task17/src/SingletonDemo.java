public class SingletonDemo {

    public static void main(String[] args) {

        System.out.println("=== BASIC SINGLETON ===");
        BasicSingleton obj1 = BasicSingleton.getInstance();
        BasicSingleton obj2 = BasicSingleton.getInstance();

        obj1.showMessage();

        System.out.println("Same object? " + (obj1 == obj2));

        System.out.println("\n=== THREAD SAFE SINGLETON ===");
        ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();

        t1.display();
        System.out.println("Same object? " + (t1 == t2));
    }
}

class BasicSingleton {

    // Step 1: Create static instance
    private static BasicSingleton instance;

    // Step 2: Private constructor
    private BasicSingleton() {
        System.out.println("Basic Singleton Instance Created");
    }

    // Step 3: Public method to return instance
    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }

    void showMessage() {
        System.out.println("Hello from Basic Singleton");
    }
}


// THREAD-SAFE SINGLETON IMPLEMENTATION
class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("Thread Safe Singleton Created");
    }

    // synchronized method ensures thread safety
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    void display() {
        System.out.println("Thread Safe Singleton Working");
    }
}
