public abstract class Personagem { // Vamos tornar abstrata como planejamos!
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public int getVida()  { return this.vida; }
    public String getNome() { return this.nome; } 
    public int getForca()  { return this.forca; }


    // mecaninca de receber dano
    public void receberDano(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Erro: dano não pode ser negativo");
            return; 
        }
        this.vida -= quantidade;

        if (this.vida < 0) {
            this.vida = 0;
        }
        if (this.vida == 0) {
            System.out.println(this.nome + " foi derrotado!"); 
        }
    }

    // abstract pra os filhos decidirem o ataque
    public abstract void atacar(Personagem alvo); 
}