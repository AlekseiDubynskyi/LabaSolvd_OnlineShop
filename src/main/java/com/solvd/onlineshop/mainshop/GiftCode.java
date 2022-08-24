package com.solvd.onlineshop.mainshop;

import java.util.Objects;

public class GiftCode {
    String giftCode;

    public GiftCode() {

    }

    public GiftCode(String giftCode) {
        this.giftCode = giftCode;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftCode giftCode1 = (GiftCode) o;
        return Objects.equals(giftCode, giftCode1.giftCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(giftCode);
    }
}
