package hello.core.discount;

import hello.core.client.Client;

public interface Discount {

    int discount(Client client, int price);
}
