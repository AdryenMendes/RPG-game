public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Aragorn", 100, 20);
        Personagem p2 = new Personagem("Orc", 50, 10);

        p1.atacar(p2);
        
        p2.vida = -500; 
        p2.forca = 999999; 

        System.out.println("Vida do Orc: " + p2.vida);
    }
}
