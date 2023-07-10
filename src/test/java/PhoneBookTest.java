import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void addContact() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        String name = "Ivan";
        String phoneNum = "7999999999";
        int expected = 1;
        // when:
        int result = phoneBook.add(name, phoneNum);
        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void contactAlreadyAdded() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Semen", "7999999999");
        String name = "Semen";
        String phoneNum = "79997778822";
        int expected = 1;
        // when:
        int result = phoneBook.add(name, phoneNum);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void addSecondContact() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Semen", "7999999999");
        String name = "Ivan";
        String phoneNum = "79997778822";
        int expected = 2;
        // when:
        int result = phoneBook.add(name, phoneNum);
        // then:
        Assertions.assertEquals(expected, result);
    }
}