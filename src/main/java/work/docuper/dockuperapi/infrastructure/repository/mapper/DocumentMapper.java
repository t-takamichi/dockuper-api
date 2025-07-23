package work.docuper.dockuperapi.infrastructure.repository.mapper;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import work.docuper.dockuperapi.domain.object.DocumentDomain;
import work.docuper.dockuperapi.domain.object.DocumentSearchCriteria;
import work.docuper.dockuperapi.infrastructure.entity.DocumentEntity;

import java.util.List;

@Mapper
public interface DocumentMapper {
    @Select("select * from document")
    List<DocumentDomain> findAll();

    @Results({
            @Result(property = "documentId", column = "documentId", id = true),
            @Result(property = "title", column = "title"),
            @Result(property = "body", column = "body"),
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at")
    })
    @SelectProvider(type = DocumentSqlProvider.class, method = "findByCriteriaSql")
    List<DocumentDomain> findByCriteria(DocumentSearchCriteria criteria);

    @InsertProvider(type = DocumentSqlProvider.class, method = "insertDocumentSql")
    @Options(useGeneratedKeys = true, keyProperty = "documentId") // 自動生成キーの設定は維持
    void insertDocument(DocumentEntity entity);


    @Results({
            @Result(property = "documentId", column = "documentId", id = true),
            @Result(property = "title", column = "title"),
            @Result(property = "body", column = "body"),
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at")
    })
    @Select("select * from document where documentId = #{id}")
    DocumentDomain findByDocumentId(Integer id);

}
