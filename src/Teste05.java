public class Teste05 {

    private String text;

    public Teste05(String text){
        this.text = text;
    }

    public String getReverseString(){
        String result = "STRING REVERSA: ";
        for(int i = text.length(); i > 0; i--){
            result += String.format("%s", text.charAt(i - 1));
        }

        return result;
    }
}
