package work.docuper.dockuperapi.infrastructure.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import work.docuper.dockuperapi.domain.object.DocumentDomain;
import work.docuper.dockuperapi.domain.object.DocumentSearchCriteria;
import work.docuper.dockuperapi.domain.repository.DocumentRepository;
import work.docuper.dockuperapi.infrastructure.repository.mapper.DocumentMapper;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DocumentRepositoryImpl implements DocumentRepository {
    private final DocumentMapper documentMapper;
    @Override
    public List<DocumentDomain> findAll() {
        return documentMapper.findAll();
    }

    @Override
    public List<DocumentDomain> findByCriteria(DocumentSearchCriteria criteria) {
        return documentMapper.findByCriteria(criteria);
    }

}
