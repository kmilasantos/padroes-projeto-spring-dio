package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.service.ClienteService;

public class TesteDecorator extends ClienteDecorator{

    public TesteDecorator(ClienteService decoratedCliente){
        super(decoratedCliente);
    }

    @Override
    public void inserir(Cliente cliente){
        decoratedClient.inserir(cliente);
        sendMessage(decoratedClient);

    }
    
    private void sendMessage(ClienteService decoratedCliente)
    {
        System.out.println("Isso aqui é um Decorator!");
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
