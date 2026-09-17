public class Personagem {
    public String nome;
    public int vida;
    public int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;                                              // parametro a recebe valor no a
        this.vida = vida;       
        this.forca = forca;
    }

    // Método de ataque simples
    public void atacar(Personagem alvo) {                               // ex: paladino dragao
        System.out.println(this.nome + " atacou " + alvo.nome);         // printar "paladino atacou dragao"
        alvo.vida = alvo.vida - this.forca;                             // vida do alvo = vida base - dano
    }
}
