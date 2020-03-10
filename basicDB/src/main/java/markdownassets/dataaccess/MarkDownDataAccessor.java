package markdownassets.dataaccess;

import markdownassets.domain.pojo.MarkdownAssets;

import java.util.List;

public interface MarkDownDataAccessor {
    List<MarkdownAssets> findAll(String apiUuid);

    MarkdownAssets save(MarkdownAssets markdownAssets);
}
