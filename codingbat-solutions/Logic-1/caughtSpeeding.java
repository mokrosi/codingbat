public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int adjustedSpeed = isBirthday ? speed - 5 : speed;

        if (adjustedSpeed <= 60) {
            return 0;
        } else if (adjustedSpeed <= 80) {
            return 1;
        } else {
            return 2;
        }

    }  
}
