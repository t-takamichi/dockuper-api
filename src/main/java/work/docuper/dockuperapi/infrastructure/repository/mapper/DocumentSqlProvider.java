package work.docuper.dockuperapi.infrastructure.repository.mapper;

import org.apache.ibatis.jdbc.SQL;
import work.docuper.dockuperapi.domain.object.DocumentSearchCriteria;

public class DocumentSqlProvider {

    /** テーブル名 */
    private static final String TABLE_NAME = "document";

    private static final String COL_DOCUMENT_ID = "documentId";
    private static final String COL_TITLE = "title";
    private static final String COL_BODY = "body";
    private static final String COL_CREATED_AT = "created_at";
    private static final String COL_UPDATED_AT = "updated_at";

    private String getAllColumns() {
        return String.join(", ",
                COL_DOCUMENT_ID,
                COL_TITLE,
                COL_BODY,
                COL_CREATED_AT,
                COL_UPDATED_AT
        );
    }

    public String findByCriteriaSql(DocumentSearchCriteria criteria) {
        return new SQL() {{
            SELECT(getAllColumns()); // ヘルパーメソッドで全カラムを取得
            FROM(TABLE_NAME);
            if (criteria.getId() != null) {
                WHERE(COL_DOCUMENT_ID + " = #{id}"); // 定数を使用
            }
            if (criteria.getTitle() != null && !criteria.getTitle().isEmpty()) {
                WHERE(COL_TITLE + " LIKE CONCAT('%', #{title}, '%')"); // 定数を使用
            }
            if (criteria.getBody() != null && !criteria.getBody().isEmpty()) {
                WHERE(COL_BODY + " LIKE CONCAT('%', #{body}, '%')"); // 定数を使用
            }

        }}.toString();
    }
}
