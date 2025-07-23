package work.docuper.dockuperapi.infrastructure.repository.mapper;

import org.apache.ibatis.annotations.*;
import work.docuper.dockuperapi.domain.object.DocumentDomain;
import work.docuper.dockuperapi.domain.object.DocumentSearchCriteria;

//import org.apache.ibatis.jdbc.SQL;

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
}
