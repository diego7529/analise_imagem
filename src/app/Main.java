package app;
import java.awt.image.BufferedImage;
import java.util.Scanner;

import static app.OperacoesPontuais.RGBtoYIQ;

public class Main {
    public static void main(String[] args) {
        BufferedImage imagem = ManipulaImagem.abrirImagem("lena.png");

        ManipulaImagem.exibirImagem(
                imagem,
                 //OperacoesPontuais.bandaRed(imagem),
                 //OperacoesPontuais.bandaGreen(imagem),
                 //OperacoesPontuais.bandaBlue(imagem),
                 //OperacoesPontuais.negativo(imagem),
                 //OperacoesPontuais.cinzaRed(imagem),
                 //OperacoesPontuais.cinzaGreen(imagem),
                 //OperacoesPontuais.cinzaBlue(imagem),
                 //OperacoesPontuais.cinzaMedia(imagem),
                 //OperacoesPontuais.binarizacao(imagem, 100),
                 //OperacoesPontuais.alteraTonalidade(imagem, "blue", 100),
                 //OperacoesPontuais.brilhoAditivo(imagem, 100),
                 //OperacoesPontuais.brilhoMultiplicativo(imagem, 0.5f)
                 OperacoesPontuais.RGBtoYIQ(imagem)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome que voce deseja para salvar a foto: ");
        String nome = scanner.nextLine();


        ManipulaImagem.salvarImagem(
                imagem,
                //OperacoesPontuais.bandaRed(imagem),
                //OperacoesPontuais.bandaGreen(imagem),
                //OperacoesPontuais.bandaBlue(imagem),
                //OperacoesPontuais.negativo(imagem),
                //OperacoesPontuais.cinzaRed(imagem),
                //OperacoesPontuais.cinzaGreen(imagem),
                //OperacoesPontuais.cinzaBlue(imagem)
                //OperacoesPontuais.cinzaMedia(imagem),
                //OperacoesPontuais.binarizacao(imagem, 100),
                //OperacoesPontuais.alteraTonalidade(imagem, "blue", 100),
                //OperacoesPontuais.brilhoAditivo(imagem, 100),
                //OperacoesPontuais.brilhoMultiplicativo(imagem, 0.5f)
                "png", "C:\\Users\\diego\\OneDrive\\Imagens\\"+ nome );
    }
}
