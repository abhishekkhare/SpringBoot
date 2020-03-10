package markdownassets.domain;



import markdownassets.domain.pojo.MarkdownAssets;

import java.util.List;

public interface MarkdownAssetsService {

    List<MarkdownAssets> getAllAPIMarkdownAsset(String apiUuid);

    void saveAPIMarkdownAsset(MarkdownAssets markdownAssets);

}
