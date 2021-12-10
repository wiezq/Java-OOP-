package nine;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckINN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите номер ИНН: ");
            try{
                BigInteger inn =  new BigInteger(sc.nextLine());
                checkInn(inn);
                break;
            }catch (WrongINNException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }


    public static boolean checkInn(BigInteger inn) throws WrongINNException {
        int i = 0;
        BigInteger cInn = new BigInteger(inn.toByteArray());
        while (!cInn.equals(new BigInteger("0"))){
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray());
        }
        if(i != 10 && i != 12) throw new WrongINNException(inn);
        return true;
    }
}


