package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testContact() {
        Contact contact = new Contact(
                "12345",
                "Taylor",
                "LaDuke",
                "1234567890",
                "123 Main Street");

        assertEquals("12345", contact.getContactId());
        assertEquals("Taylor", contact.getFirstName());
        assertEquals("LaDuke", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Taylor", "LaDuke",
                    "1234567890", "123 Main Street");
        });
    }

    @Test
    void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Taylor", "LaDuke",
                    "1234567890", "123 Main Street");
        });
    }

    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "TaylorTaylor", "LaDuke",
                    "1234567890", "123 Main Street");
        });
    }

    @Test
    void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "LaDuke",
                    "1234567890", "123 Main Street");
        });
    }

    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Taylor", "LaDukeSmith",
                    "1234567890", "123 Main Street");
        });
    }

    @Test
    void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Taylor", null,
                    "1234567890", "123 Main Street");
        });
    }

    @Test
    void testPhoneInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Taylor", "LaDuke",
                    "123456789", "123 Main Street");
        });
    }

    @Test
    void testPhoneNotDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Taylor", "LaDuke",
                    "12345ABCDE", "123 Main Street");
        });
    }

    @Test
    void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Taylor", "LaDuke",
                    null, "123 Main Street");
        });
    }

    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Taylor", "LaDuke",
                    "1234567890",
                    "1234567890123456789012345678901");
        });
    }

    @Test
    void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Taylor", "LaDuke",
                    "1234567890", null);
        });
    }
}