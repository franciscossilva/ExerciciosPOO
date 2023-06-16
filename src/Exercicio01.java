class produto {
    private String codigobarras;
    private String nome;
    private double preco;
    public produto(String codigobarras, String nome, double preco) {
        this.codigobarras = codigobarras;
        this.nome = nome;
        this.preco = preco;}
    public String getcodigobarras() {
        return codigobarras;
    }public String getnome() {
        return nome;}
    public double getpreco() {
        return preco;}
    public void mostrardetalhesdoproduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;}
        if (obj == null || getClass() != obj.getClass()) {
            return false;}
        Produto other = (Produto) obj;
        return codigobarras.equals(other.codigobarras);}}

class Livro extends Produto {
    private String autor;

    public Livro(String codigobarras, String nome, double preco, String autor) {
        super(codigobarras, nome, preco);
        this.autor = autor;
    }public String getAutor() {
        return autor;}
    @Override
    public void mostrardetalhesdoproduto() {
        super.mostrardetalhesdoproduto();
        System.out.println("Autor: " + autor);}}

class CD extends Produto {
    private int numeroFaixas;

    public CD(String codigobarras, String nome, double preco, int numeroFaixas) {
        super(codigobarras, nome, preco);
        this.numeroFaixas = numeroFaixas; }

    public int getNumeroFaixas() {
        return numeroFaixas;}

    @Override
    public void mostrardetalhesdoproduto() {
        super.mostrardetalhesdoproduto();
        System.out.println("Número de Faixas: " + numeroFaixas);}}

class DVD extends Produto {
    private int duracao;

    public DVD(String codigobarras, String nome, double preco, int duracao) {
        super(codigobarras, nome, preco);
        this.duracao = duracao;}
    public int getDuracao() {
        return duracao; }
    @Override
    public void mostrardetalhesdoproduto() {
        super.mostrardetalhesdoproduto();
        System.out.println("Duração: " + duracao);}}

class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("12211", "Livro 01", 2419.99, "Autor 01");
        produtos[1] = new CD("23456dasdsa7", "CD 01", 179.99, 312);
        produtos[2] = new DVD("3456sdv78", "DVD 01", 189.99, 1200);
        produtos[3] = new Livro("4dfsf56789", "Livro 02", 2114.99, "Autor 02");
        produtos[4] = new DVD("56vvc7890", "DVD 02", 292.99, 40);

        for (Produto produto : produtos) {
            produto.ostrardetalhesdoproduto();
            System.out.println("");}

        buscarProduto(produtos, new Produto("123456", "", 0.0));
        buscarProduto(produtos, new Produto("999999", "", 0.0));}

    public static void buscarProduto(Produto[] produtos, Produto produtoBuscado) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals(produtoBuscado)) {
                System.out.println("Produto encontrado na posição: " + i);
                return;}}

        System.out.println("Produto não encontrado.");}}