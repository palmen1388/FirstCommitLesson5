package Task2;

public enum DrinkType {

    TEA("Чай"),
    COFFEE("Кофе"),
    MILK_TEA("Чай с молоком"),
    MILK_COFFEE("Кофе с молоком"),
    CINNAMON_MILK_TEA("Чай с молоком и корицей"),
    CINNAMON_MILK_COFFEE("Кофе с молоком и корицей");

    protected String type;



    DrinkType(String type) {
        this.type = type;
    }
}
