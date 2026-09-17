public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int vida, int forca, int mana) {
        super(nome, vida, forca);
        this.mana = mana;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (mana >= 10) {
            System.out.println(getNome() + " lança uma BOLA DE FOGO em " + alvo.getNome());
            alvo.receberDano(getForca() + 15); // magia da mais dano
            mana -= 10;
        } else {
            System.out.println(getNome() + " está sem mana e deu um tapa fraco...");
            alvo.receberDano(1);
        }
    }

    // add mecanica de gasto e recebimento passivo de mana
}