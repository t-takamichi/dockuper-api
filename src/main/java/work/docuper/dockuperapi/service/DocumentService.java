package work.docuper.dockuperapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import work.docuper.dockuperapi.domain.DocumentDomain;
import work.docuper.dockuperapi.repository.DocumentMapper;

import java.util.List;

/**
 * ドキュメントサービス
 */
@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentMapper documentMapper;
    /**
     * ドキュメントの全件取得する
     *
     * @return ドキュメン情報のリストが返却される
     */
    public List<DocumentDomain> fetchAllDocument() {
        return documentMapper.findAll();
    }
}
