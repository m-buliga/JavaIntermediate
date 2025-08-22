package ShareData;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private static final ThreadLocal<WebDriver> TL = new ThreadLocal<>();
    private DriverManager() {}

    public static WebDriver get() { return TL.get(); }
    public static void set(WebDriver driver) { TL.set(driver); }
    public static void quit() {
        WebDriver d = TL.get();
        if (d != null) { d.quit(); TL.remove(); }
    }
}
