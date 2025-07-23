package work.docuper.dockuperapi.infrastructure.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import work.docuper.dockuperapi.domain.object.DocumentDomain;
import work.docuper.dockuperapi.domain.object.DocumentSearchCriteria;
import work.docuper.dockuperapi.domain.repository.DocumentRepository;
import work.docuper.dockuperapi.infrastructure.entity.DocumentEntity;
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

    @Override
    public DocumentDomain save(DocumentDomain documentDomain) {
        DocumentEntity documentEntity = DocumentEntity.builder()
                .title(documentDomain.getTitle())
                .body(documentDomain.getBody())
                .build();

        documentMapper.insertDocument(documentEntity);

        if (documentEntity.getDocumentId() != null) {
            return documentMapper.findByDocumentId(documentEntity.getDocumentId());
        }

        return null;
    }

}
