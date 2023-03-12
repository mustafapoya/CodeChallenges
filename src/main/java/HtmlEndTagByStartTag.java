public class HtmlEndTagByStartTag {
    public static String code(String value) {
        String [] parts = value.split(" ");

        return "</" + parts[0].substring(1) + (parts[0].endsWith(">") ? "" : ">");
    }
}
