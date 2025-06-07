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

    // Bisa diganti sesuai keinginan masing-masing
    private String[] wordsToTypeList = {
            "Di Bikini Bottom ada Spongebob Squarepants, dia memang keren suka main drumband",
            "Dia jadi koki masaknya krabby patty, menjalani hari hidup bersama Garry",
            "Ayo sama-sama sebutkan nama-nama makhluk dalam sana di Bikini Bottom jaya",
            "Namun ada juga namanya Patrick Star, walau dia cetar tapi hidupnya liar",
            "Tinggal dalam batu tapi suka membantu, sayang hanya satu otaknya itu buntu"
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO (4)
    // Buat method addResult yang mana digunakan untuk menambahkan typer yang
    // telah selesai (mengetik semua kata), ke dalam list race standing.

    public void addResult(Typer typer, double timeInSeconds) {
        rareStanding.add(new Result(typer.getBotName(),(int) timeInSeconds));
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // TODO (5)
        // Tampilkan klasemen akhir dari kompetisi, dengan format
        // {posisi}. {nama} = {waktu penyelesaian dalam detik} detik
        rareStanding.sort((r1, r2) -> Double.compare(r1.getFinishTime(), r2.getFinishTime()));

        int position = 1;
        for (Result result : rareStanding) {
            System.out.printf("%d. %s = %d detik\n", position++, result.getName(), result.getFinishTime());
        }
    }

    public void startRace() {
        // TODO (6)
        // Jalankan kompetisi untuk tiap kontestan
        for (Typer typer : rareContestant) {
            typer.start();
        }
    }

    // TODO (7)
    // selama semua peserta belum selesai maka tampilkan typing progress-nya setiap
    // 2 detik, dengan format:
    // Typing Progress ...
    // ===================
    // {nama kontestan} => {text yang telah dia ketik}
    // {nama kontestan} => {text yang telah dia ketik}
    // {nama kontestan} => {text yang telah dia ketik}
    public void displayRaceStandingPeriodically() throws InterruptedException {
        while (rareStanding.size() < rareContestant.size()) {
            System.out.println("\nTyping Progress ...");
            System.out.println("===================");

            for (Typer typer : rareContestant) {
                String typed = typer.getWordsTyped();
                String seles = "";

                if (typed.trim().equals(wordsToType)) {
                    seles = " (Selesai)";
                }

                System.out.printf("%s => %s%s\n", typer.getBotName(), typed, seles);
            }

        Thread.sleep(2000);

        }

    System.out.println("\nTyping Progress ...");
    System.out.println("===================");

    for (Typer typer : rareContestant) {
        String typed = typer.getWordsTyped();
        String suffix = "";

        if (typed.trim().equals(wordsToType)) {
            suffix = " (Selesai)";
        }

        System.out.printf("%s => %s%s\n", typer.getBotName(), typed, suffix);
    }
        // TODO (8)
        // Setelah semua typer selesai, tampilkan race standing setelah semua typer
        // selesai
        printRaceStanding();
        
    }

}
