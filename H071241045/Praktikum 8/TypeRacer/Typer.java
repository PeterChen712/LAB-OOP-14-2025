package TypeRacer;

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = ""; 
        this.typeRacer = typeRacer;
    }

    public void addWordsTyped(String newWord) {
        this.wordsTyped += newWord + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }   

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        long startTime = System.currentTimeMillis();
        double howLongToType = 60.0 / wpm;

        for (String word : wordsToType) {
            try {
                Thread.sleep((long) (howLongToType * 1000)); 

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.addWordsTyped(word);
        }

        this.addWordsTyped("(Selesai)");

        int finishTime = (int) ((System.currentTimeMillis() - startTime) / 1000);
        typeRacer.addResult(new Result(botName, finishTime));
    }
}
