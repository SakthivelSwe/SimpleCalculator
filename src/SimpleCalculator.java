public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double adding = firstNumber + secondNumber;
        return adding;
    }

    public double getSubtractionResult() {
        double subtracting = firstNumber - secondNumber;
        return subtracting;
    }

    public double getMultiplicationResult() {
        double multiplying = firstNumber * secondNumber;
        return multiplying;
    }

    public double getDivisionResult() {
        double dividing = 0;
        if(firstNumber == 0 || secondNumber == 0) {
            dividing = 0.0;
        } else {
            dividing = firstNumber / secondNumber;
        }
        return dividing;
    }

}