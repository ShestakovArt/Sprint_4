public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        Account account = new Account("Тимоти Шаламе");
        if (account.checkNameToEmboss()){
            System.out.println("На карте будет напечатано имя владельца карты");
        }
        else{
            System.out.println("Не подходящее имя владельца карты");
        }
    }
}
