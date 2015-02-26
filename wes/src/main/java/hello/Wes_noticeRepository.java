package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "wes_notice", path = "notice")
public interface Wes_noticeRepository extends PagingAndSortingRepository<wes_notice, Long> {

	

}
