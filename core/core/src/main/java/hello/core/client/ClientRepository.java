package hello.core.client;

public interface ClientRepository {

    void save(Client client);

    Client findById(Long id);

}
