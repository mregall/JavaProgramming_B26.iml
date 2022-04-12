package day43_custom_classes2;

public class Phone {
    /*

        create instance variables

            name, brand, memory, version

        create constructors

        - accept and initialize the name

        - accept and initialize the name and brand

        - accept and initialize the name, brand, memory, and version

        create a toString
     */

    String name;
    String brand;
    int memory;
    int version;

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Phone(String name, String brand, int memory, int version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    @Override
    public String toString() {
                    /*return "Phone{" +
                            "name='" + name + '\'' +
                            ", brand='" + brand + '\'' +
                            ", memory=" + memory +
                            ", version=" + version +
                            '}';
                            }*/
        //Alternate print statement:

        String obj = name + " | "; // this is called pipes, the seperator
        if (brand != null){
            obj += brand + " | ";
        }
        if (memory != 0){
            obj += memory + " | ";
        }
        if (version != 0){
            obj += version;
        }
        return obj;

    }
}



























































