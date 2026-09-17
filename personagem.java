public class Personagem {
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;                                              // parametro a recebe valor no a
        this.vida = vida;       
        this.forca = forca;
    }

    public int getVida()  { return this.vida;  }
    public string getNome() { return this.nome; }
    public int getForca()  { return this.forca; }

    
    // receber dano
    public void receberDano(int quantidade) {
        if (quantidade < 0) {
            system.out.println("Erro: dano nÃ£o pode ser negativo")
            return
        }
        this.vida -= quantidade;

        if (this.vida < 0){
            this.vida = 0
            system.out.println(this.nome + "foi derrotado")
        }
    }


    // ataque simples
    public void atacar(Personagem alvo) {                               // ex: paladino dragao
        System.out.println(this.nome + " atacou " + alvo.nome);         // printar "paladino atacou dragao"
        alvo.vida = alvo.vida - this.forca;                             // vida do alvo = vida base - dano
    }
}
