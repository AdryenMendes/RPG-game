import javax.swing.JFrame;

public class JanelaPrincipal {
    public static void main(String[] args) {
        JFrame janela = new JFrame("RPG Auto-Battler");
        
        TelaJogo tela = new TelaJogo();
        janela.add(tela); // coloca o canvas dentro da moldura

        janela.setSize(800, 600); // tamanho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha o processo ao clicar no X
        janela.setLocationRelativeTo(null); // centraliza na tela
        janela.setVisible(true); // torna a janela visível
    }
}