package services;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader {

    private BufferedImage img = null;


    public ImageReader(String path) throws IOException {

        this.img = ImageIO.read(new File(path));
    }

    public int getWidth(){
        return img.getWidth();
    }

    public int getHeight(){
        return img.getHeight();
    }

    public Color getPixelColor(int x, int y){

        return new Color(img.getRGB(x,y));
        
    }

}
