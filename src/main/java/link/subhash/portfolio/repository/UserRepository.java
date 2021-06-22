package link.subhash.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import link.subhash.portfolio.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
   User findByUsername(String username); 
}
