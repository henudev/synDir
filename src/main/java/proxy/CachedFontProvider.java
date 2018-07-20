package proxy;

import java.awt.*;
import java.util.Map;

/**
 * 静态代理.
 */
public class CachedFontProvider implements FontProvider {

    private FontProvider fontProvider;
    private Map<String, Font> cached;

    public CachedFontProvider(FontProvider fontProvider) {
        this.fontProvider = fontProvider;
    }


    public Font getFont(String name) {
        Font font = cached.get(name);
        if (font == null) {
            font = fontProvider.getFont(name);
            cached.put(name, font);
        }
        return font;
    }

}
