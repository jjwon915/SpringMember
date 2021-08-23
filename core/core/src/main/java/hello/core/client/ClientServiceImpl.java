package hello.core.client;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository = new MemoryClientRepository();

    @Override
    public void join(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client findClient(Long id) {
        return clientRepository.findById(id);
    }
}
