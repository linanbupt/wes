package hello.user;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cstor_user", path = "user")
public interface cstor_userRepository extends PagingAndSortingRepository<cstor_user, Long> {

	

}
