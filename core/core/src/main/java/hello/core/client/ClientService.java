package hello.core.client;

public interface ClientService {

    void join(Client client);

    Client findClient(Long id);

}
