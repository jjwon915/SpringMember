package hello.core.client;

import java.util.HashMap;
import java.util.Map;

public class MemoryClientRepository implements ClientRepository {

    private static Map<Long, Client> store = new HashMap<>();

    @Override
    public void save(Client client) {
        store.put(client.getId(), client);
    }

    @Override
    public Client findById(Long id) {
        return store.get(id);
    }

}
