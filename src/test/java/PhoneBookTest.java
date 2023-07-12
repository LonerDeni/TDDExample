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

    @Test
    public void findContact() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        String phoneNum = "7999999999";
        String expected = "Sonya";
        phoneBook.add("Sonya","7999999999");
        // when:
        String result = phoneBook.findByNumber(phoneNum);
        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void findNoAddContact() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        String phoneNum = "7999999999";
        phoneBook.add("Ivan","79997776677");
        // when:
        String result = phoneBook.findByNumber(phoneNum);
        // then:
        Assertions.assertNull(result);
    }

    @Test
    public void findTwoNumContact() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        String phoneNum = "7999123488";
        String expected = "Ivan";
        phoneBook.add("Semen","7999999999");
        phoneBook.add("Ivan","7999123488");
        // when:
        String result = phoneBook.findByNumber(phoneNum);
        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void findTwoSameNumber() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        String phoneNum = "79991234455";
        String expected = "Anna";
        phoneBook.add("Anna","79991234455");
        phoneBook.add("Lena","79991234455");
        // when:
        String result = phoneBook.findByNumber(phoneNum);
        // then:
        Assertions.assertNotEquals(expected, result);
    }

    @Test
    public void findNumberContact() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        String name = "Sonya";
        String expected = "7999999999";
        phoneBook.add("Sonya","7999999999");
        // when:
        String result = phoneBook.findByName(name);
        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void findNoAddNumberContact() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        String phoneName = "Anna";
        phoneBook.add("Ivan","79997776677");
        // when:
        String result = phoneBook.findByName(phoneName);
        // then:
        Assertions.assertNull(result);
    }

    @Test
    public void findTwoNumberContact() {
        // given:
        PhoneBook phoneBook = new PhoneBook();
        String name = "Ira";
        String expected = "79997776677";
        phoneBook.add("Semen","7999999922");
        phoneBook.add("Ira","79997776677");
        // when:
        String result = phoneBook.findByNumber(name);
        // then:
        Assertions.assertEquals(expected, result);
    }
}