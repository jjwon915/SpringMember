package hello.core.client;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryClientRepositoryTest {

    ClientService clientService = new ClientServiceImpl();

    @Test
    void save() {

        Client client = new Client(10L, "hello", "hello@gmail.com", Grade.SILVER);

        clientService.join(client);
        Client getClient = clientService.findClient(10L);

        Assertions.assertThat(client).isEqualTo(getClient);
    }
}