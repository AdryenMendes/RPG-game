public class Main {
    public static void main(String[] args) {
        // Como Personagem agora é abstract, não podemos dar "new Personagem"
        // Temos que criar um Guerreiro ou Mago
        Personagem p1 = new Guerreiro("Aragorn", 100, 20, 30);
        Personagem p2 = new Guerreiro("Orc", 50, 10, 0);

        p1.atacar(p2);

        // ERRO CORRIGIDO: Usamos getVida() em vez de .vida
        System.out.println("Vida do Orc: " + p2.getVida());
    }
}