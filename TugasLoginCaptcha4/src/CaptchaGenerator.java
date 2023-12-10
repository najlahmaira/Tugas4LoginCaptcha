import java.util.Random;

public class CaptchaGenerator {
    public static String generateCaptcha() {
        Random rand = new Random();
        char[] captchaLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            char randChar = captchaLetters[rand.nextInt(captchaLetters.length)];
            captcha.append(randChar);
        }
        return captcha.toString();
    }
}
