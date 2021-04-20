package com.Factory;

public class CardFactory {

    public Card getCard(String cardType){
        if(cardType == null){
            return null;
        }else if(cardType.equalsIgnoreCase("GIFTCARD")){
            return new GiftCard();
        }else if(cardType.equalsIgnoreCase("BONUS")){
            return new Bonus();
        }else if(cardType.equalsIgnoreCase("VOUCHER")){
            return new Voucher();
        }
        return null;
    }
}
