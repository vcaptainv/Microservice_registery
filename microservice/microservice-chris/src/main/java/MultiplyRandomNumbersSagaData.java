import lombok.Data;

@Data
public class MultiplyRandomNumbersSagaData {
    private int number1;
    private int number2;
    private int result;

    public MultiplyRandomNumbersSagaData(int number1, int number2, int result) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public MultiplyRandomNumbersSagaData() {
    }
}
