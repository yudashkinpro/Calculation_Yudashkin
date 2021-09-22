package company;

import java.util.ArrayList;
import java.util.List;

public class NumberFactory {

    public Arabian arabianInit(String[] strings) {
        Arabian pair = new Arabian();
        pair.setFirstNumber(Integer.parseInt(strings[0]));
        pair.setSecondNumber(Integer.parseInt(strings[1]));
        return pair;
    }

    public  void arabianExec(Arabian pair, String operationType) {
        switch (operationType){
            case "+":
                System.out.println(pair.firstNumber + pair.secondNumber);
                break;
            case "-":
                System.out.println(pair.firstNumber - pair.secondNumber);
                break;
            case "/":
                System.out.println(pair.firstNumber / pair.secondNumber);
                break;
            case "*":
                System.out.println(pair.firstNumber * pair.secondNumber);
                break;
        }
    }

    public List<RomanNumber> romanianInit(String[] strings) {
        RomanNumber a = new RomanNumber(strings[0]);
        RomanNumber b = new RomanNumber(strings[1]);
        List<RomanNumber> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }

    public  void romanianExec(List<RomanNumber> list, String operationType) {
        switch (operationType){
            case "+":
                System.out.println(list.get(0).plus(list.get(1)));
                break;
            case "-":
                System.out.println(list.get(0).minus(list.get(1)));
                break;
            case "/":
                System.out.println(list.get(0).dvd(list.get(1)));
                break;
            case "*":
                System.out.println(list.get(0).multplay(list.get(1)));
                break;
        }
    }

}
