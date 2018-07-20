package proxy;

public abstract class ProviderFactory {
    public static FontProvider getFontProvider() {
        return new CachedFontProvider(new FontProviderFromDisk());
    }
}
