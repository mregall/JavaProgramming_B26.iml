package day58_exceptions.morning;

public class Person {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) throws Exception {
            if (name == null || name.isEmpty()){
                throw new Exception("Name cannot be null or empty");
                }
                this.name = name;
            }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0 || age >= 120){
                throw new IllegalArgumentException("Age shold be more than 0 or less than 120");
            }
            this.age = age;
        }
}