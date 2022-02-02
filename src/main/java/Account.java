import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("Проверяем подходит ли имя для размещения на карте")
    public boolean checkNameToEmboss() {
        boolean result = false;
        if (name != null){
            result = name.matches("(?=^.{3,19}$)(\\p{L}+\\s\\p{L}+)$");
        }
        return result;
    }
}
