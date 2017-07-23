package sample;

/**
 * Created by aruff on 7/23/17.
 */
public class URLData {
    private String url = "http://cess.nyu.edu";
    private static final URLData urlData = new URLData();

    private URLData() {}

    public static URLData getInstance() {
        return urlData;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
