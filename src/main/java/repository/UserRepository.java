package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.dioProjectGradle.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
