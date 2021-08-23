package hello.core.order;

import hello.core.client.Client;
import hello.core.client.ClientRepository;
import hello.core.client.MemoryClientRepository;
import hello.core.discount.Discount;
import hello.core.discount.FixDiscount;

public class OrderServiceImpl implements OrderService {

    private Discount discount = new FixDiscount();
    private ClientRepository clientRepository = new MemoryClientRepository();

    @Override
    public Order createOrder(Long id, String itemName, int itemPrice) {

        Client client = clientRepository.findById(id);
        int discountPrice = discount.discount(client, itemPrice);

        return new Order(id, itemName, itemPrice, discountPrice);
    }
}
