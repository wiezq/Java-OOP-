package nine;

import java.math.BigInteger;

public class WrongINNException extends Exception{
    private BigInteger innNum;

    public WrongINNException(BigInteger inn){
        super("Номер ИНН: "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
