package work.docuper.dockuperapi.domain.repository;


import work.docuper.dockuperapi.domain.object.DocumentDomain;
import work.docuper.dockuperapi.domain.object.DocumentSearchCriteria;

import java.util.List;

public interface DocumentRepository {
    List<DocumentDomain> findAll();
    List<DocumentDomain> findByCriteria(DocumentSearchCriteria criteria);
    DocumentDomain save(DocumentDomain documentDomain);
}
