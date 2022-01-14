package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import lombok.*;

@Data
public class ClientController {

	ClientService clientService;

	public boolean save(Client c) {

		return clientService.save(c);

	}

	public Client modifier(Client c) {
		return clientService.modifier(c);
	}

	public Client trouver(Long id) {

		return clientService.trouver(id);
	}

	public void supprimer(Client c) {
		clientService.supprimer(c);

	}

	public ClientController() {
		System.out.println("je suis ici ClientController");
	}

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

}
