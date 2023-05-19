package repository;

import org.springframework.data.repository.CrudRepository;

import domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUserName(String username);
}
