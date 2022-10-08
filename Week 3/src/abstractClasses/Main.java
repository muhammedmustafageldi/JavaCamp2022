package abstractClasses;

public class Main {
    public static void main(String args[]){

        GameCalculator [] gameCalculators = new GameCalculator[]{new ManGameCalculator(),new WomanGameCalculator(),new KidsCalculator()};
        for (GameCalculator gameCalculator : gameCalculators){
            gameCalculator.calculate();
            gameCalculator.gameOver();
        }



    }
}
