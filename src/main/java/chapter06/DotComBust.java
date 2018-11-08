package main.java.chapter06;

import java.util.ArrayList;
import java.util.List;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private List<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame (){
//        Создадим несколько сайтов и присвоим им адреса
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Ваша цель потопить три \"сайта\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet: dotComList){
            List<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying (){
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход (A-G)+(0-6)");
            checkUserGuess(userGuess);
        }
        finishGame ();
    }

    private void checkUserGuess (String userGuess){
        numOfGuesses++;
        String result = "Мимо";

        for (DotCom dotComToTest: dotComList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")){
                break;
            }
            if (result.equals("Потопил")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Все \"сайты\" ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses<=18){
            System.out.println("Это заняло у вас всего "+numOfGuesses+" попыток");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");
        } else {
            System.out.println("Это заняло у вас довольно много времени. "+numOfGuesses+" попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
