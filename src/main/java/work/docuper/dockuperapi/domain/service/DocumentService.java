package work.docuper.dockuperapi.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import work.docuper.dockuperapi.domain.object.DocumentDomain;
import work.docuper.dockuperapi.domain.object.DocumentSearchCriteria;
import work.docuper.dockuperapi.domain.repository.DocumentRepository;

import java.util.List;

/**
 * ドキュメントサービス
 */
@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;

    /**
     * ドキュメントの全件取得する
     *
     * @return ドキュメン情報のリストが返却される
     */
    public List<DocumentDomain> fetchAllDocument() {
        return documentRepository.findAll();
    }

    /**
     * ドキュメント検索
     *
     * @return パラメータの検索条件をもとにドキュメントを検索する
     */
    public List<DocumentDomain> searchDocument(DocumentSearchCriteria documentSearchCriteria) {
        return documentRepository.findByCriteria(documentSearchCriteria);
    }

    public DocumentDomain save(DocumentDomain documentDomain) {
        return documentRepository.save(documentDomain);
    }
}
