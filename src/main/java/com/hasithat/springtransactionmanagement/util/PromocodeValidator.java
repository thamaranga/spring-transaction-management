package com.hasithat.springtransactionmanagement.util;

import com.hasithat.springtransactionmanagement.exception.PromoCodeException;

import java.util.Arrays;
import java.util.List;

public class PromocodeValidator {

    public static void validatePromoCode(String promoCode) {
        List<String> promoCodes = Arrays.asList("3467hjdbf", "jdfhjke3786t", "7846hbfdh");
        if (!promoCodes.contains(promoCode)) {
            throw new PromoCodeException("Invalid Promocode !! Please verify before enter again");
        }
    }
}
