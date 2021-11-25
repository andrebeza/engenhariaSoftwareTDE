public class piramide {
    private int base;
    private int altura;


    public piramide(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int piramideVolume(){
        return (base * altura) / 3;
    }
}
