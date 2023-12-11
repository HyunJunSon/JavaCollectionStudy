package AdapterPattern;

public class PrintBanner implements Print {
//    public PrintBanner(String string) {
//        super(string);
//    }

    private Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithAster();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
