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

    public static BufferedImage aditivoBandaY(BufferedImage imgEntrada, int valor){
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0; h < altura; ++h) {
            for(int w = 0; w < largura; ++w) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                double[] yiq = RGBParaYIQ(cor);
                yiq[0] = validaLimiteRGB((int)yiq[0], valor);
                Color novaCor = YIQParaRGB(yiq);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }

        return imgSaida;
    }

    public static BufferedImage multiplicativoBandaY(BufferedImage imgEntrada, float valor){
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0; h < altura; ++h) {
            for(int w = 0; w < largura; ++w) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                double[] yiq = RGBParaYIQ(cor);
                yiq[0] = validaLimiteRGB((int)yiq[0], valor);
                Color novaCor = YIQParaRGB(yiq);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }

        return imgSaida;
    }

    public static BufferedImage negativoBandaY(BufferedImage imgEntrada){
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for(int h = 0; h < altura; ++h) {
            for(int w = 0; w < largura; ++w) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                double[] yiq = RGBParaYIQ(cor);
                yiq[0] = 255 - yiq[0];
                Color novaCor = YIQParaRGB(yiq);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }

        return imgSaida;
    }

    private static double[] RGBParaYIQ(Color color){
        double r = color.getRed();
        double g = color.getGreen();
        double b = color.getBlue();

        double y = 0.299 * r + 0.587 * g + 0.114 * b;
        double i = 0.596 * r - 0.275 * g - 0.321 * b;
        double q = 0.212 * r - 0.528 * g + 0.311 * b;

        return new double[]{y, i, q};
    }

    private static Color YIQParaRGB(double[] yiq){
        double y = yiq[0];
        double i = yiq[1];
        double q = yiq[2];

        int r = validaBanda((int) (y + 0.956 * i + 0.621 * q));
        int g = validaBanda((int) (y - 0.272 * i - 0.647 * q));
        int b = validaBanda((int) (y - 1.106 * i + 1.703 * q));

        return new Color(r, g, b);
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

    private static int validaBanda(int banda){
        if(banda > 255)
            return 255;
        if(banda < 0)
            return 0;
        return banda;
    }
  }
  