import javax.swing.JPanel;
import javax.swing.Timer; // Timer para a animação
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaJogo extends JPanel implements ActionListener {
    private BufferedImage spriteSheet;
    private int frameAtual = 0;
    private int totalFrames = 8; // n de bonecos na linha
    
    // cordenadas
    private int larguraFrame = 220; 
    private int alturaFrame = 256;
    private int xInicial = 0;
    private int yInicial = 80;
    private int larguraPulo = 32; // pulo entre cada frame

    public TelaJogo() {
        try {
            spriteSheet = ImageIO.read(new File("ninja.png"));
            
            // timer para animação
            Timer timer = new Timer(256, this);
            timer.start();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // função chamada a cada tick
    @Override
    public void actionPerformed(ActionEvent e) {
        frameAtual++;
        if (frameAtual >= totalFrames) {
            frameAtual = 0; // voltar pro primeiro frame - loop
        }
        repaint(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (spriteSheet != null) {
            // Calculamos o X baseando-se no pulo, não necessariamente no tamanho do recorte
            int posXNoSheet = xInicial + (frameAtual * larguraPulo);
            
            // proteção p nao tentar recortar fora da imagem
            if (posXNoSheet + larguraFrame <= spriteSheet.getWidth()) {
                
                BufferedImage frameCorte = spriteSheet.getSubimage(
                    posXNoSheet, yInicial, larguraFrame, alturaFrame
                );

                // desenha na tela
                g.drawImage(frameCorte, 100, 100, 220, 256, null);
                
                // DEBUG: Desenha um retângulo verde ao redor para ajudar a alinhar
                g.setColor(java.awt.Color.GREEN);
                g.drawRect(100, 100, 220, 256);
            }
        }
    }
}