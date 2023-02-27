//Створіть перерахунковий тип (enum) Animals, що містить конструктор,
//        який повинен набувати цілого числа (вік тварини), і містити перевантажений метод toString(),
//        який повинен повертати назву екземпляра та вік тварини.

package Ex_2;

public enum Animals {
    ELEPHANT(3),
    LION(8),
    CAT(12),
    DOG(5);


    int age;
    private Animals(int age) {this.age = age;}
    @Override
    public String toString (){
        return name() + " - " + age + " роки(ів)";
    }

}
