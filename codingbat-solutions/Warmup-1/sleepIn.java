public class sleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        }
        if (weekday == true && vacation == false) {
            return false;
        }
        if (weekday == false && vacation == true) {
            return true;
        }
        return true;
    }

}