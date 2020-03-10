package markdownassets.controller.mapper;

import markdownassets.controller.dto.MarkdownAssetsDto;
import markdownassets.domain.pojo.MarkdownAssets;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component("markdownAssetDtoMapper")

public class MarkdownAssetsDtoMapper {

    public MarkdownAssetsDto fromDomain(MarkdownAssets MarkdownAssets) {
        MarkdownAssetsDto MarkdownAssetsDto = new MarkdownAssetsDto();
        if (MarkdownAssets != null) {
            BeanUtils.copyProperties(MarkdownAssets, MarkdownAssetsDto);
        }
        return MarkdownAssetsDto;
    }

    public List<MarkdownAssetsDto> fromDomain(List<MarkdownAssets> markdownAssetss) {
        if (markdownAssetss == null) {
            return new ArrayList<>();
        }

        List<MarkdownAssetsDto> list = new ArrayList<>(markdownAssetss.size());
        for (MarkdownAssets markdownAssets : markdownAssetss) {
            list.add(fromDomain(markdownAssets));
        }

        return list;
    }

    public MarkdownAssets toDomain(MarkdownAssetsDto MarkdownAssetsDto) throws IOException {
        MarkdownAssets MarkdownAssets = new MarkdownAssets();
        if (MarkdownAssetsDto != null) {
            BeanUtils.copyProperties(MarkdownAssetsDto, MarkdownAssets);
        }
        return MarkdownAssets;
    }
}