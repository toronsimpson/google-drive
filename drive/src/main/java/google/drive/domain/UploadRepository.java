package google.drive.domain;

import google.drive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "uploads", path = "uploads")
public interface UploadRepository
    extends PagingAndSortingRepository<Upload, Long> {}
