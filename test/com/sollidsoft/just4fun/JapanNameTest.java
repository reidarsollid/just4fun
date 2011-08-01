package com.sollidsoft.just4fun;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Reidar Sollid
 * Date: 01.08.11
 * Time: 19.50
 */
public class JapanNameTest {
    @Test
    public void testConvert() throws Exception {
        JapanName japanName = new JapanName("Reidar", "Sollid");
        String expectedString = "Shikukitekashi Arimotatakite";
        String actualString = japanName.convert();
        assertEquals(expectedString, actualString);

        JapanName japanNameNoChars = new JapanName("Åse", "Øster");
        String expectedName = "Kaoariku Keoarichikushi";
        String actualName = japanNameNoChars.convert();
        assertEquals(expectedName,actualName);
    }
}
