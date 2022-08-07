package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.service.ClienteService;

public abstract class ClienteDecorator implements ClienteService {

    protected ClienteService decoratedClient;

    public ClienteDecorator(ClienteService decoratedClient){
        this.decoratedClient = decoratedClient;
    }

    public void inserir(Cliente cliente) {
        decoratedClient.inserir(cliente);
    }
}
