public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        Car myCar = new Car();
        ElevenGrade clase = new ElevenGrade(20, 30);
        Student estudiante = new Student("andres",10, 17);
        Teacher profesor = new Teacher("emmanuel","informatica",23);
        
        System.out.println(estudiante.age);
    }
}
