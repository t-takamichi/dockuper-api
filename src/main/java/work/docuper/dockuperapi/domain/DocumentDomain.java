package work.docuper.dockuperapi.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

/**
 * ドキュメントのドメイン
 */
@RequiredArgsConstructor
@Getter
public class DocumentDomain {
    private final Integer documentId;
    private final String title;
    private final String body;
    private final Date createdAt;
    private final Date updatedAt;
}
