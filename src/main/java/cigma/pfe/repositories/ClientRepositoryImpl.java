package cigma.pfe.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("client_save");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public boolean save(Client c) {
		entityManager.getTransaction().begin();
		entityManager.persist(c);
		entityManager.getTransaction().commit();
		System.out.println(
				"***********************************\n" + "Vous avez ajouter le client : \n" + "Id : " + c.getId() + "\n"
						+ "Nom :" + c.getName() + "\n" + "************************************");
		return true;
	}

	@Override
	public Client update(Client client) {
		entityManager.getTransaction().begin();
		Client clientActuel = entityManager.find(Client.class, client.getId());
		clientActuel.setName(client.getName());
		entityManager.persist(clientActuel);
		entityManager.getTransaction().commit();
		System.out.println(
				"***********************************\n" + "Vous avez modifier le client : \n" + "Id : " + clientActuel.getId() + "\n"
						+ "Nom :" + clientActuel.getName() + "\n" + "************************************");
		return null;
	}

	@Override
	public Client find(Long id) {
		entityManager.getTransaction().begin();
		Client clientActuel = entityManager.find(Client.class, id);
		entityManager.getTransaction().commit();
		System.out.println(
				"***********************************\n" + "Client Trouver : \n" + "Id : " + clientActuel.getId() + "\n"
						+ "Nom :" + clientActuel.getName() + "\n" + "************************************");
		return clientActuel;
	}

	@Override
	public void delete(Client c) {
		Client clientSupprimer = find(c.getId());
		System.out.println(
				"***********************************\n" + "Vous avez supprimer le client : \n" + "Id : " + clientSupprimer.getId() + "\n"
						+ "Nom :" + clientSupprimer.getName() + "\n" + "************************************");
		entityManager.remove(clientSupprimer);
	}

	public ClientRepositoryImpl() {

	}

}
