
public class SpringAllConcepts {

    public static void main(String[] args) {

        System.out.println("==== SPRING FRAMEWORK CONCEPT DEMO ====");
    }
}


   //1. SPRING CORE + BEANS + IOC

/*
 Spring Core:
 - Provides IoC (Inversion of Control)
 - Manages objects (Beans)
*/

// Bean class
class Engine {
    public String start() {
        return "Engine Started";
    }
}

/*
 Dependency Injection:
 Instead of creating object manually,
 Spring injects it.
*/
class Car {

    Engine engine;   // Dependency

    // Constructor Injection
    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        System.out.println(engine.start());
        System.out.println("Car is running...");
    }
}

/*
 IOC Example :
 Engine engine = new Engine();
 Car car = new Car(engine);
*/


/*
   2. SPRING CONTAINER

 Spring Container:
 - Creates objects
 - Injects dependencies
 - Manages lifecycle

 Types:
 1. BeanFactory (lightweight)
 2. ApplicationContext (most used)
*/


/*
   3. SPRING MVC MODULE

 Spring MVC is used to create web applications.
 It follows MVC pattern.

 Controller → Handles request
 Model      → Data
 View       → UI
*/

// Example Controller (Simulation)
class HomeController {

    // @GetMapping("/hello")
    public String hello() {
        return "Welcome to Spring MVC!";
    }
}


/*
   4. SPRING JDBC MODULE

 Used to connect Java with Database
 Uses JdbcTemplate
 Eliminates boilerplate JDBC code
*/

class StudentJDBC {

    public void insertStudent() {
        String sql = "INSERT INTO student VALUES (1, 'Rahul')";
        System.out.println("Executing SQL: " + sql);
    }
}


/*
   5. SPRING ORM MODULE

 ORM = Object Relational Mapping
 Used with Hibernate / JPA
 Converts Java object → Database table
*/

//@Entity
class Student {

    // @Id
    int id;
    String name;
}

/*
@Repository
interface StudentRepository extends JpaRepository<Student, Integer> {
}
*/


/*
   6. SPRING BEANS

 Bean = Object managed by Spring

 Bean Scopes:
 1. singleton  (default)
 2. prototype
 3. request
 4. session
    */


   //7. DEPENDENCY INJECTION TYPES

class ExampleDI {

    // Constructor Injection (Recommended)
    Engine engine;

    ExampleDI(Engine engine) {
        this.engine = engine;
    }

    // Setter Injection
    void setEngine(Engine engine) {
        this.engine = engine;
    }
}


/*
   8. ADVANTAGES OF SPRING

Loose coupling
Easy testing
Faster development
Supports REST APIs
Easy database integration
Industry standard
*/


