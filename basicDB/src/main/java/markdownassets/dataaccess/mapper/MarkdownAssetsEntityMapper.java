package markdownassets.dataaccess.mapper;

import com.abhi.spring.edu.springboot.helper.DefaultMapperConfig;
import markdownassets.dataaccess.entity.MarkdownAssetsEntity;
import markdownassets.domain.pojo.MarkdownAssets;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface MarkdownAssetsEntityMapper {

    MarkdownAssets toDomain(final MarkdownAssetsEntity markdownAssetEntity);

    List<MarkdownAssets> toDomain(final Collection<MarkdownAssetsEntity> markdownAssetEntities);

    MarkdownAssetsEntity fromDomain(final MarkdownAssets markdownAsset);

    List<MarkdownAssetsEntity> fromDomain(final List<MarkdownAssets> markdownAssets);

}
