package one.digitalinnovation.gof;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.PessoaFisica;
import one.digitalinnovation.gof.model.PessoaJuridica;
import one.digitalinnovation.gof.model.TesteDecorator;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author falvojr
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		Cliente cliente = new Cliente();
		//Testando Decorator

		ClienteService pessoaFisica = new PessoaFisica();
		ClienteService msgPessoaFisica = new TesteDecorator(new PessoaFisica());

		ClienteService pessoaJuridica = new PessoaJuridica();
		ClienteService msgPessoaJuridica = new TesteDecorator(new PessoaJuridica());

		System.out.println("\npFisica: Sem a mensagem");
		pessoaFisica.inserir(cliente);

		System.out.println("Agora com a mensagem:");
		msgPessoaFisica.inserir(cliente);


		System.out.println("\npJuridica: Sem a mensagem");
		pessoaJuridica.inserir(cliente);

		System.out.println("Agora com a mensagem:");
		msgPessoaJuridica.inserir(cliente);
	}

}
