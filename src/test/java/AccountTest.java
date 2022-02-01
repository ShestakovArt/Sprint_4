import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][] {
                { "Тимоти Шаламе", true},
                { "Тимоти Шаламе Второй", false},
                { "ТимотейШевроле", false},
                { "123Морти", false},
                { "Rick 1951", false},
                { "3,1415 926535", false},
                { " Rick Sanchez ", true},
                { "Хьюберт Блейн Вольфшлегельштайнхаузенбергедорф-старший ", false},
                { "Ая", false},
                { "", false},
                {null, false},
        };
    }

    @Test
    @DisplayName("Checking the name for placement on the map")
    @Description("Проверка имени для размещения на карте")
    public void checkNameToEmboss() {
        Account account = new Account(name);
        assertEquals(expectedResult, account.checkNameToEmboss());
    }
}