package com.fullcycle.admin.catalogo.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain() {
        Main main = new Main();
        Assertions.assertNotNull(main);
        Main.main(new String[]{});
    }
}
