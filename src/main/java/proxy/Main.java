package proxy;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        FontProvider fontProvider = ProviderFactory.getFontProvider();
        Font font = fontProvider.getFont("test");
    }
}
