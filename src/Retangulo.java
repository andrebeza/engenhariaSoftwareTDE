class Retangulo {
    private int base;
    private int altura;
    private int length;

    private double inches;

    public Retangulo(int base,int altura){
        this.altura= altura;
        this.base = base;
    }

    public Retangulo(int base, int altura, int length) {
        this.base = base;
        this.altura = altura;
        this.length = length;
    }


    public int calcularArea(){
        return base * altura;
    }
    public int calcularPerimetro(){
        return 2*base + 2* altura;
    }
    public int calcVolume(){
        return altura * base * length;
    }

}
