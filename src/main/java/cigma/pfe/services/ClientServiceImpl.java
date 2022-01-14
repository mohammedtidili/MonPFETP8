package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import lombok.Data;

@Data
public class ClientServiceImpl implements ClientService {

	ClientRepository clientRepository;

	@Override
	public boolean save(Client c) {

		System.out.println("Service Layer : ClientServiceImpl Level... ");

		return clientRepository.save(c);
	}

	@Override
	public Client modifier(Client c) {
		return clientRepository.update(c);
	}

	@Override
	public Client trouver(Long id) {

		return clientRepository.find(id);
	}

	@Override
	public void supprimer(Client c) {
		clientRepository.delete(c);

	}

	public ClientServiceImpl(ClientRepository clientRepository) {

		this.clientRepository = clientRepository;

	}

	public ClientServiceImpl() {

	}

}
