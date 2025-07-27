public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if ((cigars >= 40 && cigars <= 60) && (!isWeekend)) {
            return true;
        }
        if (isWeekend && cigars >= 40) {
            return true;
        }
        return false;
    }

}
