package team7.Certifications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team7.Certifications.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


}
