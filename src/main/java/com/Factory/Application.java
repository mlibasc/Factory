package com.Factory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);
		CardFactory cardFactory = new CardFactory();

		Card card1 = cardFactory.getCard("GIFTCARD");
		card1.create();

		Card card2 = cardFactory.getCard("BONUS");
		card2.create();

		Card card3 = cardFactory.getCard("VOUCHER");
		card3.create();
	}

}
