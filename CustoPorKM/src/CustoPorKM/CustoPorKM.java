package CustoPorKM;

import java.util.Scanner;

public class CustoPorKM {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Consumo do carro (Km/L): ");
        float consumo = s.nextFloat();
        System.out.println("Preço do combustível (R$): ");
        float preco = s.nextFloat();
        float rkm = preco / consumo;
        System.out.println(rkm + " R$/Km ");

        System.out.println("Distância pecorrida (Km): ");
        float d = s.nextFloat();
        float p1 = rkm * d;
        System.out.println("Custo parcial1 por Km: " + p1 + " (R$/Km) ");

        System.out.println("Custo extra (R$) (Ex.:Estacionamento): ");
        float ce = s.nextFloat();

        float p2 = ce / d;
        System.out.println("Custo parcial2: " + p2 + " (R$/km) ");

        float t = p1 + p2;
        System.out.println("Custo total: " + t + " (R$/Km) ");

        System.out.println("O volume de objetos (bagagens e compras) é maior? (1-Sim/2-Não) ");
        int objetos = s.nextInt();

        System.out.println("Vai sozinho? (1-Sim/2-Não) ");
        int sozinho = s.nextInt();

        if (objetos == 1 && sozinho == 1){
            System.out.println("Use o carro ou use o aplicativo(Uber ou 99). ");

        }else if (objetos == 1 && sozinho == 2){
            System.out.println("Use o carro. ");

        }else if (objetos == 2 && sozinho == 2){
            System.out.println("Use o carro. ");

        }else{
            System.out.println("Vá de ônibus. ");
        }

    }
}
