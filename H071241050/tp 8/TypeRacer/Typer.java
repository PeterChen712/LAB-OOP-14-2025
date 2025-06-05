package TypeRacer;

public class Typer extends Thread {
    private final String typerName;
    private int delayPerWord;
    private TypeRacer race;
    private String wordsToType;
    private String typedText = "";
    private boolean finished = false;
    private int typingDuration;

    public Typer(String typerName, int delayPerWord, TypeRacer race) {
        this.typerName = typerName;
        this.delayPerWord = delayPerWord;
        this.race = race;
    }

    public void setWordsToType(String wordsToType) {
        this.wordsToType = wordsToType;
    }

    public void setRace(TypeRacer race) {
        this.race = race;
    }

    public String getTypedText() {
        return typedText;
    }

    public boolean isFinished() {
        return finished;
    }

    public int getTypingDuration() {
        return typingDuration;
    }

    public String getTyperName() {
        return typerName;
    }

    @Override
    public void run() {
        String[] words = wordsToType.split(" ");
        long startTime = System.currentTimeMillis();

        for (String word : words) {
            typedText += word + " ";
            try {
                Thread.sleep(delayPerWord);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        typingDuration = (int) ((endTime - startTime) / 1000);
        finished = true;

        race.addResult(this);
    }
}


// package TypeRacer;

// class Typer extends Thread {
//     private String botName, wordsTyped;
//     private double wpm;
//     private TypeRacer typeRacer;
//     private long startTime;
//     private long endTime;

//     public Typer(String botName, double wpm, TypeRacer typeRacer) {
//         this.botName = botName;
//         this.wpm = wpm;
//         this.wordsTyped = "";
//         this.typeRacer = typeRacer;
//     }

//     public void setBotName(String botName) {
//         this.botName = botName;
//     }

//     public void setWpm(double wpm) {
//         this.wpm = wpm;
//     }

//     public void addWordsTyped(String newWordsTyped) {
//         this.wordsTyped += newWordsTyped + " ";
//     }

//     public String getWordsTyped() {
//         return wordsTyped.trim();
//     }

//     public String getBotName() {
//         return botName;
//     }

//     public double getWpm() {
//         return wpm;
//     }

//     public boolean isFinished() {
//         return endTime > 0;
//     }

//     public int getTypingDuration() {
//         return (int) ((endTime - startTime) / 1000);
//     }

//     @Override
//     public void run() {
//         String[] wordsToType = typeRacer.getWordsToType().split(" ");

//         // ✅ TODO (1) — hitung durasi per kata dalam ms
//         long howLongToType = (long) ((60.0 / wpm) * 1000); // dalam milidetik

//         // ✅ TODO (2) — ketik tiap kata berdasarkan jeda
//         startTime = System.currentTimeMillis();

//         for (String word : wordsToType) {
//             try {
//                 Thread.sleep(howLongToType);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             addWordsTyped(word);
//         }

//         endTime = System.currentTimeMillis();

//         addWordsTyped("(Selesai)");

//         // ✅ TODO (3) — tambahkan hasil ke klasemen
//         typeRacer.addResult(this);
//     }
// }
