public class Teste02 {

    private int number;

    Teste02(int number){
        this.number = number;
    }
    public String checkFibonacci() {
        int n1 = 0, n2 = 1;
        while (n2 < number){
            int n = n2;
            n2 += n1;
            n1 = n;
        }
        if(n2 == number || number == 0){
            return String.format("%d FAZ PARTE DA SEQUÊNCIA DE FIBONACCI", number);
        }
        return String.format("%d NÃO FAZ PARTE DA SEQUÊNCIA DE FIBONACCI", number);

    }
}
