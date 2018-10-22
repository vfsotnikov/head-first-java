package chapter02.game;

public class GuessGame {
    private Player player1;
    private Player player2;
    private Player player3;

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число 0..9");

        while (true) {
            System.out.println("Число, которое нужно угадать, - это " + targetNumber);

            player1.guess();
            player2.guess();
            player3.guess();

            System.out.println("Первый игрок думает, что это " + player1.getNumber());
            System.out.println("Второй игрок думает, что это " + player2.getNumber());
            System.out.println("Третий игрок думает, что это " + player3.getNumber());

            boolean isRight = false;

            if (targetNumber==player1.getNumber()) {
                System.out.println("Первый игрок угадал!");
                isRight=true;
            }
            if (targetNumber==player2.getNumber()){
                System.out.println("Второй игрок угадал!");
                isRight=true;
            }
            if (targetNumber==player3.getNumber()) {
                System.out.println("Третий игрок угадал!");
                isRight=true;
            }
            if (isRight){
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз");
            }
        }
    }
}
