import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void oneNumber() {
        // given:
        String name = "Ivan";
        String phoneNum = "7999999999";
        int expected = 1;
        // when:
        int result = PhoneBook.add(phoneNum, name);
        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void twoNumber() {
        // given:
        PhoneBook.add("7999999999", "Semen");
        String name = "Semen";
        String phoneNum = "79997778822";
        int expected = 1;
        // when:
        int result = PhoneBook.add(phoneNum, name);
        // then:
        Assertions.assertEquals(expected, result);
    }
}
