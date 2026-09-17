import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SpriteSheet {
    private BufferedImage sheet;

    public SpriteSheet(String caminho) {
        try {
            // carrega a imagem guerreiro
            sheet = ImageIO.read(new File(caminho));
        } catch (IOException e) {
            System.err.println("erro: não foi possivel carregar o sprite");
            e.printStackTrace();
        }
    }

    // p cortar um quadrado da imagem
    public BufferedImage getSprite(int x, int y, int largura, int altura) {
        return sheet.getSubimage(x, y, largura, altura);
    }
}