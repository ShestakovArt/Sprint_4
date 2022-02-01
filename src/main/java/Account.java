import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("Проверяем подходит ли имя для размещения на карте")
    public boolean checkNameToEmboss() {
        boolean result = false;
        if(name != null){
            String checkName = name;
            checkName = checkName.trim();
            if (checkName.length() >= 3 && checkName.length() <= 19){
                if (checkName.indexOf(" ") > 0){
                    String[] str = checkName.split(" ");
                    if ( str.length == 2){
                        int count = 0;
                        for (String sub: str) {
                            if(sub.matches("^[А-Яа-яЁёa-zA-Z]+$")){
                                count++;
                            }
                        }
                        if (count == 2){
                            result = true;
                        }
                    }
                }
            }
        }

        return result;
    }
}
