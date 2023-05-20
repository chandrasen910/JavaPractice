package Test;

public abstract class Animals {
        int age;
        int weight;
        String gender;

      
        
        public Animals(int age, int weight, String gender) {
            this.age = age;
            this.weight = weight;
            this.gender = gender;
        }
        public void eat(){
            System.out.println("eating ...");
        }
        public void sleep(){
            System.out.println("Sleeping ...");
        }
        public abstract void move();
}
