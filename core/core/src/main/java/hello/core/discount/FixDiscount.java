package hello.core.discount;

import hello.core.client.Client;
import hello.core.client.ClientRepository;
import hello.core.client.Grade;
import hello.core.client.MemoryClientRepository;

public class FixDiscount implements Discount{

    private int discountPriceSilver = 500;
    private int discountPriceGold = 1000;

    @Override
    public int discount(Client client, int price) {

        if(client.getGrade() == Grade.GOLD){
            return discountPriceGold;
        } else if(client.getGrade() == Grade.SILVER){
            return discountPriceSilver;
        } else {
            return 0;
        }
    }
}
