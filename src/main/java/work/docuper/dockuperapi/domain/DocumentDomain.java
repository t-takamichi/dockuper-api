package work.docuper.dockuperapi.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ドキュメントのドメイン
 */
@RequiredArgsConstructor
@Getter
public class DocumentDomain {
    private final String id;
    private final String title;
    private final String body;
}
