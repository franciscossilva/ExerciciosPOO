interface lampada {
    void ligar();
    void desligar();
}

class Incandescente implements lampada {
    @Override
    public void ligar() {
        System.out.println("Lâmpada ligada é incandescente.");}

    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada é incandescente.");}}

class Fluorescente implements lampada {
    @Override
    public void ligar() {
        System.out.println("Lâmpada ligada é fluorescente .");}

    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada é fluorescente .");}}

class FabricaLampada {
    public Lampada construir(String tipoLampada) {
        if (tipoLampada.equalsIgnoreCase("incandescente")) {
            return new Incandescente();
        } else if (tipoLampada.equalsIgnoreCase("fluorescente")) {
            return new Fluorescente();
        } else {
            throw new IllegalArgumentException("Tipo de lâmpada inválido.");}}}

public class Exercicio01 {
    public static void main(String[] args) {
        FabricaLampada fabrica = new FabricaLampada();

        System.out.println("Qual tipo de lâmpada você quer construir? incandescente ou fluorescente)");
        String tipoLampada = System.console().readLine();

        Lampada lampada = fabrica.construir(tipoLampada);
        lampada.ligar();
        lampada.desligar();}}