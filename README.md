# BlackWhite-Changer

# Image Black and White Converter

## About the project

This Java application converts colored images into black and white images (grayscale).

The program uses the `BufferedImage` class to manipulate the image pixel by pixel. Each pixel contains RGB color values (red, green, and blue), which are analyzed to generate a new grayscale color.

## How it works

The process performed by the application is:

1. The original image is loaded using the `ImageIO` class.

2. The image dimensions, such as height and width, are obtained.

3. The program iterates through all pixels of the image using loop structures.

4. For each pixel, the RGB color values are extracted:

- Red
- Green
- Blue

5. The average value of the three colors is calculated:

average = (red + green + blue) / 3

6. The calculated value is used to create a new grayscale color, where the red, green, and blue values receive the same value.

7. The original pixel is replaced with the new color using the `setRGB()` method.

8. After processing all pixels, the modified image is saved as a new file.

## Technologies used

- Java
- `javax.imageio` library for reading and writing image files.
- `BufferedImage` class for pixel manipulation.
- `Color` class for RGB color handling.

## Project structure

```
src
├── img
│   ├── campo.jpg        # Imagem original utilizada na aplicação
│   └── out
│       └── campoBW.jpg  # Imagem convertida para preto e branco
│
└── main
    └── Main.java        # Classe principal da aplicação
```

## How to run

1. Make sure you have the Java JDK installed.

2. Place the image you want to convert inside the folder:

src/img/

3. Change the image path in the code if necessary:

ImageIO.read(new File("src/img/campo.jpg"));

4. Run the `Main` class.

5. After execution, the converted image will be created at:

src/img/out/campoBW.jpg

## Example

Original image:

campo.jpg

Generated image:

campoBW.jpg

The final image will have all pixels converted into different shades of gray, removing the original colors.
