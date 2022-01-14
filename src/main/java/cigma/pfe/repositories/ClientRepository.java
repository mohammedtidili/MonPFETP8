package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public interface ClientRepository {

	boolean save(Client c);
	Client update(Client c);
	void delete (Client c);
	Client find(Long id);

}
