package net.springboot.javaguides.springbootmongodbcrud;




import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.springboot.javaguides.springbootmongodbcrud.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
