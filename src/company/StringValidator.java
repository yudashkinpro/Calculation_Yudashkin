package company;

public class StringValidator {
    static String[] arabianNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String[] romanianNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public boolean isPatternRight(String q) {
        String stringWithOutSpaces = replace(q);
        if (containsOperation(stringWithOutSpaces)) {
            StringBuilder builder = new StringBuilder();
            builder.append("\\").append(operationType(stringWithOutSpaces));
            if (finalValidation(stringWithOutSpaces, builder.toString())) {
                return true;
            }
        }
       throw new InvalidException();
    }


    public String replace(String stringBeforeReplaces) {
        String s = stringBeforeReplaces.replaceAll(" ", "");
        return s;
    }


    public boolean containsOperation(String u) {
        String[] operations = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            if (u.contains(operations[i])) {
                return true;
            }
        }
        throw  new InvalidException();
    }


    public String operationType(String u) {
        String[] operations = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            if (u.indexOf(operations[i]) != -1) {
                return operations[i];
            }
        }
        return "null";
    }


    public boolean finalValidation(String o, String operationSeparator) {
        String[] mayBeNumbers = o.split(operationSeparator);
        if (mayBeNumbers.length != 2) {
            throw new InvalidException();
        }
        int a = isArabian(mayBeNumbers[0]);
        int r = isRomanian(mayBeNumbers[0]);
        int aa = isArabian(mayBeNumbers[1]);
        int rr = isRomanian(mayBeNumbers[1]);
        return ((a + r + aa + rr) == 2 || (a + r + aa + rr) == 6);
    }


    public int isArabian(String p) {
        for (int i = 0; i < 10; i++) {
            if (p.equalsIgnoreCase(arabianNumbers[i])) {
                return 1;
            }
        }
        return 0;
    }


    public int isRomanian(String p) {
        for (int i = 0; i < 10; i++) {
            if (p.equalsIgnoreCase(romanianNumbers[i])) {
                return 3;
            }
        }
        return 0;

    }


    public boolean containsArabian(String p) {
        for (int i = 0; i < 10; i++) {
            if (p.contains(arabianNumbers[i])) {
                return true;
            }
        }
        return false;
    }

}
