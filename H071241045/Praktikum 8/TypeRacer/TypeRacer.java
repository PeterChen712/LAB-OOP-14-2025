package TypeRacer;

import java.util.ArrayList;
import java.util.Random; 

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> rareContestant = new ArrayList<>();
    private ArrayList<Result> rareStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRareContestant() {
        return rareContestant;
    }

    private String[] wordsToTypeList = {
        "Dia jadi koki masaknya krabby patty, menjalani hari hidup bersama Garry",
        "Di Bikini Bottom ada Spongebob Squarepants, dia memang keren suka main drumband",
        "Ayo sama-sama sebutkan nama-nama makhluk dalam sana di Bikini Bottom jaya",
        "Namun ada juga namanya Patrick Star, walau dia cetar tapi hidupnya liar",
        "Tinggal dalam batu tapi suka membantu, sayang hanya satu otaknya itu buntu"
    };

    public void setNewWordsToType() {
        Random random = new Random(); 
        int index = random.nextInt(wordsToTypeList.length); 
        wordsToType = wordsToTypeList[index]; 
    }

    public synchronized void addResult(Result result) {
        rareStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        rareStanding.sort((r1, r2) -> Integer.compare(r1.getFinishTime(), r2.getFinishTime()));
        int pos = 1;
        for (Result r : rareStanding) {
            System.out.println(pos + ". " + r.getName() + " = " + r.getFinishTime() + " detik");
            pos++;
        }
    }

    public void startRace() {
        for (Typer t : rareContestant) {
            t.start();
        }
    }

    public void displayRaceStandingPeriodically() throws InterruptedException {
        while (rareStanding.size() < rareContestant.size()) {
            System.out.println("\nTyping Progress...");
            System.out.println("===================");
            for (Typer t : rareContestant) {
                System.out.println("-" + t.getBotName() + " => " + t.getWordsTyped());
            }
            Thread.sleep(2000);
        }

        printRaceStanding();
    }
}