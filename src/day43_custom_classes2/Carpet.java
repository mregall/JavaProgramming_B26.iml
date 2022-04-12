package day43_custom_classes2;

public class Carpet {

    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(boolean inputPersian, double inWidth, double inLength, double inUnit$){
        width = inWidth;
        length = inLength;
        isPersian = inputPersian;
        unitPrice = inUnit$;
        calculatePrice();
    }

    public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if (isPersian) {
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        return (isPersian ? "The Persian Carpet " : "The Carpet ") + "\nhas dimensions of " + length + " x " + width + "\nThe unit price is $" + unitPrice + "\nIn total the price is $" + totalPrice;


        /*
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", isPersian=" + isPersian +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
                */
    }
}
