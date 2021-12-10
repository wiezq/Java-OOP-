package nine;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map<String, Integer> map = new HashMap<String, Integer>();

    public void addCustomer(String name, int inn)
    {
        map.put(name, inn);
    }

    public void customerContains(String name, int inn) throws WrongINNException {
        if (map.get(name) != inn)
        {
            throw new WrongINNException("Вы ввели неправильный номер инн");
        }
        else
        {
            System.out.println("Все хорошо");
        }

    }

}
