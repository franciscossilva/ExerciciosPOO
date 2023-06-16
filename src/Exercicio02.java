abstract class forma {
    public abstract float calcularArea();

    public abstract float calcularPerimetro();
}class Retangulo extends Forma {
    private float lado;
    private float altura;
    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;}

    public float getLado()
    {return lado;}

    public float getAltura()
    {return altura;}
    @Override
    public float calcularArea()
    {return lado * altura;}
    @Override
    public float calcularPerimetro() {
        return 2* (lado + altura);}}

class Circulo extends Forma {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;}
    public float getRaio() {
        return raio;}
    @Override
    public float calcularArea() {
        return (float) (Math.PI * raio * raio);}
    @Override
    public float calcularPerimetro() {
        return (float) (2* Math.PI * raio);}}

class Quadrado extends Retangulo {
    public Quadrado(float lado) {
        super(lado,lado);}}

public class testeFormas {
    public static void main(String[] args) {
        Forma[]formas = new Forma[5];

        formas[0] = new retangulo(8f, 3.5f);
        formas[1] = new circulo(9.0f);
        formas[2] = new quadrado(44.0f);
        formas[3] = new circulo(2.8f);
        formas[4] = new retangulo(7.8f, 6.9f);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("");}}}