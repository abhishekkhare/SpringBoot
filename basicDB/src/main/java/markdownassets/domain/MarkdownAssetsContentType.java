package markdownassets.domain;

public enum MarkdownAssetsContentType {

  PNG("png", "image/png"),
  JPG("jpg", "image/jpeg"),
  JPEG("jpeg", "image/jpeg"),
  GIF("gif", "image/gif"),
  ICO("ico", "image/x-icon"),
  SVG("svg", "image/svg+xml"),
  HTML("html", "text/html"),
  CSS("css", "text/css"),
  JS("js", "application/javascript"),
  TTF("ttf", "font/ttf"),
  WOFF("woff", "font/woff"),
  WOFF2("woff2", "font/woff2"),
  OTF("otf", "font/otf");

  String extension;
  String contentType;

  private MarkdownAssetsContentType(String extension, String contentType) {
    this.extension = extension;
    this.contentType = contentType;
  }

  public String getExtension() {
    return extension;
  }

  public String getContentType() {
    return contentType;
  }

}
