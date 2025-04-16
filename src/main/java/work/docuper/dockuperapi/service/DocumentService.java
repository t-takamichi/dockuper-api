package work.docuper.dockuperapi.service;

import org.springframework.stereotype.Service;
import work.docuper.dockuperapi.domain.DocumentDomain;

import java.util.List;

/**
 * ドキュメントサービス
 */
@Service
public class DocumentService {
    /**
     * ドキュメントの全件取得する
     *
     * @return ドキュメン情報のリストが返却される
     */
    public List<DocumentDomain> fetchAllDocument() {
        return null;
    }
}
