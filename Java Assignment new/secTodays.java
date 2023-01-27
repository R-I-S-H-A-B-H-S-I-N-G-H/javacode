public class secTodays {

    static int secToday(int seconds) {
        return seconds / (60 * 60 * 24);
    }

    static int dayTosec(int days) {
        return days * 24 * 60 * 60;
    }

    static int secTohr(int seconds) {
        return seconds / (60 * 60);
    }

    static int hrTosec(int hr) {
        return hr * 60 * 60;
    }

    static int secTomin(int seconds) {
        return seconds / (60);
    }

    static int minTosec(int min) {
        return min * 60;
    }

    static void secToDHMS(int seconds) {
        int dy = 0, hr = 0, min = 0;

        dy = secToday(seconds);
        seconds -= dayTosec(dy);

        hr = secTohr(seconds);
        seconds -= hrTosec(hr);

        min = secTomin(seconds);
        seconds -= minTosec(min);

        System.out.println("day: " + dy + " hour: " + hr + " min :" + min + " sec : " + seconds);
    }

    public static void main(String[] args) {
        secToDHMS(60 * 60 * 24 + 61);
    }

}
