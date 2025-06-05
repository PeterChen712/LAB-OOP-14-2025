package TypeRacer;

public class Result {
    private final String name;
    private final int typingDuration;

    public Result(String name, int typingDuration) {
        this.name = name;
        this.typingDuration = typingDuration;
    }

    public String getName() {
        return name;
    }

    public int getTypingDuration() {
        return typingDuration;
    }
}


// package TypeRacer;

// class Result {
//     private String name;
//     private int finishTime;

//     public Result(String name, int finishTime) {
//         this.name = name;
//         this.finishTime = finishTime;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getFinishTime() {
//         return finishTime;
//     }

//     public void setFinishTime(int finishTime) {
//         this.finishTime = finishTime;
//     }
// }
