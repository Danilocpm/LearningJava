public class printDifferences {
    public static void main(String[] args) {
        // O println quebra a linha encerrando o conteudo dela no final, ja o print nao
        System.out.println("Ola");
        System.out.println("Mundo!");
        System.out.println("-----------------");
        System.out.print("Ola ");
        System.out.print("Mundo!");
        System.out.println(" ");
        System.out.println("-----------------");
        System.out.print("Ola ");
        System.out.println("Mundo!");

        int num = 5;
        double num2 = 5.56789;

        System.out.println(num);
        System.out.println(num2);

        // Se eu quiser formatar o numero de decimais posso usar printf
        System.out.printf("%.2f%n", num2); // limitou 2 casas decimais e ainda formatou + quebrou a linha



    }

}
