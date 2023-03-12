public class FindEmailDomain {
    public static String code(String email) {
        return email.substring(email.lastIndexOf("@")+1);
    }
}
