package cigma.pfe.services;

import cigma.pfe.models.Client;

public interface ClientService {

	boolean save(Client c);
	Client modifier(Client c);
	void supprimer (Client c);
	Client trouver(Long id);

}
