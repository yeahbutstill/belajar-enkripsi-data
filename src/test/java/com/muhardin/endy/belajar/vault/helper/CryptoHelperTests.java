package com.muhardin.endy.belajar.vault.helper;

import com.muhardin.endy.belajar.enkripsi.helper.CryptoHelper;
import org.junit.jupiter.api.Test;

public class CryptoHelperTests {
    
    @Test 
    public void testGenerateKey() throws Exception {
        String key = CryptoHelper.generateKey();
        System.out.println("AES Key : " + key);
    }
}
