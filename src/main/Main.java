package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {



        BufferedImage img;

        try{
            img = ImageIO.read(new File("src/img/campo.jpg"));




        int[] medidasImage = {img.getHeight(),img.getWidth()};

        for (int j = 0; j < medidasImage[0]; j++) {
            for (int i = 0; i < medidasImage[1]; i++) {

                Color pixel = new Color(img.getRGB(i,j));
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                int media = (red + green + blue) / 3;

                Color novaCor = new Color(media,media,media);
                img.setRGB(i,j,novaCor.getRGB());


            }
        }


        ImageIO.write(img,"jpg",new File("src/img/out/campoBW.jpg"));
        System.out.println("Imagem convertida com sucesso!");

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
