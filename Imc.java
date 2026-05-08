public class Imc{
    public static void main(String[] args){
        double peso = 0;
        double altura = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual é o seu peso? ");
        peso = leitura.nextDouble();
        System.out.println("Qual é a sua altura? ");
                altura = leitura.nextDouble();
        double imc = peso/(altura*altura);

        if (imc <= 18.4){
            System.out.println("Seu imc é "+ imc + "seu peso está abaixo do recomendado");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu imc é "+ imc + "você está no peso ideal");
        }
        else if(imc >= 25.0 && imc <= 29.9 ){
            System.out.println("Seu imc é "+ imc + "seu peso está acima do recomendado");
        }
        else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Seu imc é "+ imc + "você está na obesidade classe 1");
        }
        else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Seu imc é "+ imc + "você está na obesidade classe 2");
        }
        else{
            System.out.println("Seu imc é "+ imc + "você está na obesidade classe 3");
        }
    }
}