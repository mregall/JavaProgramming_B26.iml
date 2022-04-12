package day43_custom_classes2;

public class Marker {

    String type;
    String brand;
    String color;
    int percentLeft;


    public Marker(String inputType, String inputBrand, String inputColor, int inPercentLeft){
        type = inputType;
        brand = inputBrand;
        color = inputColor;
        percentLeft = inPercentLeft;
    }


    @Override
    public String toString() {
        return "Marker{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", percentLeft=" + percentLeft +
                '}';
    }
}
