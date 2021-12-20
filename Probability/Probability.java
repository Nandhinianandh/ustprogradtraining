public class Probability {
    String[] doubleToss = {"HH", "HT", "TH", "TT"};
    String[] singleToss = {"H", "T"};

    public double singleToss(String tossOutput) {
        int count = 0;
        if (tossOutput == "H" || tossOutput == "T") {
            for (int i = 0; i < singleToss.length; i++) {
                if (singleToss[i] == tossOutput) {
                    count++;
                }
            }
            return count / singleToss.length;
        } else
            throw new IllegalArgumentException("Not a valid Output");
    }

    public double doubleToss(String tossOutput) {
        int count = 0;
        if (tossOutput == "HH" || tossOutput == "TT" || tossOutput == "HT" || tossOutput == "TH" || tossOutput == "H" || tossOutput == "T") {

            for (int i = 0; i < doubleToss.length; i++) {
                if (doubleToss[i].contains(tossOutput)) {
                    count++;
                }
            }
            return count / doubleToss.length;
        } else
            throw new IllegalArgumentException("Not a valid Toss Output");

    }
}
