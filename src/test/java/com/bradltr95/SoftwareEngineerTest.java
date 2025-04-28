package com.bradltr95;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftwareEngineerTest {

    @Test
    void testEqualsAndHashCode() {
        SoftwareEngineer engineer1 = new SoftwareEngineer(1, "Alice", "Java, Spring");
        SoftwareEngineer engineer2 = new SoftwareEngineer(1, "Alice", "Java, Spring");
        SoftwareEngineer engineer3 = new SoftwareEngineer(2, "Bob", "Python, Django");

        assertEquals(engineer1, engineer2);
        assertNotEquals(engineer1, engineer3);
        assertEquals(engineer1.hashCode(), engineer2.hashCode());
        assertNotEquals(engineer1.hashCode(), engineer3.hashCode());
    }
}