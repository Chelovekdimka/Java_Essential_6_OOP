//Створіть перечислювальний тип (enum) Vehicles, що містить конструктор, який повинен набувати цілого числа (вартість автомобіля),
//        містити метод getColor(), який повертає рядок з кольором автомобіля,
//        і містити перевантажений метод toString(), який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.

package Ex_4;

public enum Vehicles {
    HONDA(3,"green"),
    TOYOTA(5, "grey"),
    MAZDA(5, "white"),
    FORD(14, "yellow");
    int price;
    String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString (){
        return name() + "\nКолір авто - " + color + "\nЦіна авто - " + price;
    }
}
