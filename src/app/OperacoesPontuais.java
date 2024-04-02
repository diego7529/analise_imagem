package app;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class OperacoesPontuais {
    public static BufferedImage bandaRed(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                Color novaCor = new Color(red, 0, 0);
                imgSaida.setRGB(w, h, novaCor.getRGB());

            }
        }
        return imgSaida;
    }

    public static BufferedImage bandaGreen(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int green = cor.getGreen();
                Color novaCor = new Color(0, green, 0);
                imgSaida.setRGB(w, h, novaCor.getRGB());

            }
        }
        return imgSaida;
    }

    public static BufferedImage bandaBlue(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int blue = cor.getBlue();
                Color novaCor = new Color(0, 0, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());

            }
        }
        return imgSaida;
    }

    public static BufferedImage negativo(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(255 - red, 255 - green, 255 - blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());

            }
        }
        return imgSaida;
    }

    public static BufferedImage cinzaRed(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                Color novaCor = new Color(red, red, red);
                imgSaida.setRGB(w, h, novaCor.getRGB());

            }
        }
        return imgSaida;
    }

    public static BufferedImage cinzaGreen(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int green = cor.getGreen();
                Color novaCor = new Color(green, green, green);
                imgSaida.setRGB(w, h, novaCor.getRGB());

            }
        }
        return imgSaida;
    }

    public static BufferedImage cinzaBlue(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int blue = cor.getBlue();
                Color novaCor = new Color(blue, blue, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());

            }
        }
        return imgSaida;
    }

    public static BufferedImage cinzaMedia(BufferedImage imgEntrada) {
        int altura = imgEntrada.getHeight();
        int largura = imgEntrada.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int media = (red + green + blue) / 3;
                Color novaCor = new Color(media, media, media);
                imgSaida.setRGB(w, h, novaCor.getRGB());

            }
        }
        return imgSaida;
    }

    public static BufferedImage binarizacao(BufferedImage imgEntrada, int limiar) {
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
  
        for(int h = 0; h < altura; ++h) {
           for(int w = 0; w < largura; ++w) {
              int rgb = imgEntrada.getRGB(w, h);
              Color cor = new Color(rgb);
              int media = (cor.getRed() + cor.getGreen() + cor.getBlue()) / 3;
              int novoValor = media > limiar ? 255 : 0;
              Color novaCor = new Color(novoValor, novoValor, novoValor);
              imgSaida.setRGB(w, h, novaCor.getRGB());
           }
        }
  
        return imgSaida;
     }
  
     public static BufferedImage alteraTonalidade(BufferedImage imgEntrada, String banda, int valor) {
        boolean isRed = banda.equalsIgnoreCase("red");
        boolean isGreen = banda.equalsIgnoreCase("green");
        boolean isBlue = banda.equalsIgnoreCase("blue");
        if (!isRed && !isGreen && !isBlue) {
           throw new IllegalArgumentException("Banda inválida");
        } else {
           int largura = imgEntrada.getWidth();
           int altura = imgEntrada.getHeight();
           BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
  
           for(int h = 0; h < altura; ++h) {
              for(int w = 0; w < largura; ++w) {
                 int rgb = imgEntrada.getRGB(w, h);
                 Color cor = new Color(rgb);
                 int red = cor.getRed();
                 int green = cor.getRed();
                 int blue = cor.getBlue();
                 if (banda.equalsIgnoreCase("red")) {
                    red = validaLimiteRGB(red, valor);
                 }
  
                 if (banda.equalsIgnoreCase("green")) {
                    green = validaLimiteRGB(green, valor);
                 }
  
                 if (banda.equalsIgnoreCase("blue")) {
                    blue = validaLimiteRGB(blue, valor);
                 }
  
                 cor = new Color(red, green, blue);
                 imgSaida.setRGB(w, h, cor.getRGB());
              }
           }
  
           return imgSaida;
        }
     }
  
     public static BufferedImage brilhoAditivo(BufferedImage imgEntrada, int valor) {
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
  
        for(int h = 0; h < altura; ++h) {
           for(int w = 0; w < largura; ++w) {
              int rgb = imgEntrada.getRGB(w, h);
              Color cor = new Color(rgb);
              int red = cor.getRed();
              int green = cor.getGreen();
              int blue = cor.getBlue();
              red = validaLimiteRGB(red, valor);
              green = validaLimiteRGB(green, valor);
              blue = validaLimiteRGB(blue, valor);
              Color novaCor = new Color(red, green, blue);
              imgSaida.setRGB(w, h, novaCor.getRGB());
           }
        }
  
        return imgSaida;
     }
  
     public static BufferedImage brilhoMultiplicativo(BufferedImage imgEntrada, float valor) {
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
  
        for(int h = 0; h < altura; ++h) {
           for(int w = 0; w < largura; ++w) {
              int rgb = imgEntrada.getRGB(w, h);
              Color cor = new Color(rgb);
              int red = cor.getRed();
              int green = cor.getGreen();
              int blue = cor.getBlue();
              red = validaLimiteRGB(red, valor);
              green = validaLimiteRGB(green, valor);
              blue = validaLimiteRGB(blue, valor);
              Color novaCor = new Color(red, green, blue);
              imgSaida.setRGB(w, h, novaCor.getRGB());
           }
        }
  
        return imgSaida;
     }

    public static BufferedImage RGBtoYIQ(BufferedImage imgEntrada){
        int width = imgEntrada.getWidth();
        int height = imgEntrada.getHeight();

        BufferedImage yiqImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = imgEntrada.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;

                double yValue = 0.299 * r + 0.587 * g + 0.114 * b;
                double iValue = 0.59590059 * r - 0.27455667 * g - 0.32134392 * b;
                double qValue = 0.21153661 * r - 0.52273617 * g + 0.31119955 * b;

                yValue = Math.min(Math.max(yValue, 0), 255);
                iValue = Math.min(Math.max(iValue, 0), 255);
                qValue = Math.min(Math.max(qValue, 0), 255);

                int yiq = ((int) yValue << 16) | ((int) iValue << 8) | (int) qValue;

                yiqImage.setRGB(x, y, yiq);
            }
        }
        return yiqImage;
        }


  
     private static int validaLimiteRGB(int banda, int acrescimo) {
        banda += acrescimo;
        if (banda > 255) {
           banda = 255;
        } else if (banda < 0) {
           banda = 0;
        }
  
        return banda;
     }

  
     private static int validaLimiteRGB(int banda, float acrescimo) {
        banda = (int)((float)banda * acrescimo);
        if (banda > 255) {
           banda = 255;
        } else if (banda < 0) {
           banda = 0;
        }
  
        return banda;
     }
  }
  