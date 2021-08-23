package hello.core.order;

import hello.core.client.Client;
import hello.core.client.ClientService;
import hello.core.client.ClientServiceImpl;
import hello.core.client.Grade;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    ClientService clientService = new ClientServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long idA = 10L;
        Long idB = 100L;

        Client clientA = new Client(idA, "clientA", "clientA@gmail.com", Grade.GOLD);
        Client clientB = new Client(idB, "clientB", "clientB@gmail.com", Grade.SILVER);

        clientService.join(clientA);
        clientService.join(clientB);

        Order orderA = orderService.createOrder(idA, "itemA", 10000);
        Order orderB = orderService.createOrder(idB, "itemB", 10000);

        Assertions.assertThat(orderA.getDiscountPrice()).isEqualTo(1000);
        Assertions.assertThat(orderB.getDiscountPrice()).isEqualTo(500);

    }
}