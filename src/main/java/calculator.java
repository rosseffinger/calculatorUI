public class calculator {
    String mainNumber="";
    String previousNumber;

    public calculator() {
        this("");
    }

    public calculator(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public String appendToMainNumber(String toAppend) {
        mainNumber += toAppend;
        return mainNumber;
    }

    public void resetMainNumber() {
        mainNumber = "";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public String add(String toAdd) {
        //for (int i = 0; i <; i++) {

        //}
        var mainNumberInteger = Integer.parseInt(previousNumber,10);
        var newNumberInteger = Integer.parseInt(toAdd,10);
        var result = mainNumberInteger + newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }
    public String subtract(String toSubtract) {
        //for (int i = 0; i <; i++) {

        //}
        var mainNumberInteger = Integer.parseInt(previousNumber,10);
        var newNumberInteger = Integer.parseInt(toSubtract,10);
        var result = mainNumberInteger - newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }
    public String divide(String toDivide) {
        //for (int i = 0; i <; i++) {

        //}
        var mainNumberInteger = Integer.parseInt(previousNumber,10);
        var newNumberInteger = Integer.parseInt(toDivide,10);
        var result = mainNumberInteger / newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }
    public String multiply(String toMultiply) {
        //for (int i = 0; i <; i++) {

        //}
        var mainNumberInteger = Integer.parseInt(previousNumber,10);
        var newNumberInteger = Integer.parseInt(toMultiply,10);
        var result = mainNumberInteger * newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }



    public void storeAndResetMainNumber() {
        previousNumber = mainNumber;
        resetMainNumber();
    }
}
