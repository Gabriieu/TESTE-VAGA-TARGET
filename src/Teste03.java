public class Teste03 {

    public String a() {
        int ratio = 2; //a razão é a soma do último número + 2, iniciando por 1, portanto são os números ímpares
        String result = "EXERCÍCIO 3 (a): A SEQUÊNCIA É ";
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                result += String.format("%d,", i + ratio);
            }
        }
        return result + "...";
    }

    public String b() {
        //multiplicacao por 2
        String result = "EXERCÍCIO 3 (b): A SEQUÊNCIA É ";
        for (int i = 2; i < 1000; i *= 2) {
            result += String.format("%d,", i);
        }
        return result + "...";
    }

    public String c() {
        //quadrado do último número indo de 1 em 1
        String result = "EXERCÍCIO 3 (c): A SEQUÊNCIA É ";
        for (int i = 0; i < 10; i++) {
            result += String.format("%d,", (int) Math.pow(i, 2));
        }
        return result + "...";
    }

    public String d() {
        //quadrado dos números pares
        String result = "EXERCÍCIO 3 (d): A SEQUÊNCIA É ";
        for (int i = 2; i < 20; i += 2) {
            result += String.format("%d,", (int) Math.pow(i, 2));
        }
        return result + "...";
    }

    public String e() {
        //é a soma do último número com o penúltimo
        String result = "EXERCÍCIO 3 (e): A SEQUÊNCIA É ";
        int n1 = 0, n2 = 1;
        while (n2 < 15){
            int n = n2;
            n2 += n1;
            n1 = n;
            result += String.format("%d,", n2);
        }
        return result + "...";
    }

    public String f() {
        //são os números que começam com a letra 'D'
        return "EXERCÍCIO 3 (f): A SEQUÊNCIA É 2,10, 12, 16, 17, 18, 19, 200,...";
    }
}
