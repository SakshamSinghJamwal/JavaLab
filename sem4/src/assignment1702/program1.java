package assignment1702;

public class program1 {
	public static class Info {
        String name;
        int age;
        String city;

        public Info(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
        }
    }

    public static void main(String[] args) {
        Info person = new Info("Ram", 20, "Jammu");
        person.display();
    }

}
