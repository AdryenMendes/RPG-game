// guerreiro herda de personagem
public class Guerreiro extends Personagem {
    private int escudo;

    public Guerreiro(String nome, int vida, int forca, int escudo) {
        super(nome, vida, forca);
        this.escudo = escudo;
    }
    
    public void usarEscudo() {
        System.out.println(getNome() + "subiu o escudo de" + escudo + "pontos");
    }

    @Override 
    public void atacar(Personagem alvo) {
        // guerreiro da 5 de dano extra
        System.out.println(getNome() + " golpeia pesadamente com sua espada");
        alvo.receberDano(this.getForca() + 5); 
    }


    // add mecanica de uso de escudo
}