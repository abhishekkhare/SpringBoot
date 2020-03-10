package markdownassets.domain.pojo;

public class MarkdownAssets {


    private String uuid;


    private String tenantId;

    private String type;

    private String type_uuid;

    private String org;

    private String locale;

    private String parent_uuid;

    private String status;

    private String title;

    private String navtitle;

    private String markdown;

    private Integer order;

    public MarkdownAssets() {
    }

    public MarkdownAssets(String uuid, String tenantId, String type, String type_uuid, String org, String locale, String parent_uuid, String status, String title, String navtitle, String markdown, Integer order) {
        this.uuid = uuid;
        this.tenantId = tenantId;
        this.type = type;
        this.type_uuid = type_uuid;
        this.org = org;
        this.locale = locale;
        this.parent_uuid = parent_uuid;
        this.status = status;
        this.title = title;
        this.navtitle = navtitle;
        this.markdown = markdown;
        this.order = order;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_uuid() {
        return type_uuid;
    }

    public void setType_uuid(String type_uuid) {
        this.type_uuid = type_uuid;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getParent_uuid() {
        return parent_uuid;
    }

    public void setParent_uuid(String parent_uuid) {
        this.parent_uuid = parent_uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNavtitle() {
        return navtitle;
    }

    public void setNavtitle(String navtitle) {
        this.navtitle = navtitle;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "MarkdownAssets{" +
                "uuid='" + uuid + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", type='" + type + '\'' +
                ", type_uuid='" + type_uuid + '\'' +
                ", org='" + org + '\'' +
                ", locale='" + locale + '\'' +
                ", parent_uuid='" + parent_uuid + '\'' +
                ", status='" + status + '\'' +
                ", title='" + title + '\'' +
                ", navtitle='" + navtitle + '\'' +
                ", order=" + order +
                '}';
    }
}
